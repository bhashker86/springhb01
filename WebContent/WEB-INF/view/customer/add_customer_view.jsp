<jsp:include page="../include/header.jsp"></jsp:include>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">

<h3 style="color:#42a1f4" align="left"> ${page_heading} </h3>
<!-- --form body start -->

<div class="row">
<div class="col-md-6" >
<form class="form-horizontal" method="POST" action="add-customer">

<div class="form-group">
      <label class="control-label col-sm-4" for="email">Email:</label>
      <div class="col-sm-8">
        <input type="email" class="form-control"  id="email"  path="email"  name="email" />
      </div>
</div>


<div class="form-group">
      <label class="control-label col-sm-4" for="first_name">First Name:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control"  id="email"  path="first_name" name="first_name" />
      </div>
</div>


<div class="form-group">
      <label class="control-label col-sm-4" for="last_name">Last Name:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control"  id="last_name"  path="last_name" name="last_name" />
      </div>
</div>



<div class="form-group">
      <label class="control-label col-sm-4" for="gender">Gender:</label>
      <div class="col-sm-8">
        Male<input type="radio" class="form-control"  id="last_name"   name="gender" value="male" />
       Female<input type="radio" class="form-control"  id="last_name"   name="gender" value="female" />
      </div>
</div>



<div class="form-group">
      <label class="control-label col-sm-4" for="age">Age:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control"  id="age"  path="age"  name="age" />
      </div>
</div>


<div class="form-group">
      <label class="control-label col-sm-4" for="mobile">Mobile:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control"  id="mobile"  path="mobile"  name="mobile" />
      </div>
</div>


<div class="form-group">
      <label class="control-label col-sm-4" for="description">Description:</label>
      <div class="col-sm-8">
        <textarea   class="form-control"  id="description"  path="description" name="description" ></textarea>
      </div>
</div>


<div class="form-group">
      <label class="control-label col-sm-4" for="country">Country:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control"  id="country"  path="country"  name="country" />
      </div>
</div>

<div class="form-group">
      <label class="control-label col-sm-4" for="city">City:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control"  id="city"  path="city"  name="city" />
      </div>
</div>

<div class="form-group">
      <label class="control-label col-sm-4" for="postal_code">Postal Code:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control"  id="postal_code"  path="postal_code"  name="postal_code" />
      </div>
</div>


<div class="form-group">
      <label class="control-label col-sm-4" for="region">Region:</label>
      <div class="col-sm-8">
        <input type="text" class="form-control"  id="region"  path="region"  name="region" />
      </div>
</div>
<div class="form-group">
      <div class="col-sm-4">
        <input type="Submit" class="btn info" id="submit"   name="submit" value="Add Customer" />
      </div>
</div>




</form>
</div>
<div class="col-md-6" >
<img src="../assets/image/car.jpg"  height="100%" width="100%" size="200"></img>

</div>

</div>

</div>
<jsp:include page="../include/footer.jsp"></jsp:include>




