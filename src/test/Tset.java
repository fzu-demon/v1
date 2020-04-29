package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class Tset {
    public static void main(String[] args) {
        //Geturl.geturl();
        //test();
//        String s = "https://ww1.sinaimg.cn/large/610dc034ly1fjqw4n86lhj20u00u01kx.jpg";
//        System.out.println(s.substring(0,15));
//        System.out.println(s.substring(0,15).contains("ww"));
//        if (s.substring(0,15).contains("ww")){
//            System.out.println(222);
//        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.fluentPut("yang",123);
        jsonObject.fluentPut("chen",2131);
        System.out.println(jsonObject);
    }

    static void test(){
        JSONObject object = JSONObject.parseObject("{\"code\":200,\n" +
                "\"message\":\"成功!\",\n" +
                "\"result\":[\n" +
                "\t{\"id\":332,\"time\":\"2018-09-18 17:52:41\",\"img\":\"http://ww2.sinaimg.cn/large/610dc034gw1f7bm1unn17j20u00u00wm.jpg\"},\n" +
                "\t{\"id\":675,\"time\":\"2020-02-16 04:00:00\",\"img\":\"https://img.lijinshan.site/images/999cf7f9728b45deacc0740de53aaff1\"},\n" +
                "\t{\"id\":422,\"time\":\"2018-09-18 17:52:42\",\"img\":\"http://ww2.sinaimg.cn/large/7a8aed7bjw1f340c8jrk4j20j60srgpf.jpg\"},\n" +
                "\t{\"id\":204,\"time\":\"2018-09-18 17:52:40\",\"img\":\"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-15-17126482_115753765623699_4225645012014071808_n.jpg\"},\n" +
                "\t{\"id\":528,\"time\":\"2018-09-18 17:52:42\",\"img\":\"http://ww3.sinaimg.cn/large/7a8aed7bgw1exz7lm0ow0j20qo0hrjud.jpg\"},\n" +
                "\t{\"id\":239,\"time\":\"2018-09-18 17:52:40\",\"img\":\"http://ww3.sinaimg.cn/large/610dc034gw1fbou2xsqpaj20u00u0q4h.jpg\"},\n" +
                "\t{\"id\":484,\"time\":\"2018-09-18 17:52:42\",\"img\":\"http://ww1.sinaimg.cn/large/7a8aed7bjw1ezzaw04857j20p00gp40w.jpg\"},\n" +
                "\t{\"id\":296,\"time\":\"2018-09-18 17:52:41\",\"img\":\"http://ww4.sinaimg.cn/large/610dc034jw1f9469eoojtj20u011hdjy.jpg\"},\n" +
                "\t{\"id\":609,\"time\":\"2018-09-18 17:52:43\",\"img\":\"http://ww2.sinaimg.cn/large/7a8aed7bgw1eu4cwbv2a6j20zk0qo7dw.jpg\"},\n" +
                "\t{\"id\":29,\"time\":\"2018-09-18 17:52:39\",\"img\":\"http://ww1.sinaimg.cn/large/0065oQSqly1fsfq2pwt72j30qo0yg78u.jpg\"},\n" +
                "\t{\"id\":491,\"time\":\"2018-09-18 17:52:42\",\"img\":\"http://ww3.sinaimg.cn/large/7a8aed7bjw1ezplg7s8mdj20xc0m8jwf.jpg\"},\n" +
                "\t{\"id\":522,\"time\":\"2018-09-18 17:52:42\",\"img\":\"http://ww4.sinaimg.cn/large/7a8aed7bjw1eyaov0c9z4j20iz0sg40t.jpg\"},\n" +
                "\t{\"id\":668,\"time\":\"2019-01-04 04:00:02\",\"img\":\"https://ws1.sinaimg.cn/large/0065oQSqly1fytdr77urlj30sg10najf.jpg\"},\n" +
                "\t{\"id\":642,\"time\":\"2018-09-18 17:52:43\",\"img\":\"http://ww3.sinaimg.cn/large/7a8aed7bgw1eswencfur6j20hq0qodhs.jpg\"},\n" +
                "\t{\"id\":578,\"time\":\"2018-09-18 17:52:42\",\"img\":\"http://ww1.sinaimg.cn/large/7a8aed7bgw1evgwbi4o1oj20hq0qomzp.jpg\"},\n" +
                "\t{\"id\":194,\"time\":\"2018-09-18 17:52:40\",\"img\":\"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-29-17267498_392021674501739_8632065627013513216_n.jpg\"},\n" +
                "\t{\"id\":10,\"time\":\"2018-09-18 17:52:39\",\"img\":\"http://ww1.sinaimg.cn/large/0065oQSqgy1ftt7g8ntdyj30j60op7dq.jpg\"},\n" +
                "\t{\"id\":509,\"time\":\"2018-09-18 17:52:42\",\"img\":\"http://ww1.sinaimg.cn/large/610dc034gw1eyu8kqv2p6j20m80rsjuy.jpg\"},\n" +
                "\t{\"id\":218,\"time\":\"2018-09-18 17:52:40\",\"img\":\"http://7xi8d6.com1.z0.glb.clouddn.com/2017-02-23-16906361_1846962082218545_7116720067412230144_n.jpg\"},\n" +
                "\t{\"id\":57,\"time\":\"2018-09-18 17:52:39\",\"img\":\"http://ww1.sinaimg.cn/large/0065oQSqly1freprk6sd7j30sg15h7d2.jpg\"}]\n" +
                "}");
        List<String> images = JSON.parseArray(object.getJSONArray("result").toJSONString(),String.class);
        for (String s: images){
            System.out.println(s);
        }
    }

}
