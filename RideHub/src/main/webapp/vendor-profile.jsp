<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="vendor-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="no-bottom no-top zebra" id="content">
		<div id="top"></div>
		<section id="section-settings" class="bg-gray-100">
			<div class="container">
				<div class="row">
					<div class="col-lg-3 mb30">
						<div class="card p-4 rounded-5">
							<div class="profile_avatar">
								<div class="profile_img">
									<img src="vendorProfile/<%=v.getUpload_image()%>" alt="">
								</div>
								<div class="profile_name">
									<h4>

										<%=v.getName()%>
										<span class="profile_username text-gray"><%=v.getEmail()%></span>
									</h4>
								</div>
							</div>
							<div class="spacer-20"></div>
							<ul class="menu-col">
								<li><a href="account-dashboard.html"><i
										class="fa fa-home"></i>Dashboard</a></li>
								<li><a href="vendor-profile.jsp" class="active"><i
										class="fa fa-user"></i>My Profile</a></li>
								<li><a href="v-cp.jsp"><i class="fa fa-sign-out"></i>Change
										Password</a></li>
								<li><a href="account-booking.html"><i
										class="fa fa-calendar"></i>My Orders</a></li>
								<li><a href="account-favorite.html"><i
										class="fa fa-car"></i>My Favorite Cars</a></li>
								<li><a href="login.html"><i class="fa fa-sign-out"></i>Sign
										Out</a></li>
							</ul>
						</div>
					</div>

					<div class="col-lg-9">
						<div class="card p-4  rounded-5">
							<div class="row">
								<div class="col-lg-12">
									<form id="form-create-item" class="form-border"
										action="vendorController" method="post"
										enctype="multipart/form-data">
										<div class="de_tab tab_simple">

											<ul class="de_nav">
												<li class="active"><span>Profile</span></li>
											</ul>
											<div class="de_tab_content">
												<div class="tab-1">
													<div class="row">
														<div class="col-lg-8 mb20">
															<input type="hidden" name="id" value="<%=v.getVid()%>">
															<h5>Name</h5>
															<input type="text" name="name" id="username"
																value="<%=v.getName()%>" class="form-control" />
														</div>
														<div class="col-lg-8 mb20">
															<h5>Email Address</h5>
															<input class="form-control" id="email" name="email"
																type="email" value=<%=v.getEmail()%> readonly />

														</div>
														<div class="col-md-8 mb20">
															<h5>Contact</h5>
															<input type="text" name="contact" id="email_address"
																class="form-control" value="<%=v.getContact()%>" />
														</div>
														<div class="col-md-8 mb20">
															<h5>image</h5>
															<input class="form-control" name="image" id="subject"
								type="file">	</div>
													</div>
												</div>
											</div>
										</div>
										<input type="button" id="submit" class="btn-main"
											value="Update profile">
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>


	</div>
</body>
</html>