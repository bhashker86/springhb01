<jsp:include page="../include/header.jsp"></jsp:include>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">

<h3 style="color:#42a1f4" align="left"> ${page_heading} </h3>
<!-- --form body start -->

<div class="row">
<div class="col-md-6" >



<form:form class="form-horizontal" method="POST" action="../../customer/edit-customer-sbmt" modelAttribute="customer">

<form:hidden path="id"/>

<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4"  path="email">Email:</form:label>
      <div cssClass="col-sm-8">
        <form:input  cssClass="form-control"   path="email"/><br />
        
        <c:set  var="emailHasError"><form:errors path="email" /></c:set>
        <c:if test="${not empty emailHasError  }" >
	        <div >
	           <form:errors   path="email" cssClass="alert alert-danger" ></form:errors> 
	        </div>
        </c:if>
      </div>
</div>



<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4" path="first_name">First Name:</form:label>
      <div cssClass="col-sm-8">
       <form:input  cssClass="form-control"  path="first_name"  />
        <c:set var="first_nameHasError"><form:errors path="first_name" /></c:set>
        <c:if test="${not empty first_nameHasError}">
         <div>
           <form:errors path="first_name"  cssClass="alert alert-danger" />
         </div>
        </c:if>
       
      </div>
</div>


<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4" path="last_name">Last Name:</form:label>
      <div cssClass="col-sm-8">
        <form:input type="text" cssClass="form-control"  path="last_name" />
        <c:set var="last_nameHasError"><form:errors path="last_name"></form:errors> </c:set>
        <c:if test="${not empty last_nameHasError }" >
         <div>
            <form:errors path="last_name"    cssClass="alert alert-danger"     />
        </div>
        </c:if>
      </div>
</div>



<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4" path="gender">Gender:</form:label>
      <div cssClass="col-sm-8">
        <form:radiobutton  class="form-control"   path="gender" value="male"  label="Male" />
        <form:radiobutton class="form-control"   path="gender" value="female" label="female" />
        <c:set var="genderHasError"><form:errors path="gender"></form:errors> </c:set>
        <c:if test="${not empty genderHasError }" >
         <div>
            <form:errors path="gender"    cssClass="alert alert-danger"     />
        </div>
        </c:if>
      </div>
</div>



<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4"  path="age">Age:</form:label>
      <div cssClass="col-sm-8">
        <form:input  cssClass="form-control"  path="age" />
        <c:set var="ageHasError"><form:errors path="age"></form:errors> </c:set>
        <c:if test="${not empty ageHasError }" >
         <div>
            <form:errors path="age"    cssClass="alert alert-danger"     />
        </div>
        </c:if>
      </div>
</div>


<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4" path="mobile">Mobile:</form:label>
      <div cssClass="col-sm-8">
        <form:input  cssClass="form-control"  path="mobile" />
        <c:set var="mobileHasError"><form:errors path="mobile"></form:errors> </c:set>
        <c:if test="${not empty mobileHasError }" >
         <div>
            <form:errors path="mobile"    cssClass="alert alert-danger"     />
        </div>
        </c:if>
        
      </div>
</div>


<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4" path="description">Description:</form:label>
      <div cssClass="col-sm-8">
        <form:textarea   cssClass="form-control"   path="description"  />
        <c:set var="descriptionHasError"><form:errors path="description"></form:errors> </c:set>
        <c:if test="${not empty descriptionHasError }" >
         <div>
            <form:errors path="description"    cssClass="alert alert-danger"     />
        </div>
        </c:if>
        
      </div>
</div>


<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4" path="country">Country:</form:label>
      <div cssClass="col-sm-8">
       <form:select  path="country" cssClass="form-control">
	       <form:option value="0" label="--Select Country--" />
	       <form:options items="${country_list}" itemValue="id"  itemLabel="name"    />
       </form:select>
   
      </div>
</div>

<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4" path="city">City:</form:label>
      <div cssClass="col-sm-8">
        <form:input  cssClass="form-control"    path="city"  />
      </div>
</div>

<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4" path="postal_code">Postal Code:</form:label>
      <div cssClass="col-sm-8">
        <form:input  cssClass="form-control"  path="postal_code" />
      </div>
</div>


<div cssClass="form-group">
      <form:label cssClass="control-label col-sm-4" path="region">Region:</form:label>
      <div cssClass="col-sm-8">
        <form:input cssClass="form-control"  path="region"  />
      </div>
</div>
<div cssClass="form-group">
      <div cssClass="col-sm-4">
        <input type="Submit" cssClass="btn info" id="submit"   name="submit" value="Add Customer" />
      </div>
</div>




</form:form>
</div>
<div class="col-md-6" >
<img src="../assets/image/car.jpg"  height="100%" width="100%" size="200"></img>

</div>

</div>

</div>
<jsp:include page="../include/footer.jsp"></jsp:include>




