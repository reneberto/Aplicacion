<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Creacion De clientes</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>




<body>





<div class="container">

    <c:if test="${pageContext.request.userPrincipal.name != null}">



       <form:form method="POST" modelAttribute="clienteForm" class="form-signin">
        <h2 class="form-signin-heading">Creacion de Clientes</h2>
        <spring:bind path="nombre">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="nombre" value="" class="form-control" placeholder="Nombre"
                            autofocus="true"></form:input>
                <form:errors path="nombre"></form:errors>
                 <form:input type="rut" path="rut" class="form-control" placeholder="Rut"
                            autofocus="true"></form:input>
                <form:errors path="rut"></form:errors>
                <form:input type="direccion" path="direccion" class="form-control" placeholder="Direccion"
                            autofocus="true"></form:input>
                <form:errors path="direccion"></form:errors>
            </div>
        </spring:bind>
		<span>${message}</span>
        <button class="btn btn-lg btn-primary btn-block" type="submit" value="Reset form">Submit</button>
		<a class="btn btn-lg btn-primary btn-block" href="/menu" role="button">Volver</a>
 
    </form:form>
          

    
    
      </c:if>
       <c:if test="${pageContext.request.userPrincipal.name == null}">
    <jsp:forward page="${contextPath}/login" />
    
	</c:if>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
