<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="user-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="page-section mb-60">
		<div class="container">
			<div class="row">

				<div class="col-sm-8 col-md-10 col-lg-10 col-xs-10">
					<form action="UserController" method="post">

						<div class="login-form">

							<h4 class="login-title">new Password</h4>

							<%
							String msg = (String) request.getAttribute("msg");
							if (msg != null) {
							%>
							<%
							}
							%>
							<%
							String q = (String) request.getAttribute("q");
							%>

							
							<div class="row">
								<%
								String email = (String) request.getAttribute("email");
								%>
								<div class="col-md-8 mb-20">
									<input type="hidden" name="email" value="<%=email%>"> <input
										class="form-control valid" name="np" id="name" type="password"
										placeholder="New Password">
								</div>
								<div class="col-md-8 mb-20">
									<input class="form-control valid" name="cnp" id="name"
										type="password" placeholder="Confirm New Password">
								</div>
								<div class="col-12">
									<button class=" btn btn-primary mt-0" name="action"
										value="new_p">Change Password</button>

									
								</div>

							</div>


						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>