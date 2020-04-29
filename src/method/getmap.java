package method;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;

/**
 * string to map, get value by trage
 * author:yzl
 * data:2020/4/27
 */
public class getmap {
    public static String Strtomap(String str,String targe){
        String result = null;
//        JSONObject parseObject = JSONArray.parseObject(str);
//        result = parseObject.getString(targe);
        JSONObject object = JSONObject.parseObject(str);
        result = object.getString(targe);
        return result;
    }

}
