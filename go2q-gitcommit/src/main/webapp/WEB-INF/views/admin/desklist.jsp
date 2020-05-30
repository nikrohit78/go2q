<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Manage desks</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Manage Desk</li>
            </ol>
          </div>
          <%-- <button type="button" style="margin-left:1011px;" onclick="${pageContext.request.contextPath }/admin/createdesk" class="btn btn-info float-right"><i class="fas fa-plus"></i> Add</button>
         --%>
         <a href="${pageContext.request.contextPath }/admin/createdesk" style="margin-left:1070px;"><i class="fas fa-plus"></i></a>
         </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
      <div class="card">
        <div class="card-header">
         <!--  <h3 class="card-title">Title</h3> -->

          <div class="card-tools">
            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip" title="Collapse">
              <i class="fas fa-minus"></i></button>
            <!-- <button type="button" class="btn btn-tool" data-card-widget="remove" data-toggle="tooltip" title="Remove">
              <i class="fas fa-times"></i></button> -->
          </div>
        </div>
        <div class="card-body">
          <div class="card-body table-responsive p-0">
                <table class="table table-hover">
                  <thead>
                    <tr>
                      <th>ID</th>
                      <th>Desk Name</th>
                      <th>Display Name</th>
                      <th>Active</th>
                      <th>Action</th>
                    </tr>
                  </thead>
                  <tbody>
                  <% int i=1;%>
                  <c:forEach var="ct" items="${counterLst}">
                    <tr>
                    	<td><%=i %></td>
                      <td>${ct.name}</td>
                      <td>${ct.displayName}</td>
                     <td></td>
                      <td><a href="editCounter?id=${ct.id}"><i class="fas fa-edit"></i></a> 
                 	 <a href="id=${ct.id}"><i class="fas fa-trash"></i></a>
              		  </td>
                      
                    </tr>
                    <%i++; %>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
        </div>
        <!-- /.card-body -->
        
        <!-- /.card-footer-->
      </div>
      <!-- /.card -->

    </section>
    <!-- /.content -->
