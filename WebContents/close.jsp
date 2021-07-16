<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.83.1">
    <link rel="icon" type="image/png" sizes="96x96" href="pics/favicon-96x96.png">

    <title>EZPARK</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/jumbotron/">

    <!-- Bootstrap core CSS -->
<link href="css\bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }
      

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
  </head>
  <body>
<nav class="navbar fixed-bottom navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="index.jsp">EZ PARK</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="index.jsp">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="parking_in.jsp">Enter</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="parking_out.jsp">Exit</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="useradd.jsp">Register</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>



<main>
  <div class="container py-4" style="margin-top: 7%;">

    <img class="d-block mx-auto mb-4" src="pics\park.png" alt="" width="100px" height="100px">

     
     <div class="p-5 mb-4 bg-light rounded-3">
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">Thank you</h1>
        <p class="col-md-8 fs-4">I hope we could be nice place for your car. <br> See you again!</p>

        <button type="button" class="btn btn-outline-secondary" onclick="location.href='index.jsp'">Back to Main</button>
      </div>
    </div>
     
     

    <footer class="pt-3 mt-4 text-muted border-top">
      &copy; EZ PARK
    </footer>
  </div>
</main>


    
  </body>
</html>