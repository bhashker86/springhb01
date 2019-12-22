<jsp:include page="../include/header.jsp"></jsp:include>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<div class="container">

<h3 style="color:#42a1f4" align="left"> ${page_heading} </h3>
<!-- --form body start -->
<div class="row">
<div class="col-md-6">
<p class=""><strong>${msg}</strong></p>

<c:set var="hasError_msg" >${err_msg}</c:set>
<c:if  test="${not empty hasError_msg }" >
 <p class="alert alert-danger">${err_msg}</p>
</c:if>

<form:form method="POST" action="add-sbmt" modelAttribute="category_ent">
  
  
  <div class="form-group">
    <form:label path="category">Category Name</form:label>
    <form:input path="category" cssClass="form-control"  />
    <c:set var="hasCategoryErr"><form:errors   path="category" /></c:set>
    <div>
      <c:if test="${not empty hasCategoryErr}"><form:errors   path="category"  cssClass="alert alert-danger" /> </c:if>
    </div>
  </div>
  
    
  
  <div class="form-group">
    <form:label path="preference">Category Preference</form:label>
    <form:input path="preference" cssClass="form-control"  />
    <c:set var="hasPreferenceErr"><form:errors   path="preference"/></c:set>
    <c:if test="${not empty hasPreferenceErr }"> <form:errors   path="preference"  cssClass="alert alert-danger" /> </c:if>
  </div>
  
  <div class="form-group">
  <input type="submit" name="submit" value="Add Category" class="btn btn-primary" />
  
  </div>
</form:form>

</div>
</div>





</div>

<jsp:include page="../include/footer.jsp"></jsp:include>
