package com.litefeel.volleyext.requests;

import com.android.volley.Response;

import java.util.Map;

/**
 * Created by litefeel on 2017/12/24.
 */

public class StringRequest extends com.android.volley.toolbox.StringRequest {

    private final Map<String, String> params;

    public StringRequest(String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.GET, url, listener, errorListener);
        params = null;
    }

    public StringRequest(int method, String url, Map<String, String> data, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
        params = data;
    }

    @Override
    protected Map<String, String> getParams() {
        return params;
    }

}
