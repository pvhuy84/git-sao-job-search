<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>việc làm theo tỉnh</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
 
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */
    .navbar {
      margin-bottom: 0;
      border-radius: 10;
    }
  /* .navbar-nav{
      background-color: #333;
} -->
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none;
    }
  }
  .tales {
  width: 100%;
}
.carousel-inner{
  width:100%;
  max-height: 400px !important;
}
.container text-center { background-color: #FF4455; }
.container text-center:hover { background-color: #000000; }
.carousel slide { 
   position: relative; 
   width: 100%; /* for IE 6 */
}

.collapse navbar-collapse{
background-color: #001155;
border-radius: 10;
}

.onimages { 

   position: relative; 
   margin: 5px;
   padding: 15px;
   left: 0; 
   width: 100%;
    
}
.row{
background-color: #f2f2f2;

}
.row h3	{

 border-style:solid	;
 border-bottom-color:#b3b3ff;
 border-top-color:#f2f2f2;
  border-right:#f2f2f2;
  border-left:#f2f2f2;
}
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
     
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><div class="form-group" align="center" >
     
      
      </div></li>
        <li><a href="#"><span class="glyphicon glyphicon-earphone"></span> Hotline : (08)986463287</a></li>
        <li><a href="index1.jsp"><span class="glyphicon glyphicon-home"></span> Trang chủ</a></li>
       <li><a href="#"><span class="glyphicon glyphicon-search"></span> Nhà tuyển dụng</a></li>
       <li><a href="#"><span class="glyphicon glyphicon-map-marker"></span> Việc làm theo tỉnh</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
       <li class="dropdown">
         
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-log-out"></span>Đăng Ký
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Cá nhân</a></li>
          <li><a href="#">Doanh nghiệp</a></li>
        </ul>
      </li>
       <li class="dropdown">
       
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-log-in"></span>Đăng Nhập
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Cá nhân</a></li>
          <li><a href="#">Doanh nghiệp</a></li>
        </ul>
      </li>
      </ul>
    </div>
  </div>
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="images/1.jpg" alt="Image">
        <div class="carousel-caption">
          <h3>Get a Job $</h3>
          <p>Money Money.</p>
        </div>
      </div>

      <div class="item">
        <img src="images/2.jpg" alt="Image">
        <div class="carousel-caption">
          <h3>More Job</h3>
          
        </div>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
  
<div class="container text-center">
<div class="onimages">
  <div class="col-sm-2">
  </div>
  <div class="col-sm-1">
   <a href="#" role="button" class="btn btn-primary active navb-right">Tìm việc</a>
  </div>
   <div class="col-sm-2">
 
    <input class="form-control" id="inputdefault" type="text">
   </div>
   <div class="col-sm-2">
   <div class="form-group">
         <select class="form-control" id="exampleSelect2">
         <option>Chọn ngành nghề</option>
         <option>Tất cả</option>
           <option>Hà nội</option>
           <option>IT_phần mềm</option>
           <option>IT_phần cứng</option>
           <option>Marketing</option>
           <option>Cơ khí</option>
           <option>Xây dựng</option>
        </select>
       </div>
   </div>
   <div class="col-sm-2">
    <div class="form-group">
         <select class="form-control" id="exampleSelect2" >
         <option>Chọn tỉnh thành</option>
          <option>Tất cả</option>
           <option>Hà nội</option>
           <option>Tp.HCM</option>
           <option>Đà Nẵng</option>
           <option>Cần Thơ</option>
           <option>Hải Phòng</option>
        </select>
       </div>
   
   </div>
     
   <div class="col-sm-1">
  
     <a href="#" role="button" class="btn btn-primary active navb-right"><span class="glyphicon glyphicon-search"></span></a>
   </div>
  
    </div>
      <div class="container">
   <div class="test">
      <ul class="nav navbar-nav">
        <li class="list-group-item list-group-item-success"><a href="#"><span class="glyphicon glyphicon-pushpin"></span> Xây dựng</a></li>
        <li class="list-group-item list-group-item-success"><a href="#"><span class="glyphicon glyphicon-pushpin"></span> Kinh doanh</a></li>
        <li class="list-group-item list-group-item-success"><a href="#"><span class="glyphicon glyphicon-pushpin"></span> Bán hàng</a></li>
       <li class="list-group-item list-group-item-success"><a href="#"><span class="glyphicon glyphicon-pushpin"></span> Lao động phổ thông</a></li>
       <li class="list-group-item list-group-item-success"><a href="#"><span class="glyphicon glyphicon-pushpin"></span> Tài chính/kế toán</a></li>
       <li class="list-group-item list-group-item-success"><a href="#"><span class="glyphicon glyphicon-pushpin"></span> Xem các ngành nghề khác</a></li>
      </ul>
     </div>
    </div>
  <div class="row">
  <h3>Việc làm theo tỉnh <span class = "Success Label"></span></h3>
    <div class="col-sm-6">
    
      <div id="home" class="tab-pane fade in active">
  <div class="pre-scrollable">
 <h4><span class="glyphicon glyphicon-map-marker"></span> <a href="#">Tp.Hồ Chí Minh <span class="badge">17</span></a></h4><br>
    <h4><span class="glyphicon glyphicon-map-marker"></span> <a href="#">Hà Nội <span class="badge">94</span></a></h4><br>
     <h4><span class="glyphicon glyphicon-map-marker"></span> <a href="#">Đà Nẵng <span class="badge">27</span></a></h4><br>
      <h4><span class="glyphicon glyphicon-map-marker"></span> <a href="#">Hải Phòng <span class="badge">125</span></a></h4><br>
   <h4><span class="glyphicon glyphicon-map-marker"></span> <a href="#">Cần Thơ <span class="badge">44</span></a></h4><br>
     <h4><span class="glyphicon glyphicon-map-marker"></span> <a href="#">Tp. Huế <span class="badge">33</span></a></h4><br>
   
     </div>
    </div>
    </div>
    <div class="col-sm-6">
     <div id="home" class="tab-pane fade in active">
  <div class="pre-scrollable">
   <h4><span class="glyphicon glyphicon-star"></span> <a href="#">Tây Bắc Bộ <span class="badge">25</span></a></h4><br>
    <h4><span class="glyphicon glyphicon-star"></span> <a href="#">Đông Bắc Bộ <span class="badge">63</span></a></h4><br>
     <h4><span class="glyphicon glyphicon-star"></span> <a href="#">Đồng bằng sông Hồng <span class="badge">65</span></a></h4><br>
      <h4><span class="glyphicon glyphicon-star"></span> <a href="#">Bắc Trung Bộ <span class="badge">23</span></a></h4><br>
   <h4><span class="glyphicon glyphicon-star"></span> <a href="#">Nam Trung Bộ <span class="badge">125</span></a></h4><br>
     <h4><span class="glyphicon glyphicon-star"></span> <a href="#">Tây Nguyên <span class="badge">89</span></a></h4><br>
     <h4><span class="glyphicon glyphicon-star"></span> <a href="#">Đông Nam Bộ <span class="badge">89</span></a></h4><br>
    <h4><span class="glyphicon glyphicon-star"></span> <a href="#">Đồng bằng sông Cửu Long <span class="badge">89</span></a></h4><br>
     </div>
    </div>
    </div>
    
  </div>
</div><br>

<footer class="container-fluid text-center">
   <img src="images/logo.jpg" class="img-rounded" alt="Cinque Terre" width="200" height="100">
</footer>

</body>
</html>

