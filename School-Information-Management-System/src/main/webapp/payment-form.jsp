<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Student Payment</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue">
			<div>
				<a href="https://www.xadmin.net" class="navbar-brand"> Student Payment </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Payment</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${Payment != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${Payment== null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${Payment != null}">
            			Edit Payment
            		</c:if>
						<c:if test="${Payment == null}">
            			Add New Payment
            		</c:if>
					</h2>
				</caption>

				<c:if test="${payment != null}">
					<input type="hidden" name="id" value="<c:out value='${Payment.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Student ID</label> <input type="text"
						value="<c:out value='${payment.id}' />" class="form-control"
						name="id" required="required">
				</fieldset>
					
				<fieldset class="form-group">
					<label> Name</label> <input type="text"
						value="<c:out value='${payment.name}' />" class="form-control"
						name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Email</label> <input type="text"
						value="<c:out value='${payment.email}' />" class="form-control"
						name="email">
				</fieldset>

				<fieldset class="form-group">
					<label>Grade</label> <input type="text"
						value="<c:out value='${payment.grade}' />" class="form-control"
						name="grade">
				</fieldset>
				<fieldset class="form-group">
					<label> Fee</label> <input type="text"
						value="<c:out value='${payment.amount}' />" class="form-control"
						name="amount">
				</fieldset>
				
				
				<fieldset class="form-group">
					<label>Due Date</label> <input type="text"
						value="<c:out value='${payment.date}' />" class="form-control"
						name="date">
				</fieldset>
				
				<fieldset class="form-group">
				<label>Status</label>
   					 <select id="status" name="status">
      						<option value="paid">Paid</option>
      						<option value="no-paid">Not Paid</option>
                      </select>
                      
                  </fieldset>
				
		
				<button type="submit" class="btn btn-success">Save</button>
				</form>
				</form>
				
			</div>
		</div>
	</div>
</body>
</html>