<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link href="../bootstrap-3.2.0-dist/css/bootstrap.min.css"
	rel="stylesheet"> -->
<link
	href="/spring-boot-mvc/src/main/webapp/WEB-INF/jsp/PaymentMethodCss.css"
	rel="stylesheet">
<title>Debit Card Payment</title>
<script src="../jQuery/jquery-1.11.1.min.js"></script>
<script src="../bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="form-group col-lg-4">
		<c:form role="form" action="/checkdebit" class="form-inline"
			modelAttribute="deb">
			<table align="center" class="table">


				<tr id="tr">
					<td id="td">Enter Account Number:</td>
					<td id="td"><c:input type="text" path="accountNumber"
							name="accNo" placeholder="Card Number" size="12" /></td>
				</tr>

				<tr id="tr">
					<td id="td">Enter Card Number:</td>
					<td id="td"><c:input type="text" path="debitCardNum"
							name="cardNo" placeholder="Card Number" size="12" /></td>
				</tr>
				<tr id="tr">
					<td id="td">Enter CardHolder Name:</td>
					<td id="td"><c:input type="text" name="cardholderName"
							path="debitCardName" placeholder="Enter Name" /></td>
				</tr>
				<tr id="tr">
					<td id="td">Enter CVV Number:</td>
					<td id="td"><c:input type="text" name="cvvNo" path="debitCvv"
							placeholder="CVV Number" size="3" /></td>
				</tr>
				<tr id="tr">
					<td id="td">Enter Expiry Date:</td>
					<td id="td"><c:input type="Date" name="debitExp"
							path="debitExp" placeholder="Expiry Date" /></td>
				</tr>
				<tr id="tr">
					<td id="td"><button type="submit" value="login"
							class="btn btn-primary">SUBMIT</button></td>
				</tr>


			</table>
		</c:form>

	</div>

</body>

</html>