<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html lang="en">
<head>
	<title> Sky Line High School</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">


<style>
body {
	font-family: "Lato", sans-serif
}

.mySlides {
	display: none
}
</style>
</head>
<body>

	<!-- Navbar -->
	<div class="w3-top">
		<div class="w3-bar w3-black w3-card">
			<a
				class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right"
				href="javascript:void(0)" onclick="myFunction()"
				title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a> <a
				href="#" class="w3-bar-item w3-button w3-padding-large">Home</a> <a
				href="#band"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">Facilities</a>
			<a href="#notices"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">Users</a>
			<a href="#contact"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">Contacts</a>
			<div class="w3-dropdown-hover w3-hide-small">
				<button class="w3-padding-large w3-button" title="More">
					More<i class="fa fa-caret-down"></i>
				</button>
				<div class="w3-dropdown-content w3-bar-block w3-card-4">
					<a href="#" class="w3-bar-item w3-button">Study materials</a> <a
						href="#" class="w3-bar-item w3-button">Timetable</a> <a href="#"
						class="w3-bar-item w3-button">Events</a>
				</div>
			</div>
			<a href="javascript:void(0)"
				class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i
				class="fa fa-search"></i></a>
		</div>
	</div>

	<!-- Navbar on small screens (remove the onclick attribute if you want the navbar to always show on top of the content when clicking on the links) -->
	<div id="navDemo"
		class="w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top"
		style="margin-top: 46px">
		<a href="#band" class="w3-bar-item w3-button w3-padding-large"
			onclick="myFunction()">Facilities</a> <a href="#notices"
			class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">Users</a>
		<a href="#contact" class="w3-bar-item w3-button w3-padding-large"
			onclick="myFunction()">Contacts</a> <a href="#"
			class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">MERCH</a>
	</div>

	<!-- Page content 
	<div class="w3-content" style="max-width: 2000px; margin-top: 46px">

		<!-- Automatic Slideshow Images 
		<div class="mySlides w3-display-container w3-center">

			<div
				class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">

				<h1>
					<b>We find the passion of every child and nurture it !</b>
				</h1>
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
			<img
				src="Images/school.jpg"
				style="width: 100%">
			<div
				class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h2>
					<b>We prepare our students by giving them the critical thinking
						skills necessary to succeed in a modern world !</b>
				</h2>

			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
			<img
				src="school.jpg"
				style="width: 100%">
			<div
				class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h2>
					<b>Our pastoral focus is to find ways to further develop and
						inclusive, caring and supportive environment for all </b>
				</h2>

			</div>
		</div>
		-->
		


  <div class="w3-padding w3-large w3-padding-64 w3-wide w3-center w3-light-grey">
   <br>
    <h1> <b>Welcome Sky Line High School</b> </h1>
    <br>
    <br>
  </div>
		

		<!-- The facilities Section -->
		<div class="w3-container w3-content w3-center w3-padding-64"
			style="max-width: 800px" id="band">
			<h2 class="w3-wide">The Facilities</h2>
			<br>
			<p class="w3-justify">The idea of Sky Line as an affordable fee
				levying private school network is to teach the government syllabus
				in English Medium preserving the cultural and traditional values.
				Sussex College Network also pride ourselves by giving students
				possibilities like never before with personalized learning, new
				course offerings, and passion pathways. Students at our colleges
				find their true selves rather than letting a system define who they
				can become or how far they can go. As a school we aim to nurture
				every student so that they can be the best they can be; global
				citizens with a sense of adventure, who are able to discover where
				their skills and passions lie, and harness these to inform future
				careers.</p>
			<div class="w3-row w3-padding-32">
				<div class="w3-third">
					<p>
						<b><h4>Shuttle Services</h4></b>
					</p>
					<img src="/School-Information-Management-System/Img/bus.jpg"
						class="w3-round w3-margin-bottom" alt="Random Name"
						style="width: 80%">
				</div>
				<div class="w3-third">
					<p>
						<b><h4>Sports</h4></b>
					</p>
					<img
						src="/School-Information-Management-System/src/main/webapp/Images/sports.jpg"
						class="w3-round w3-margin-bottom" alt="Random Name"
						style="width: 90%">
				</div>
				<div class="w3-third">
					<p>
						<b><h4>Library</h4></b>
					</p>
					<img
						src="Images/library.jpg"
						class="w3-round" alt="Random Name" style="width: 50%">
				</div>
			</div>
		</div>

		<!-- The Notices Section -->
		<div class="w3-black" id="notices">
			<div class="w3-container w3-content w3-padding-64"
				style="max-width: 800px">
				<h2 class="w3-wide w3-center">Notices</h2>

				<br> <br>
				<ul class="w3-ul w3-border w3-white w3-text-grey">
					<li class="w3-padding">Today<span
						class="w3-tag w3-red w3-margin-left">Notice</span> <br> <br>
						<br> <br></li>

				</ul>


				<div class="w3-row-padding w3-padding-32" style="margin: 0 -16px;">
					<h2 class="w3-wide w3-center">Users</h2>


