
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
<link href="css/bootstrap.min.css" rel="stylesheet">

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

    <div class="container col-xl-10 col-xxl-8 px-4 py-5" style="margin-top: 7%;">
      <div class="row align-items-center g-lg-5 py-5">
        <div class="col-lg-7 text-center text-lg-start">
          <h1 class="display-4 fw-bold lh-1 mb-3" style="font-size: 100px;">NICE TO<br>SEE YOU!</h1>
        </div>
        <div class="col-md-10 mx-auto col-lg-5">
          <form class="p-4 p-md-5 border rounded-3 bg-light" method="post" action="in">
            <div class="form-floating mb-3">
              <input type="car_number" class="form-control" id="car_number" style="width: 70%;"><br>
              <input type="submit" id="in_result" class="btn btn-outline-secondary" value="Enter"></button>
              <label for="floatingInput">Car Number</label>
            </div> 
          </form>
        </div>
      </div>
    </div>
    
    <script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
    
	<script>
    $(document).ready(function(){
        $("#checkIn").click(function(e) {
            e.preventDefault();
            let data = { car_number: $('#inNumber').val()};
            console.log(data);
            $.ajax({
                type: "POST",
                url: "/parking-in",
               	data: data,
                success: function(response) {
                    $('#in_result').text(response);
                },
                error: function(err) {
                    console.log("error!");
                }
            });
        });
    });
	</script>
    
  </body>
</html>
