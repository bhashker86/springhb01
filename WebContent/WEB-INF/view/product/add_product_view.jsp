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

<form:form method="POST" action="create-prodcut-sbmt" modelAttribute="product">
  
  
  <div class="form-group">
    <form:label path="name">Product Name</form:label>
    <form:input path="name" cssClass="form-control"  />
    <c:set var="hasNameErr"><form:errors   path="name" /></c:set>
    <div>
      <c:if test="${not empty hasNameErr}"><form:errors   path="name"  cssClass="alert alert-danger" /> </c:if>
    </div>
  </div>
  
  <div class="form-group">
    <form:label path="title">Product Title</form:label>
    <form:input path="title" cssClass="form-control"  />
    <c:set var="hasTitleErr"><form:errors   path="title" /></c:set>
    <div>
      <c:if test="${not empty hasTitleErr}"><form:errors   path="title"  cssClass="alert alert-danger" /> </c:if>
    </div>
  </div>
  
  <div class="form-group">
    <form:label path="price">Price</form:label>
    <form:input path="price" cssClass="form-control"  />
    <c:set var="hasPriceErr"><form:errors   path="price" /></c:set>
    <div>
      <c:if test="${not empty hasPriceErr}"><form:errors   path="price"  cssClass="alert alert-danger" /> </c:if>
    </div>
  </div>
  
  <div class="form-group">
    <form:label path="color">Color</form:label>
    <form:input path="color" cssClass="form-control"  />
    <c:set var="hasColorErr"><form:errors   path="color" /></c:set>
    <div>
      <c:if test="${not empty hasColorErr}"><form:errors   path="color"  cssClass="alert alert-danger" /> </c:if>
    </div>
  </div>
  <div class="form-group">
    <form:label path="model_number">Model Number </form:label>
    <form:input path="model_number" cssClass="form-control"  />
    <c:set var="hasModel_numberErr"><form:errors   path="model_number" /></c:set>
    <div>
      <c:if test="${not empty hasModel_numberErr}"><form:errors   path="model_number"  cssClass="alert alert-danger" /> </c:if>
    </div>
  </div>
  <div class="form-group">
    <form:label path="model_name">Model Name</form:label>
    <form:input path="model_name" cssClass="form-control"  />
    <c:set var="hasModel_nameErr"><form:errors   path="model_name" /></c:set>
    <div>
      <c:if test="${not empty hasModel_nameErr}"><form:errors   path="model_name"  cssClass="alert alert-danger" /> </c:if>
    </div>
  </div>
  
  <div class="form-group">
    <form:label path="category_id">Category Name</form:label>
    <form:select path="category_id" cssClass="form-control"  >
           <form:option value="0" label="--Select Category--" />
	       <form:options items="${category_list}" itemValue="id"  itemLabel="category"    />
    </form:select>
    <c:set var="hasCategoryErr"><form:errors   path="category_id" /></c:set>
    <div>
      <c:if test="${not empty hasCategoryErr}"><form:errors   path="category_id"  cssClass="alert alert-danger" /> </c:if>
    </div>
  </div>
  
<!--   <div class="form-group"> -->
<%--     <form:label path="category">Category Name</form:label> --%>
<%--     <form:input path="category" cssClass="form-control"  /> --%>
<%--     <c:set var="hasCategoryErr"><form:errors   path="category" /></c:set> --%>
<!--     <div> -->
<%--       <c:if test="${not empty hasCategoryErr}"><form:errors   path="category"  cssClass="alert alert-danger" /> </c:if> --%>
<!--     </div> -->
<!--   </div> -->
  
  <div class="form-group">
    <form:label path="product_url">Product Url</form:label>
    <form:input path="product_url" cssClass="form-control"  />
    <c:set var="hasProduct_urlErr"><form:errors   path="product_url" /></c:set>
    <div>
      <c:if test="${not empty hasProduct_urlErr}"><form:errors   path="product_url"  cssClass="alert alert-danger" /> </c:if>
    </div>
  </div>
  
  
    
  
 
  
  <div class="form-group">
  <input type="submit" name="submit" value="Add Product" class="btn btn-primary" />
  
  </div>
</form:form>

</div>
</div>





</div>

<jsp:include page="../include/footer.jsp"></jsp:include>