<br>
<br>


					<div class="w3-third w3-margin-bottom">
					
						<div class="w3-container w3-white">
							<p>
								<b><h3 style="text-align: center;">Admin</h3> </b>
							</p>

							<button class="w3-button w3-black w3-margin-bottom"
								onclick="document.getElementById('ticketModal').style.display='block'">
								<a href="login.jsp" class="btn">View</a>
							</button>
						</div>

					</div>

					<div class="w3-third w3-margin-bottom">
						
						<div class="w3-container w3-white">
							<p>
								<b><h3 style="text-align: center;">Teacher</h3> </b>
							</p>

							<button class="w3-button w3-black w3-margin-bottom"
								onclick="document.getElementById('ticketModal').style.display='block'">
								<a href="index.jsp" class="btn"></a>View
							</button>
						</div>
					</div>


					<div class="w3-third w3-margin-bottom">
						
						<div class="w3-container w3-white">
							<p>
								<b><h3 style="text-align: center;">Student</h3> </b>
							</p>

							<button class="w3-button w3-black w3-margin-bottom"
								onclick="document.getElementById('ticketModal').style.display='block'">
								<a href="index.jsp" class="btn"></a>View
							</button>
						</div>
					</div>

				</div>
			</div>
		</div>
		<!--user end-->


		<!-- The Contact Section -->
		<div class="w3-container w3-content w3-padding-64"
			style="max-width: 900px" id="contact">
			<h2 class="w3-wide w3-center">CONTACT</h2>
			<p class="w3-opacity w3-center">
				<i>For more details contact us!</i>
			</p>
			<div class="w3-row w3-padding-32">
				<div class="w3-col m6 w3-large w3-margin-bottom">
					<i class="fa fa-map-marker" style="width: 30px"></i> Colombo, LK<br>
					<i class="fa fa-phone" style="width: 30px"></i> Phone: +94769813512<br>
					<i class="fa fa-envelope" style="width: 30px"> </i> Email:
					skyline@gmail.com<br>
				</div>
				<div class="w3-col m6">
					<form action="/action_page.php" target="_blank">
						<div class="w3-row-padding" style="margin: 0 -16px 8px -16px">
							<div class="w3-half">
								<input class="w3-input w3-border" type="text" placeholder="Name"
									required name="Name">
							</div>
							<div class="w3-half">
								<input class="w3-input w3-border" type="text"
									placeholder="Email" required name="Email">
							</div>
						</div>
						<input class="w3-input w3-border" type="text"
							placeholder="Message" required name="Message">
						<button class="w3-button w3-black w3-section w3-right"
							type="submit">SEND</button>
					</form>
				</div>
			</div>
		</div>

		<!-- End Page Content -->
	</div>

	<!-- Footer -->
	<footer
		class="w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-large">
		<i class="fa fa-facebook-official w3-hover-opacity"></i> <i
			class="fa fa-instagram w3-hover-opacity"></i> <i
			
			class="fa fa-pinterest-p w3-hover-opacity"></i> <i
			class="fa fa-twitter w3-hover-opacity"></i> <i
			class="fa fa-linkedin w3-hover-opacity"></i>
		<p class="w3-medium">
			Powered by <a href="" target="_blank">sky Line</a>
		</p>
	</footer>

	<script>
		// Automatic Slideshow - change image every 4 seconds
		var myIndex = 0;
		carousel();

		function carousel() {
			var i;
			var x = document.getElementsByClassName("mySlides");
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			myIndex++;
			if (myIndex > x.length) {
				myIndex = 1
			}
			x[myIndex - 1].style.display = "block";
			setTimeout(carousel, 4000);
		}

		// Used to toggle the menu on small screens when clicking on the menu button
		function myFunction() {
			var x = document.getElementById("navDemo");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}

		// When the user clicks anywhere outside of the modal, close it
		var modal = document.getElementById('ticketModal');
		window.onclick = function(event) {
			if (event.target == modal) {
				modal.style.display = "none";
			}
		}
	</script>

</body>
</html>
