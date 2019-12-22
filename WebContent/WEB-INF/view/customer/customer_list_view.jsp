<jsp:include page="../include/header.jsp"></jsp:include>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">
<div class="row" >
<div class="col-md-8">
<p>${status} </p>
</div>
</div>

<table class="table">
    <thead>
      <tr>
        <th>Id</th>
        <th>First_name</th>
        <th>Last_name</th>
       
        <th>Age</th>
        <th>Gender</th>
        <th>Email</th>
        <th>City</th>
       
        <th>Country</th>
        <th>Mobile</th>
        <th>Postal Code</th>
        <th>Region</th>
        <th>Created At</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    
    <c:if test="${fn:length(customers_list) > 0}">
    <c:forEach items="${customers_list }"  var="customer" >
    <tr>
        <td><c:out  value="${customer.id}" > </c:out></td>
        <td><c:out  value="${customer.first_name }" > </c:out></td>
        <td><c:out  value="${customer.last_name}" > </c:out></td>
        <td><c:out  value="${customer.age }" > </c:out></td>
        <td><c:out  value="${customer.gender}" > </c:out></td>
        <td><c:out  value="${customer.email}" > </c:out></td>
        <td><c:out  value="${customer.city }" > </c:out></td>
        <td><c:out  value="${customer.country}" > </c:out></td>
        <td><c:out  value="${customer.mobile}" > </c:out></td>
        <td><c:out  value="${customer.postal_code}" > </c:out></td>
        <td><c:out  value="${customer.region }" > </c:out></td>
        <td><c:out  value="${customer.created_at }" > </c:out></td>
        <td>
             <a href="delete-customer/${customer.id}"   ><button class="btn .btn-danger" >Delete</button></a>
              <a href="edit-customer/${customer.id}"   ><button class="btn .btn-success" >Edit</button></a>
             
        </td>
                    
      </tr>
    
    </c:forEach>
    </c:if>
    
    <c:if test="${fn:length(customers_list) <= 0}">
    <tr><td colspan="12">There is no customer exist</td></tr>
    </c:if>
      
      
    </tbody>
  </table>

</div>
<jsp:include page="../include/footer.jsp"></jsp:include>
