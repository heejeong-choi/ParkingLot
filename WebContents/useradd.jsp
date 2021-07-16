<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description">
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
	<form action="/customer" method="post">

        <div class="bd-example">

          <div class="col-md-3" style="margin:auto">
            <label for="validationServer01" class="form-label">Full name</label>
            <input type="text" class="form-control" name="name">
            <div class="valid-feedback">
            </div>
          </div>
          
          <div class="col-md-3" style="margin:auto">
            <label for="validationServer02" class="form-label">Phone number</label>
            <input type="text" class="form-control" name="phone">
            <div class="valid-feedback">
            </div>
          </div>
          
          <div class="col-md-3" style="margin:auto">
            <label for="validationServer02" class="form-label">Car number</label>
            <input type="text" class="form-control" name="car_number">
            <div class="valid-feedback">
            </div>
          </div>
          
          <div class="col-md-3" style="margin:auto">
            <label for="validationServer02" class="form-label">Subscription(YYYY-MM-DD)</label>
            <input type="text" class="form-control" name="service_end">
            <div class="valid-feedback">
            </div>
            
              <div class="invalid-feedback">
                Please provide a valid state.
              </div>
            </div>
          <br>
          <div align="center">
			<input type="submit" class="btn btn-outline-secondary px-2" value="register">          
 		</div>
 		</div>
        </form>
        </div>


    <footer class="pt-3 mt-4 text-muted border-top">
      &copy; EZ PARK
    </footer>
</main>


    
  </body>
</html>