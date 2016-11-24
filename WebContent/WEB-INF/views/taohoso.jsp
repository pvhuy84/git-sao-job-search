<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/datepicker.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
 <script type="text/javascript">
 $(function(){
	   $('.datepicker').datepicker({
	      format: 'mm-dd-yyyy'
	    });
	});
        </script>
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
hr {
  -moz-border-bottom-colors: none;
  -moz-border-image: none;
  -moz-border-left-colors: none;
  -moz-border-right-colors: none;
  -moz-border-top-colors: none;
  border-color: #EEEEEE -moz-use-text-color #FFFFFF;
  border-style: solid none;
  border-width: 1px 0;
  margin: 18px 0;
}
.table-borderless tbody tr td, .table-borderless tbody tr th, .table-borderless thead tr th {
    border: none;
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
		<div class="" align="left">
			<hr>
			<h3>Tạo hồ sơ</h3>
		</div>
		<div class="taohoso" align="left">
			<div class="col-sm-3">
				<img src="images/nesson.jpg" class="img-rounded" alt="Cinque Terre"
					width="200" height="236">
			</div>
			<div class="row">
				<div class="col-sm-6">
					<table class='table table-borderless'>

						<tbody>
							<tr>
								<td>Họ Tên :</td>
								<td>Nguyễn Văn A</td>
							</tr>
							<tr>
								<td>Số điện thoại :</td>
								<td>01447534555</td>
							</tr>
							<tr>
								<td>Email :</td>
								<td>timviec@gmail.com</td>
							</tr>
						</tbody>
					</table>

				</div>
				<div class="col-sm-3"></div>
			</div>
		</div>
		<div class="row">
			<div class="thongtincanhan">

				<hr>
				<div class="taohoso" align="left">
					<div class="col-sm-3">
						<h4>Thông tin cá nhân</h4>
					</div>
					<div class="col-sm-6">
						<table class='table table-borderless'>

							<tbody>
								<tr>
									<td>Ngày sinh :</td>
									<td><input type="text" id="dp1" class="span2 datepicker"
										placeholder="Date..." name="date"> <br></td>
								</tr>
								<tr>
									<td>Giới tính :</td>
									<td>
										<div class="form-group">
											<select class="form-control" id="exampleSelect2">
												<option>Nam</option>
												<option>Nữ</option>
												<option>Khác</option>
											</select>
										</div>
									</td>
								</tr>
								<tr>
									<td>Tỉnh/Thành phố :</td>
									<td><select name="city" id="city" class="form-control">
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
									</select></td>
								</tr>
								<tr>
									<td>Địa chỉ :</td>
									<td><input class="form-control"
										placeholder="địa chỉ cụ thể" id="inputdefault" type="text"></td>
								</tr>

							</tbody>
						</table>

					</div>
					<div class="col-sm-3"></div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="thongtincanhan">

				<hr>
				<div class="taohoso" align="left">
					<div class="col-sm-3">
						<h4>Thông tin chung :</h4>
					</div>
					<div class="col-sm-6">
						<table class='table table-borderless'>

							<tbody>
								<tr>
									<td>Trình độ :</td>
									<td><select class="form-control" id="exampleSelect2">
											<option>Đại học</option>
											<option>Cao Đẳng</option>
											<option>Trung cấp</option>
											<option>THPT</option>
									</select></td>
								</tr>
								<tr>
									<td>Kinh nghiệm :</td>
									<td><select class="form-control" id="exampleSelect2">
											<option>1 năm</option>
											<option>2 năm</option>
											<option>3 năm</option>
											<option>5 năm</option>
									</select></td>
								</tr>
								<tr>
									<td>Chức vụ mong muốn :</td>
									<td><select class="form-control" id="exampleSelect2">
											<option>Nhân viên</option>
											<option>Trưởng phòng</option>
											<option>Trưởng nhóm</option>
									</select></td>
								</tr>
								<tr>
									<td>Ngành nghề :</td>
									<td><select class="form-control" id="exampleSelect2">
											<option>Công nghệ thông tin</option>
											<option>Marketing</option>
											<option>Xây dựng</option>
											<option>Cơ khí</option>
									</select></td>
								</tr>
								<tr>
									<td>Mức lương mong muốn :</td>
									<td><select class="form-control" id="exampleSelect2">
											<option>dưới 5 Triệu</option>
											<option>Từ 5 Triệu -> 8 Triệu</option>
											<option>Từ 8 Triệu -> 11 Triệu</option>
											<option>Từ 11 Triệu -> 15 Triệu</option>
											<option>Trên 15 Triệu</option>
									</select></td>
								</tr>
								<tr>
									<td>Nơi làm việc mong muốn :</td>
									<td><select class="form-control" id="exampleSelect2">
											<option>Hà Nội</option>
											<option>Tp.HCM</option>
											<option>Đà Nẵng</option>
											<option>Hải Phòng</option>
											<option>Cần Thơ</option>
									</select></td>
								</tr>
								<tr>
									<td><a href="#" role="button"
										class="btn btn-primary active navb-right">Lưu</a></td>
								</tr>
							</tbody>
						</table>

					</div>
					<div class="col-sm-3"></div>
				</div>
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

