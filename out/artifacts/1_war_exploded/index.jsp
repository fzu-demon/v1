<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=450,maximum-scale=1.3,user-scalable=no">
	<link rel="icon" href="./image/001.ico" type="image/x-icon">
	<title>Mr.yang</title>
	<script src="js/jquery.min.js"></script>
	<style>
	body {
	  background: radial-gradient(200% 100% at bottom center, #f7f7b6, #e96f92, #75517d, #1b2947);
	  background: radial-gradient(220% 105% at top center, #1b2947 10%, #75517d 40%, #e96f92 65%, #f7f7b6);
	  background-attachment: fixed;
	  overflow: hidden;
	}

@keyframes rotate {
  0% {
    transform: perspective(400px) rotateZ(20deg) rotateX(-40deg) rotateY(0);
  }
  100% {
    transform: perspective(400px) rotateZ(20deg) rotateX(-40deg) rotateY(-360deg);
  }
}
.stars {
  transform: perspective(500px);
  transform-style: preserve-3d;
  position: absolute;
  bottom: 0;
  perspective-origin: 50% 100%;
  left: 50%;
  animation: rotate 90s infinite linear;
}

.star {
  width: 2px;
  height: 2px;
  background: #F7F7B6;
  position: absolute;
  top: 0;
  left: 0;
  transform-origin: 0 0 -300px;
  transform: translate3d(0, 0, -300px);
  backface-visibility: hidden;
}
.table{
	width: 400px;
	height: 90%;
	margin: 80px auto;
}
.table form{
	width: 100%;
}
.table .name{
	width: 280px;
	margin: 20px auto 30px auto;
	display: block;
	height: 30px;
	border-radius: 20px;
	border: none;
	background: rgba(0,0,0,0.2);
	text-indent: 0.5em;
}
.table .btn{
	width: 100px;
	height: 30px;
	background: rgba(0,0,0,0.1);
	border-radius: 8px;
	border: none;
	color: white;
	margin: 0 auto;
	display: block;
}
		#photo{
			margin-right: 100px;
			width: 400px;
			height: 200px;
		}

</style>

</head>
<body>

<%--<iframe frameborder="no" border="0" marginwidth="0" marginheight="0" width=330 height=86 src="//music.163.com/outchain/player?type=2&id=1406665350&auto=1&height=66">--%>
</iframe>

<div class="stars"></div>

<div class="table" >

	<h2 style="color: white;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;她惊艳了时光</h2>
	<div id="photo" style="background: url(image/1000141.jpg) no-repeat;background-size: 100%;opacity: 0.5;"></div>
	<form action="/getimage?method=getimage" method="post">
		<input type="submit" class="btn" value="获取妹子"/>
	</form>
	<br/>
	<form action="/love.html" method="get">
		<input type="submit" class="btn" value="我爱你"/>
	</form>
	<br/>
	<form action="/element.html" method="get">
		<input type="submit" class="btn" value="元素周期表"/>
	</form>
    <br/>
    <form action="/map.html" method="get">
        <input type="submit" class="btn" value="高中同学地图册"/>
    </form>
</div>

<script>
$(document).ready(function(){
  var stars=1000;  /*星星的密集程度，数字越大越多*/
  var $stars=$(".stars");
  var r=800;   /*星星的看起来的距离,值越大越远,可自行调制到自己满意的样子*/
  for(var i=0;i<stars;i++){
    var $star=$("<div/>").addClass("star");
    $stars.append($star);
  }
  $(".star").each(function(){
    var cur=$(this);
    var s=0.2+(Math.random()*1);
    var curR=r+(Math.random()*300);
    cur.css({ 
      transformOrigin:"0 0 "+curR+"px",
      transform:" translate3d(0,0,-"+curR+"px) rotateY("+(Math.random()*360)+"deg) rotateX("+(Math.random()*-50)+"deg) scale("+s+","+s+")"
       
    })
  })
})
</script>


</body>
</html>