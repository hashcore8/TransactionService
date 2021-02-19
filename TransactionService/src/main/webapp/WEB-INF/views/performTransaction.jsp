<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Page</title>

<link rel="stylesheet" href="../css/transaction.css" type="text/css"></link>

<!-- <style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
}

.tg td {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}

.tg th {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}

.tg .tg-0lax {
	text-align: left;
	vertical-align: top
}
</style> -->
</head>
<body>


	<form:form method="POST" action="/transaction/makeTransaction"
		modelAttribute="transactionpojo">


		<table>
			<!-- <thead>
				<tr>
					<th class="tg-0lax">From Account</th>
					<th class="tg-0lax">To Account</th>
					<th class="tg-0lax">NAme of the Account to be Transferred</th>
					<th class="tg-0lax">Amount</th>
				</tr>
			</thead> -->
			<tbody>

				<tr>

					<td ><form:label path="from_Account">From Account</form:label></td>
					<td><form:input path="from_Account" /></td>
					<td><form:errors path="from_Account" cssClass="error" /></td>

				</tr>
				
				<tr>
				
					<td ><form:label path="to_Account">To Account</form:label></td>
					<td><form:input path="to_Account" /></td>
					<td><form:errors path="to_Account" cssClass="error" /></td>
				</tr>				
				
				<tr>
					<td ><form:label path="amount">Amount</form:label></td>
					<td><form:input path="amount" /></td>
					<td><form:errors path="amount" cssClass="error" /></td>
				
				</tr>
				
				<tr>
				
				
				    <td ><form:label path="transaction_type">transaction_type</form:label></td>
					<td><form:input path="transaction_type" /></td>
					<td><form:errors path="transaction_type" cssClass="error" /></td>
				</tr>
					

				<tr>
					<td><input type="submit" value="confirm"></td>

				</tr>
			</tbody>
		</table>




	</form:form>

</body>
</html>