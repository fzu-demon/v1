package method;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;

/**
 * str to List
 * author:yzl
 * data:2020/4/27
 */
public class getList {
    public static List<String> strtoList(String str){
        JSONObject object = JSONObject.parseObject(str);
        List<String> images = JSON.parseArray(object.getJSONArray("result").toJSONString(),String.class);
        return  images;
    }
}
