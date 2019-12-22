<jsp:include page="../include/header.jsp"></jsp:include>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">

<div class="row">
	<div class="col-md-12">
		<div class="page-header" >
		   <h5 >${page_heading} </h5>
		</div>
	</div>
</div>

<div class="row" >

<div class="col-md-4">
<div class="well-sm">
 <span style="color:#f70227;text-transform: uppercase;">
    <strong>Category</strong> 
 </span>
</div>
<c:if test="${fn:length(product_list_by_category) > 0}">
	    <c:forEach items="${product_list_by_category }"  var="product" >
	    <p data-id=${product.category_id} class="category">
	     <a href="#">
	       <strong>${product.category_name}:</strong>${product.total_count}</p>
	     </a>
	    </c:forEach>
</c:if>

</div>

<div class=col-md-8>
<div id="product_list">




</div>
</div>
</div>
</div>


<jsp:include page="../include/footer.jsp"></jsp:include>

<script>

$(".category").on("click", function(){
		
var cat_id=$(this).data("id");
var req_url="get-product-by-category";
$.ajax({
			url:req_url,
			type:"POST",
			cache:false,
			data:{cate_id:cat_id},
			dataType:"html",
			success:function(data){
			 $("#product_list").html(data);
			}
	
	  });
	
	
	
	
})

</script>
