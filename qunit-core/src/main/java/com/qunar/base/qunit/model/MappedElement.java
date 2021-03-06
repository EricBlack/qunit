package com.qunar.base.qunit.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * User: zhaohuiyu
 * Date: 10/18/12
 */
public abstract class MappedElement {
    public abstract Map asMap();

    protected JSONArray getTags(List<String> tags) {
        JSONArray jsonArray = new JSONArray();
        if (tags != null && !tags.isEmpty()) {
            for (String tag : tags) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", tag);
                jsonArray.add(jsonObject);
            }
        }
        return jsonArray;
    }
}
