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

	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="images/2.jpg" alt="Image">
				<div class="carousel-caption">
					<h3>Get a Job $</h3>
					<p>Money Money.</p>
				</div>
			</div>

			<div class="item">
				<img src="images/3.jpg" alt="Image">
				<div class="carousel-caption">
					<h3>More Job</h3>

				</div>
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>

	<div class="container text-center">
		<div class="onimages">
			<div class="col-sm-2"></div>
			<div class="col-sm-1">
				<a href="#" role="button" class="btn btn-primary active navb-right">Tìm
					việc</a>
			</div>
			<div class="col-sm-2">

				<input class="form-control" placeholder="chức danh, vị trí, kỹ năng"
					id="inputdefault" type="text">
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
					<select name="city" id="city" class="form-control">
						<option value="">Tỉnh/Thành phố</option>
						<option value="1">TP Hà Nội</option>
						<option value="2">TP Hồ Chí Minh</option>
						<option value="3">An Giang</option>
						<option value="4">Bà Rịa - Vũng Tàu</option>
						<option value="5">Bắc Cạn</option>
						<option value="6">Bắc Giang</option>
						<option value="7">Bạc Liêu</option>
						<option value="8">Bắc Ninh</option>
						<option value="9">Bến Tre</option>
						<option value="10">Bình Định</option>
						<option value="11">Bình Dương</option>
						<option value="12">Bình Phước</option>
						<option value="13">Bình Thuận</option>
						<option value="14">Cà Mau</option>
						<option value="15">TP Cần Thơ</option>
						<option value="16">Cao Bằng</option>
						<option value="17">TP Đà Nẵng</option>
						<option value="65">Đắc Nông</option>
						<option value="18">Đăk Lăk</option>
						<option value="19">Điện Biên</option>
						<option value="20">Đồng Nai</option>
						<option value="21">Đồng Tháp</option>
						<option value="22">Gia Lai</option>
						<option value="24">Hà Giang</option>
						<option value="26">Hà Nam</option>
						<option value="28">Hà Tĩnh</option>
						<option value="29">Hải Dương</option>
						<option value="30">TP Hải Phòng</option>
						<option value="66">Hậu Giang</option>
						<option value="31">Hòa Bình</option>
						<option value="32">Hưng Yên</option>
						<option value="33">Khánh Hòa</option>
						<option value="34">Kiên Giang</option>
						<option value="35">KonTum</option>
						<option value="36">Lai Châu</option>
						<option value="37">Lâm Đồng</option>
						<option value="38">Lạng Sơn</option>
						<option value="39">Lào Cai</option>
						<option value="40">Long An</option>
						<option value="67">Lưu học sinh đang ở nước ngoài</option>
						<option value="41">Nam Định</option>
						<option value="42">Nghệ An</option>
						<option value="43">Ninh Bình</option>
						<option value="44">Ninh Thuận</option>
						<option value="45">Phú Thọ</option>
						<option value="46">Phú Yên</option>
						<option value="47">Quảng Bình</option>
						<option value="48">Quảng Nam</option>
						<option value="49">Quảng Ngãi</option>
						<option value="50">Quảng Ninh</option>
						<option value="51">Quảng Trị</option>
						<option value="52">Sóc Trăng</option>
						<option value="53">Sơn La</option>
						<option value="54">Tây Ninh</option>
						<option value="55">Thái Bình</option>
						<option value="56">Thái Nguyên</option>
						<option value="57">Thanh Hóa</option>
						<option value="58">Thừa Thiên Huế</option>
						<option value="59">Tiền Giang</option>
						<option value="60">Trà Vinh</option>
						<option value="61">Tuyên Quang</option>
						<option value="62">Vĩnh Long</option>
						<option value="63">Vĩnh Phúc</option>
						<option value="64">Yên Bái</option>
					</select>
				</div>

			</div>

			<div class="col-sm-1">

				<a href="#" role="button" class="btn btn-primary active navb-right"><span
					class="glyphicon glyphicon-search"></span></a>
			</div>

		</div>
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
				<span class="glyphicon glyphicon-briefcase"></span> việc làm CNTT
				tại Đà Nẵng <span class="Success Label"></span>
			</h3>
			<div class="col-sm-6">
				<h4 align="center">có 120 kết quả tìm kiếm</h4>
			</div>
			<div class="col-sm-6"></div>
			<br>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<h4>Vị trí tuyển dụng</h4>
			</div>
			<div class="col-sm-3">
				<h4>Khu vực</h4>
			</div>
			<div class="col-sm-3">
				<h4>Mức lương</h4>
			</div>
			<div class="col-sm-3">
				<h4>Hạn nạp HS</h4>
			</div>
			<br>
			<h3></h3>
		</div>
		<div class="row">
			<div class="pre-scrollable">
				<% for (int i=0;i<120;i++){ %>
				<div class="col-sm-3">
					<p>Lập trình viên</p>
				</div>
				<div class="col-sm-3">
					<p>Liên chiểu - Đà Nẵng</p>
				</div>
				<div class="col-sm-3">
					<p>7-10 triệu</p>
				</div>
				<div class="col-sm-3">
					<p>11/11/2016</p>
				</div>
				<% } %>
			</div>
		</div>
	</div>
	<br>

	<footer class="container-fluid text-center">
		<img src="images/logo.jpg" class="img-rounded" alt="Cinque Terre"
			width="200" height="100">
	</footer>

</body>
</html>

