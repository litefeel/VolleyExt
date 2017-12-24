package com.litefeel.volleyext.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Created by litefeel on 2017/12/24.
 */

public class QueryStringUtil {

    /**
     * 生成QueryString,以 a=1&b=2形式返回
     */
    public static String fromMap(Map<String, String> map) {
        return fromMap(map, "utf-8");
    }

    /**
     * 生成QueryString,以 a=1&b=2形式返回
     */
    public static String fromMap(Map<String, String> map, String charset) {
        StringBuilder sb = new StringBuilder();
        String value;
        try {
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    value = "";
                    value = entry.getValue();
                    if (value == null || value.length() == 0) {
//                    if (StringUtils.isEmpty(value)) {
                        value = "";
                    } else {
                        value = URLEncoder.encode(value, charset);
                    }
                    sb.append(entry.getKey()).append("=").append(value)
                            .append("&");
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
