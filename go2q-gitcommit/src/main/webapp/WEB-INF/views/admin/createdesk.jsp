<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:if test="${not empty SuccessMsg}">
				      <script>
						alert("desk created");
				      </script>
				      </c:if>  --%>
<section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Manage desks</h1>
          </div>
          
          <!-- breadcrumb needed only in mob view -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Manage Desk</li>
            </ol>
          </div>
          <!-- <button type="button" style="margin-left:1011px;" class="btn btn-info float-right"><i class="fa-mail-reply"></i> Go Back</button>
        --><a style="margin-left:1078px;" href="${pageContext.request.contextPath }/admin/desklist"><i class="fas fa-arrow-circle-left"></i></a> 
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
      <div class="card">
        <div class="card-header">
          <!-- <h3 class="card-title">Title</h3> -->

          <div class="card-tools">
            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip" title="Collapse">
              <i class="fas fa-minus"></i></button>
          <!--   <button type="button" class="btn btn-tool" data-card-widget="remove" data-toggle="tooltip" title="Remove">
              <i class="fas fa-times"></i></button> -->
          </div>
        </div>
        <div class="card-body">
      
       <div class="card card-info">
              <div class="card-header">
                <h3 class="card-title">Add Desk</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form class="form-horizontal" method="post" action="/sp/counters/add">
                <div class="card-body">
                  <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">Desk Name</label>
                     <input type="hidden" class="form-control" name="serviceprovider_id" id="serviceprovider_id" value="1" placeholder="Desk Name">
                    <div class="col-sm-10">
                      <input type="text" class="form-control" name="name" id="name" placeholder="Desk Name">
                    </div>
                  </div>
                  <div class="form-group row">
                    <label for="inputPassword3" class="col-sm-2 col-form-label">Display Name</label>
                    <div class="col-sm-10">
                      <input type="text" class="form-control" name="displayName" id="displayName" placeholder="Display Name">
                    </div>
                  </div>
                  
                </div>
                <!-- /.card-body -->
                <div class="card-footer">
                  <button type="submit" class="btn btn-info">Submit</button>
                  <!-- <button type="submit" class="btn btn-default float-right">Cancel</button> -->
                </div>
                <!-- /.card-footer -->
              </form>
            </div>
      </div>
      <!-- /.card -->

    </section>
    <!-- /.content -->