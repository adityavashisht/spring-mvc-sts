<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="/WEB-INF/template/header.jsp"/>

<div class="container">
    <h3 class="page-header">Enter your name</h3>

    <form:form name="nameForm" id="nameForm" modelAttribute="nameForm" method="POST" action="">
        <div class="row">
            <div class="col-md-6">
                <form:input path="name" cssClass="form-control"/>
            </div>
            <div class="col-md-6">
                <input type="submit" value="Save" class="btn btn-success"/>
            </div>
        </div>


    </form:form>

</div>




<jsp:include page="/WEB-INF/template/footer.jsp"/>