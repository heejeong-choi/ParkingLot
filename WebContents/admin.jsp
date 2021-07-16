


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
    <link rel="icon" type="image/png" sizes="96x96" href="\pics\favicon-96x96.png">

    <title>Admin Page</title>

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
  
  
<!-- NAV -->
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
            <a class="nav-link" href="enterCar.jsp">Enter</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="exitCar.jsp">Exit</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="addUser.jsp">Register</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
<!-- NAV -->

<main>
  <div class="container py-4" style="margin-top: 7%;">


    <img class="d-block mx-auto mb-4" src="pics/park.png" width="100px" height="100px">

    

    <div class="row align-items-md-stretch">
      <div class="col-md-6">
        <div class="h-100 p-5 text-white bg-dark rounded-3">
          <h2>Change Discount</h2>
          <p>You can change discount standard, also manage promo codes.</p>
          <button class="btn btn-outline-light" type="button" onclick = "location.href='discount.jsp'">Change</button>
        </div>
      </div>
      <div class="col-md-6">
        <div class="h-100 p-5 bg-light border rounded-3">
          <h2>Change Pricing</h2>
          <p>You can change pricing section here. There are pricing per time and day.</p>
          <button class="btn btn-outline-secondary" type="button" onclick = "location.href='fee.jsp'">Change</button>
        </div>
      </div>
    </div>

    <footer class="pt-3 mt-4 text-muted border-top">
      &copy; EZ PARK
    </footer>
  </div>
</main>


    
  </body>
</html>