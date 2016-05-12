<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Enigma Spa Salon | Services</title>
<meta charset="utf-8">
<link rel="stylesheet" href="resources/css/style.css">
<link rel="icon" href="resources/images/favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="resources/images/favicon.ico" type="image/x-icon">
<script src="resources/js/jquery.js"></script>
<script src="resources/js/jquery-migrate-1.1.1.js"></script>
<script src="resources/js/bgstretcher.js"></script>
<script>
function goPlaces(redirect) {
	document.getElementById("changeAction").action = redirect;
	document.getElementById("changeAction").submit();
}

$(document).ready(function () {
	// arrays to be sent to servlet
	var readings = new Array();
	var i=0
	<c:forEach var ="imgpath" items="${imagenes.imagePath}" >
		readings[i] = '${imgpath}';
		i++;
	</c:forEach>
		
    $('body').bgStretcher({
        images: readings,
        imageWidth: 1600,
        imageHeight: 964,
        resizeProportionally: true,
        slideDirection: 'N',
        slideShowSpeed: 1000,
        transitionEffect: 'fade',
        sequenceMode: 'normal',
        pagination: '#nav'
    });
    
});
/*
$(document).ready(function () {
    $('body').bgStretcher({
        images: ['images/slide-1.jpg'],
        imageWidth: 1600,
        imageHeight: 964,
        resizeProportionally: true
    });
});
*/
</script>
<!--[if lt IE 9]>   
<script src="js/html5shiv.js"></script>
<link href="css/ie.css" rel="stylesheet" type="text/css" media="screen">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:300" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:600" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:700" rel="stylesheet" type="text/css">  
<![endif]-->
</head>
<body>
<form id="changeAction" name="changeAction" action="act" method="get"></form>
<div class="extra-block">
  <div class="row-top">
    <div class="main">
      <ul class="list-soc">
        <li><a href="#"><img alt="" src="resources/images/soc-icon1.png"></a></li>
        <li><a href="#"><img alt="" src="resources/images/soc-icon2.png"></a></li>
      </ul>
    </div>
  </div>
  <header>
    <div class="row-nav">
      <div class="main">
        <h1 class="logo"><a href="index.jsp"><img alt="" src="resources/images/logo.png"></a></h1>
        <nav>
          <ul class="menu">
          	<li class="current"><a href="#" onclick="goPlaces('start');">Home</a></li>
            <li><a href="#" onclick="goPlaces('lugares');">Lugares</a></li>
            <li><a href="about-us.html">About Us</a></li>
            <li class="current"><a href="services.html">Services</a></li>
            <li><a href="gallery.html">Gallery</a></li>
            <li><a href="contacts.html">Contacts</a></li>
          </ul>
        </nav>
        <div class="clear"></div>
      </div>
    </div>
  </header>
  <section id="content">
  <div class="main-block">
    <div class="container_12">
      <div class="wrapper">
        <article class="grid_4">
          <figure class="img-rounded img-indent"><img src="resources/images/page3-img1.jpg" alt=""> </figure>
          <h4>Salon Services</h4>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris porta dapibus justo ut convallis. Curabitur nulla nunc, varius eget iaculis et, facilisis id magna. Nulla ut orci lectus, adipiscing interdum massa. Fusce lacinia enim rutrum turpis imperdiet vel.</p>
          <ul class="list">
            <li><a href="more.html">Cosmetic Application</a></li>
            <li><a href="more.html">Hair Services</a></li>
            <li><a href="more.html">Natural Nail Care</a></li>
            <li><a href="more.html">Combination Packages</a></li>
          </ul>
          <a href="more.html" class="button">More</a> </article>        
      </div>
    </div>
  </div>
  <section>
</div>
<div class="block">
  <footer>
    <div class="main aligncenter">
      <div class="privacy"><strong>Enigma Spa Salon &copy; 2045 | <a href="privacy-policy.html">Privacy Policy</a> | Design by: <a href="http://www.templatemonster.com">TemplateMonster.com</a></strong></div>
    </div>
  </footer>
</div>
</body>
</html>