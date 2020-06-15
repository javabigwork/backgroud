package com.ctgu.javakeshe.util;

import java.util.List;

public class separateUtils {

    public static List<Integer> separate(String buy){
        List<Integer> list=null;
        int len=buy.length();
        int begin=0,end=0;
        for(int i=0;i<len;i++){
            if((i==len-1)||(buy.charAt(i)==';')){
                end=i;
                list.add(Integer.getInteger((String) buy.subSequence(begin,end)));
                begin=end;
            }
        }
        return list;
    }
}
