package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Book;
import com.ctgu.javakeshe.entity.User;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.BookService;
import com.ctgu.javakeshe.service.UserService;
import com.ctgu.javakeshe.util.TencentCloud;
import com.ctgu.javakeshe.util.jsontomapUtil;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RequestMapping("user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    private String APPID = "wx1db424713c1d46cb";
    private String APPSecret = "a753e1f29af3e6884878fb14660591b5";
    TencentCloud tencentCloud = new TencentCloud();
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AjaxResult login(@RequestBody String code){
        StringBuilder url = new StringBuilder("https://api.weixin.qq.com/sns/jscode2session?");
        url.append("appid=");//appid设置
        url.append(APPID);
        url.append("&secret=");//secret设置
        url.append(APPSecret);
        url.append("&js_code=");//code设置
        url.append(code);
        url.append("&grant_type=authorization_code");
        Map<String, Object> map = null;
        try {
            HttpClient client = HttpClientBuilder.create().build();//构建一个Client
            HttpGet get = new HttpGet(url.toString());    //构建一个GET请求
            HttpResponse response = client.execute(get);//提交GET请求
            HttpEntity result = response.getEntity();//拿到返回的HttpResponse的"实体"
            String content = EntityUtils.toString(result);
            System.out.println(content);//打印返回的信息
            JSONObject res = JSONObject.fromObject(content);//把信息封装为json
            //把信息封装到map
            map = jsontomapUtil.parseJSON2Map(res);//这个小工具的代码在下面
        } catch (Exception e) {
            e.printStackTrace();
        }
        String key = "openid";
        String openId = (String) map.get(key);
        System.out.println(openId);
        User user = new User();
        user = userService.findById(openId);
        if(user == null){
            user = new User();
            user.setOpenId(openId);
            userService.creatUser(user);
        }else {
            userService.saveUser(user);
        }
        System.out.println(map);
        System.out.println(AjaxResult.success("成功",map));
        return AjaxResult.success("成功",map);
    }


}
