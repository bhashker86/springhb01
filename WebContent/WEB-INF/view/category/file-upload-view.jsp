<jsp:include page="../include/header.jsp"></jsp:include>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">
<div class="row" >
<div class="col-md-8">
<h3>${page_heading} </h3>
<p><strong>${msg}</strong> </p>


<form:form cssClass="md-form" modelAttribute="file" method="POST" action="file-upload-sbmt" enctype="multipart/form-data">
    <div class="form-group">
       
            <span>Choose file</span>
            <input type="file" name="file"   accept="application/pdf" />
        
    </div>
    
    
    <div class="form-group">
      <input type="submit" name="submit" value="Upload" class="btn btn-primary" />
  
  </div>
    
</form:form>



</div>
</div>
</div>
<jsp:include page="../include/footer.jsp"></jsp:include>