<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="header.jsp"></jsp:include>
<meta charset="utf-8">
<title>NYC SHOP</title>

</head>
<body>    
	<!-- header -->
	<header id="header">
		<div class="container">
			<div class="row">
				<div id="logo" class="col-md-3 col-sm-12 col-xs-12">
					<h1>
						<a href="#"><img src='<c:url value = "/resources/img/home/logo1.png"/>'></a>						
						<nav><a id="pull" class="btn btn-danger" href="#">
							<i class="fa fa-bars"></i>
						</a></nav>			
					</h1>
				</div>
				<div id="search" class="col-md-5 col-sm-12 col-xs-12">
					<input type="text" name="text" value="Nhập từ khóa ...">
					<input type="submit" name="submit" value="Tìm Kiếm">
				</div>
				<div  class="col-md-2 col-sm-12 col-xs-12">
					<a id="dn" href="dangnhap/">Đăng nhập</a>
				</div>
				<div id="cart" class="col-md-2 col-sm-12 col-xs-12">
					<a class="display" href="#">Giỏ hàng</a>
					<a href="#">${Giohangs}</a>				    
				</div>
			</div>			
		</div>
	</header><!-- /header -->
	<!-- endheader -->

	<!-- main -->
	<section id="body">
		<div class="container">
			<div class="row">
				<div id="sidebar" class="col-md-3">
					<nav id="menu">
						<ul>
							<li class="menu-item">danh mục sản phẩm</li>
							
								<c:forEach var="listdssp" items="${listcate}">
									<li class="menu-item"><a href="#" title="">${listdssp.getCate_name()}</a></li>						
								</c:forEach>
												
						</ul>
						<!-- <a href="#" id="pull">Danh mục</a> -->
					</nav>
					<div id="banner-l" class="text-center">
						<div class="banner-l-item">
							<a href="#"><img src=<c:url value = "/resources/img/home/banner-l-1.png"/> alt="" class="img-thumbnail"></a>
						</div>
						<div class="banner-l-item">
							<a href="#"><img src=<c:url value = "/resources/img/home/banner-l-2.png"/> alt="" class="img-thumbnail"></a>
						</div>
						<div class="banner-l-item">
							<a href="#"><img src=<c:url value = "/resources/img/home/banner-l-3.png"/> alt="" class="img-thumbnail"></a>
						</div>
						<div class="banner-l-item">
							<a href="#"><img src=<c:url value = "/resources/img/home/banner-l-1.png"/> alt="" class="img-thumbnail"></a>
						</div>
						<div class="banner-l-item">
							<a href="#"><img src=<c:url value = "/resources/img/home/banner-l-1.png"/> alt="" class="img-thumbnail"></a>
						</div>
						<div class="banner-l-item">
							<a href="#"><img src=<c:url value = "/resources/img/home/banner-l-1.png"/> alt="" class="img-thumbnail"></a>
						</div>
						<div class="banner-l-item">
							<a href="#"><img src=<c:url value = "/resources/img/home/banner-l-1.png"/> alt="" class="img-thumbnail"></a>
						</div>
					</div>
				</div>

				<div id="main" class="col-md-9">
					<!-- main -->
					

					<div id="wrap-inner">
						<div id="product-info">
							<div class="clearfix"></div>
							<h3 id="tensp" data-id=${products.getProd_id() }>${products.getProd_name() }</h3>
							<div class="row">
								<div id="product-img" class="col-xs-12 col-sm-12 col-md-3 text-center">
									<img src='<c:url value = "/resources/img/home/${products.getProd_img()}"/>'>
								</div>
								<div id="product-details" class="col-xs-12 col-sm-12 col-md-9">
									<p id="gia" data-value="${products.getProd_price() }">Giá: <span class="price">${products.getProd_price() }</span></p>
									<p>Bảo hành: ${products.getProd_warranty() }</p> 
									<p>Phụ kiện: ${products.getProd_accessories() }</p>
									<p>Tình trạng: ${products.getProd_condition() }</p>
									<p>Khuyến mại: ${products.getProd_promotion() }</p>
									<p id="soluong" data-sl="${products.getProd_soluong() }">Còn:${products.getProd_soluong() } </p>
									<button class="btn-giohangg">Thêm vào giỏ hàng</button>
									<p class="add-cart text-center btn-giohangg"><a href="../giohang/">Đặt hàng online</a></p>
									
								</div>
							</div>							
						</div>
						<div id="product-detail">
							<h3>Chi tiết sản phẩm</h3>
							<p class="text-justify">${products.getProd_description() }</p>
						</div>
						<div id="comment">
							<h3>Bình luận</h3>
							<div class="col-md-9 comment">
								<form>
									<div class="form-group">
										<label for="email">Email:</label>
										<input required type="email" class="form-control" id="email" name="email">
									</div>
									<div class="form-group">
										<label for="name">Tên:</label>
										<input required type="text" class="form-control" id="name" name="name">
									</div>
									<div class="form-group">
										<label for="cm">Bình luận:</label>
										<textarea required rows="10" id="cm" class="form-control" name="content"></textarea>
									</div>
									<div class="form-group text-right">
										<button type="submit" class="btn btn-default">Gửi</button>
									</div>
								</form>
							</div>
						</div>
						<div id="comment-list">
							<c:forEach var="cmt" items="${listcmt}">
								<ul>
									<li class="com-title">
										${cmt.getCom_email() }
										<br>
										<span>2017-19-01 10:00:00</span>	
									</li>
									<li class="com-details">
										${cmt.getCom_content() }
									</li>
								</ul>
							</c:forEach>
							
						</div>
					</div>					
					<!-- end main -->
				</div>
			</div>
		</div>
	</section>
	<!-- endmain -->

	<!-- footer -->
	<footer id="footer">			
		<div id="footer-t">
			<div class="container">
				<div class="row">				
					<div id="logo-f" class="col-md-3 col-sm-12 col-xs-12 text-center">						
						<a href="#"><img src='<c:url value = "/resources/img/home/logo1.png"/>'></a>		
					</div>
					<div id="about" class="col-md-3 col-sm-12 col-xs-12">
						<h3>About us</h3>
						<p class="text-justify">Vietpro Academy thành lập năm 2009. Chúng tôi đào tạo chuyên sâu trong 2 lĩnh vực là Lập trình Website & Mobile nhằm cung cấp cho thị trường CNTT Việt Nam những lập trình viên thực sự chất lượng, có khả năng làm việc độc lập, cũng như Team Work ở mọi môi trường đòi hỏi sự chuyên nghiệp cao.</p>
					</div>
					<div id="hotline" class="col-md-3 col-sm-12 col-xs-12">
						<h3>Hotline</h3>
						<p>Phone Sale: (+84) 0988 550 553</p>
						<p>Email: sirtuanhoang@gmail.com</p>
					</div>
					<div id="contact" class="col-md-3 col-sm-12 col-xs-12">
						<h3>Contact Us</h3>
						<p>Address 1: B8A Võ Văn Dũng - Hoàng Cầu Đống Đa - Hà Nội</p>
						<p>Address 2: Số 25 Ngõ 178/71 - Tây Sơn Đống Đa - Hà Nội</p>
					</div>
				</div>				
			</div>
			<div id="footer-b">				
				<div class="container">
					<div class="row">
						<div id="footer-b-l" class="col-md-6 col-sm-12 col-xs-12 text-center">
							<p>Học viện Công nghệ Vietpro - www.vietpro.edu.vn</p>
						</div>
						<div id="footer-b-r" class="col-md-6 col-sm-12 col-xs-12 text-center">
							<p>© 2017 Vietpro Academy. All Rights Reserved</p>
						</div>
					</div>
				</div>
				<div id="scroll">
					<a href="#"><img src='<c:url value = "/resources/img/home/scroll.png"/>'></a>
				</div>	
			</div>
		</div>
	</footer>
	<!-- endfooter -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
