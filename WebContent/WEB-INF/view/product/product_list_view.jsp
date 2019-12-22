<jsp:include page="../include/header.jsp"></jsp:include>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">
<div class="row" >
<div class="col-md-12">
<h3>${page_heading} </h3>

<table class="table">
    <thead>
      <tr>
        <th>Id</th>
        <th>Product Name</th>
        <th>Product Title</th>
        <th>Price</th>
        <th>Color</th>
        <th>Model Number</th>
        <th>Model Name</th>
        <th>Category Name</th>
        <th>Sub Category Name</th>
        <th>Product Url</th>
              
             
      </tr>
    </thead>
    <tbody>
    
    <c:if test="${fn:length(product_list) > 0}">
	    <c:forEach items="${product_list }"  var="product" >
		    <tr>
		        <td><c:out  value="${product.id}" > </c:out></td>
		        <td><c:out  value="${product.name }" > </c:out></td>
		        <td><c:out  value="${product.title}" > </c:out></td>
		        <td><c:out  value="${product.price}" > </c:out></td>
		        <td><c:out  value="${product.color}" > </c:out></td>
		        <td><c:out  value="${product.model_number}" > </c:out></td>
		        <td><c:out  value="${product.model_name}" > </c:out></td>
		        <td><c:out  value="${product.category_id}" > </c:out></td>
		        <td><c:out  value="${product.sub_category_id}" > </c:out></td>
		        <td><c:out  value="${product.product_url}" > </c:out></td>
		                       
		    </tr>
	    
	    </c:forEach>
    </c:if>
    
    <c:if test="${fn:length(product_list) <= 0}">
    <tr><td colspan="12">There is no  product exist</td></tr>
    </c:if>
      
      
    </tbody>
  </table>

</div>
</div>
</div>
<jsp:include page="../include/footer.jsp"></jsp:include>
