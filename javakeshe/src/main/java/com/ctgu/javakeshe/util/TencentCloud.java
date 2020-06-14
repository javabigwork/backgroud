package com.ctgu.javakeshe.util;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;

import java.io.File;
import java.util.UUID;

public class TencentCloud {
    private static final String secretId = "AKIDDQOp8CMjHchVigsP8QU6RWL1a0FHMqQq";
    private static final String secretKey = "OFqOgmb9TXKrXwsZzED2jdIRJut88tUy";
    private static final String localHost = "https://bucket-1259702869.cos.ap-chengdu.myqcloud.com";
    public static String Upload(String localPackge,String localFilePath){
        COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
        Region region = new Region("ap-chengdu");
        ClientConfig clientConfig = new ClientConfig(region);
        COSClient cosClient = new COSClient(cred, clientConfig);
        File localFile = new File(localFilePath);
        String bucketName = "bucket-1259702869";
        String key = localPackge+"/"+ UUID.randomUUID()+localFile.getName().substring(localFile.getName().lastIndexOf("."));
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, localFile);
        PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
        return localHost+"/"+key;
    }
}
