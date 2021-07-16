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

<link href="css\bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }
      
      .ezpark-subject {
      	font-size: 3.5rem;
      	text-align: center;
      	font-weight: bold;
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


    <img class="d-block mx-auto mb-4" src="pics/park.png" width="100px" height="100px">

	<p class="ezpark-subject">WELCOME TO EZPARK</p>
	<br>

    

    <div class="row align-items-md-stretch">
      <div class="col-md-6">
        <div class="h-100 p-5 text-white bg-dark rounded-3">
          <h2>To be user</h2> <br>
          <button class="btn btn-outline-light" type="button"  onclick="location.href='useradd.jsp'">Register</button>
        </div>
      </div>
      <div class="col-md-6">
        <div class="h-100 p-5 bg-light border rounded-3">
          <h2>Admin mode</h2> <br>
          <button class="btn btn-outline-secondary" type="button"  onclick="location.href='login.jsp' ">Admin</button>
        </div>
      </div>
    </div>
    <br>


    <footer class="pt-3 mt-4 text-muted border-top">
      &copy; EZ PARK
    </footer>
  </div>
</main>


    
  </body>
</html>