<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home</title>
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
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><div class="form-group" align="center"></div></li>
					<li><a href="#"><span class="glyphicon glyphicon-earphone"></span>
							Hotline : (08)986463287</a></li>
					<li><a href="index1.jsp"><span
							class="glyphicon glyphicon-home"></span> Trang chủ</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-search"></span>
							Nhà tuyển dụng</a></li>
					<li><a href="#"><span
							class="glyphicon glyphicon-map-marker"></span> Việc làm theo tỉnh</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#"><span
							class="glyphicon glyphicon-log-out"></span>Đăng Ký <span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Cá nhân</a></li>
							<li><a href="#">Doanh nghiệp</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#"><span
							class="glyphicon glyphicon-log-in"></span>Đăng Nhập <span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Cá nhân</a></li>
							<li><a href="#">Doanh nghiệp</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container text-center">
		<div class="container">
			<div class="test">
				<ul class="nav navbar-nav">
					<li class="list-group-item list-group-item-success"><a
						href="#"><span class="glyphicon glyphicon-pushpin"></span> Xây
							dựng</a></li>
					<li class="list-group-item list-group-item-success"><a
						href="#"><span class="glyphicon glyphicon-pushpin"></span>
							Kinh doanh</a></li>
					<li class="list-group-item list-group-item-success"><a
						href="#"><span class="glyphicon glyphicon-pushpin"></span> Bán
							hàng</a></li>
					<li class="list-group-item list-group-item-success"><a
						href="#"><span class="glyphicon glyphicon-pushpin"></span> Lao
							động phổ thông</a></li>
					<li class="list-group-item list-group-item-success"><a
						href="#"><span class="glyphicon glyphicon-pushpin"></span> Tài
							chính/kế toán</a></li>
					<li class="list-group-item list-group-item-success"><a
						href="#"><span class="glyphicon glyphicon-pushpin"></span> Xem
							các ngành nghề khác</a></li>
				</ul>
			</div>
		</div>
		<div class="row">
			<h3 align="left">
				<span class="glyphicon glyphicon-briefcase"></span> Quản lý bản tin
				<span class="Success Label"></span>
			</h3>
			<br>
		</div>
		<div class="row">

			<div class="col-sm-2"></div>
			<div class="col-sm-2"></div>
			<div class="col-sm-2">
				<input class="form-control" placeholder="Nhập nội dung"
					id="inputdefault" type="text">
			</div>
			<div class="col-sm-2">
				<a href="#" role="button" class="btn btn-primary active navb-right">Tìm
				</a>
			</div>
			<div class="col-sm-2"></div>
			<div class="col-sm-2"></div>
		</div>
		<div class="row"></div>
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-10">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>STT</th>
							<th>Tiêu đề</th>
							<th>Nội dung</th>
							<th>Ngày đăng</th>
							<th>Duyệt tin</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td align="left">1</td>
							<td align="left">ABC</td>
							<td align="left">- Tư vấn, chăm sóc, giới thiệu sản phẩm cho
								khách hàng <br> - Sắp xếp sản phẩm, dọn vệ sinh cửa hàng <br>
								- Hỗ trợ công việc nhập hàng <br> - Kiểm tra và báo cáo số
								lượng tồn thực tế tại quầy để bổ sung hàng kịp thời <br> -
								Các công việc khác do Quản lý phân công
							</td>
							<td align="left">11/11/2016</td>
							<th><a href="DA_duyettin?ID=&key=0" role="button"
								class="btn btn-success"> Duyệt </a> <a
								href="DA_xoatin?ID=&key=0" role="button" class="btn btn-danger">Xóa</a></th>
						</tr>
						<tr>
							<td align="left">2</td>
							<td align="left">ABC</td>
							<td align="left">- Tư vấn, chăm sóc, giới thiệu sản phẩm cho
								khách hàng <br> - Sắp xếp sản phẩm, dọn vệ sinh cửa hàng <br>
								- Hỗ trợ công việc nhập hàng <br> - Kiểm tra và báo cáo số
								lượng tồn thực tế tại quầy để bổ sung hàng kịp thời <br> -
								Các công việc khác do Quản lý phân công
							</td>
							<td align="left">11/11/2016</td>
							<th><a href="DA_duyettin?ID=&key=0" role="button"
								class="btn btn-success"> Duyệt </a> <a
								href="DA_xoatin?ID=&key=0" role="button" class="btn btn-danger">Xóa</a></th>
						</tr>
						<tr>
							<td align="left">3</td>
							<td align="left">ABC</td>
							<td align="left">- Tư vấn, chăm sóc, giới thiệu sản phẩm cho
								khách hàng <br> - Sắp xếp sản phẩm, dọn vệ sinh cửa hàng <br>
								- Hỗ trợ công việc nhập hàng <br> - Kiểm tra và báo cáo số
								lượng tồn thực tế tại quầy để bổ sung hàng kịp thời <br> -
								Các công việc khác do Quản lý phân công
							</td>
							<td align="left">11/11/2016</td>
							<th><a href="DA_duyettin?ID=&key=0" role="button"
								class="btn btn-success"> Duyệt </a> <a
								href="DA_xoatin?ID=&key=0" role="button" class="btn btn-danger">Xóa</a></th>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-sm-1"></div>
			<br>
		</div>
	</div>
	<br>
	<footer class="container-fluid text-center">
		<img src="images/logo.jpg" class="img-rounded" alt="Cinque Terre"
			width="200" height="100">
	</footer>
</body>
</html>

