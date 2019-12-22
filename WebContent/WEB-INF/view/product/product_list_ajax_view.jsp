<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">


<div class="row" >
	<div class=col-md-8>
		<div id="product_list">
		
		
		<c:if test="${ not empty product_list}" >
		 <c:forEach items="${product_list}" var="product">
		 <div class="panel panel-primary">
			  <div class="panel-heading"><strong>${product.title}</strong></div>
	           <div class="panel-body">
					 <div class="row">
					 
							 <div class="col-md-4">
							 
									 <div class="thumbnail">
									      <a href="/w3images/lights.jpg">
									        <img src="https://qph.ec.quoracdn.net/main-qimg-3f11463cdda69d1e573bd9cd3906590b-c" alt="${product.title}" style="width:100%">
<!-- 									        <div class="caption"> -->
<%-- 									          <p>${product.title}</p> --%>
<!-- 									        </div> -->
									      </a>
					    			 </div>
							 </div>
							 <div class="col-md-8">
								  <p><strong>${product.title} </strong>  </p>
								  <p><strong>Product Name :</strong>  ${product.name} </p>
								  <p><strong>Price :</strong>  ${product.price} </p>
								  <p><strong>Color :</strong>  ${product.color} </p>
								  <p><strong>Model Name :</strong>  ${product.model_name} </p>
							 </div>
					 
					 
					 </div>
			   </div>
		 </div>
		 
		 </c:forEach>
		
		</c:if>
		
		
		<c:if test="${empty product_list }">
		<p>There is not product</p>
		</c:if>
		
		
		
		</div>
	</div>
</div>
