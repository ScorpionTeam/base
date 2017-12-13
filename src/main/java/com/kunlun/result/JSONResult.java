package com.kunlun.result;

import com.alibaba.fastjson.JSONObject;

/**
 * Created on 2017/9/18.
 */
public class JSONResult {
    public static String fillResultString(final Integer status, final String message, final Object result){
        JSONObject jsonObject = new JSONObject(){{
            put("status", status);
            put("message", message);
            put("result", result);
        }};

        return jsonObject.toString();
    }
}
