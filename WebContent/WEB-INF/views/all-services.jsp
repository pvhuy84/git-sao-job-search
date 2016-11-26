<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Services</title>
        <link rel="stypesheet" href="css/bootstrap.css">
        <style type="text/css">
        	a{
        		color: #blue;
			    text-decoration: none;
			}
        </style>
        <script>
            $(document).ready(function() {
               
            });
        </script>
    </head>

    <body>
        <div>
            <div class="services">
            	<ul><p>Services:</p>
            		<li>Đăng nhập (@FormParam("email"), @FormParam("password")): 
            			<a href="<%=request.getContextPath()+"/services/user/checkuser"%>">
            				<%=request.getContextPath()+"/services/user/checkuser"%>
            			</a>
            		</li>
            		<li>Đăng ký cho ứng viên (@FormParam("email"), @FormParam("password"), @FormParam("fullname"), @FormParam("phonenumber")): 
            			<a href="<%=request.getContextPath()+"/services/user/adduserjobseeker"%>">
            				<%=request.getContextPath()+"/services/user/adduserjobseeker"%>
            			</a>
            		</li>
            		<li>Đăng ký cho nhà tuyển dụng (@FormParam("email"), @FormParam("password"), @FormParam("name"), @FormParam("detail"), @FormParam("address"), @FormParam("provinceId"), @FormParam("phonenumber"), @FormParam("website"), @FormParam("scale")): 
            			<a href="<%=request.getContextPath()+"/services/user/adduserrecruiter"%>">
            				<%=request.getContextPath()+"/services/user/adduserrecruiter"%>
            			</a>
            		</li>
            		<li>Danh sách các tỉnh thành phố: 
            			<a href="<%=request.getContextPath()+"/services/province/getallprovice"%>">
            				<%=request.getContextPath()+"/services/province/getallprovice"%>
            			</a>
            		</li>
            		<li>Lấy danh sách quận huyện (@QueryParam("provinceid") ex:01): 
            			<a href="<%=request.getContextPath()+"/services/district/getlistdistrict?provinceid=?"%>">
            				<%=request.getContextPath()+"/services/district/getlistdistrict?provinceid=?"%>
            			</a>
            		</li>
            		
            	</ul>
            </div>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    </body>
</html>