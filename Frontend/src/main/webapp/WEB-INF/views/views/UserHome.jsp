<%@include file="Header.jsp"%>
<html>
<head></head>
<body>
<h2><center>Welcome ${sessionScope.username } !</center></h2>
<div class="row">
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="<c:url value="/productCatalog"/>">
        <img src="<c:url value="/resources/images/81.jpg"/>" alt="Lights" style="width:100%">
        <div class="caption">
          <p><h2>Readmi</h2></p>
        </div>
      </a>
    </div>
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="<c:url value="/productCatalog"/>">
        <img src="<c:url value="/resources/images/83.jpg"/>" alt="Lights" style="width:100%">
        <div class="caption">
          <p><h2>realme</h2></p>
        </div>
      </a>
    </div>
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="<c:url value="/productCatalog"/>">
        <img src="<c:url value="/resources/images/84.jpg"/>" alt="Lights" style="width:100%">
        <div class="caption">
          <p><h2>Vivo</h2></p>
        </div>
      </a>
    </div>
  </div>
 </div>

</body>
<%@include file="Footer.jsp"%>
</html>