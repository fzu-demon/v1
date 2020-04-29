package method;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * get image url
 * author:yzl
 * data:2020/4/27
 */
public class Geturl {
    public static List<String> geturl(){
        List<String> url = new ArrayList<>();
        String url_String = PostUrl.sendPost("https://api.apiopen.top/getImages","");
        String code = getmap.Strtomap(url_String,"code");
        if (code.equals("200")){
            List<String> images = getList.strtoList(url_String);
            for (String s : images){
                String imageurl = getmap.Strtomap(s,"img");
                if (imageurl.substring(0,15).contains("ww")) {
                    url.add(imageurl);
                }
            }
        }
        else {
            return url;
        }
        return url;
    }


}
