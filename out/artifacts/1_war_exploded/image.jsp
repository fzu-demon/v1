<%--
  Created by IntelliJ IDEA.
  User: 杨忠燎
  Date: 2020/4/28
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta name="viewport" content="width=600,maximum-scale=1.3,user-scalable=no">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无人之岛</title>
    <link rel="icon" href="./image/001.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="css/css.css">
    <script type="text/javascript" src="./js/jquery.min.js"></script>
    <script type="text/javascript" src="./js/ZoomPic.js"></script>
    <script type="text/javascript">
        $(function(){

            new ZoomPic("jswbox");

        })
    </script>
    <style type="text/css">
        .table .btn{
            width: 200px;
            height: 45px;
            background: rgba(0,0,0,0.1);
            border-radius: 10px;
            border: none;
            color: white;
            margin: 0 auto;
            display: block;
            left: 50%;
        }
        .table{
            width: 600px;
            height: 500px;
        }
    </style>
    <meta name="referrer" content="never">
</head>
<body bgcolor="#e77c8e">
    <div class="table" id="jswbox" align="center">
        <pre class="prev">prev</pre>
        <pre class="next">next</pre>
        <ul>
            <c:forEach items="${urls}" var="url">
                <li><img  src="${url}" /></li>
            </c:forEach>
        </ul>
        <form action="/getimage?method=getimage" method="post" class="tt">
            <input type="submit" class="btn" value="再来一波" align="left"/>
        </form>
        <br/>
        <form action="/index.jsp" method="post" class="tt">
            <input type="submit" class="btn" value="返回主页面" align="left"/>
        </form>
    </div>
</body>
</html>

