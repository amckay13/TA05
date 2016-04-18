<html>
		<head>
				<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
				<title>Login Page</title>
				<link href="css/bootstrap.min.css" rel="stylesheet">
		</head>
		<a class="btn btn-info" href="profileSelect.php" role="button">Back to Profiles</a>
		<!--<form action="navigating.php" method="post">
				
			<input type="submit" name="back_profileSelect" style="width:120px; height:45px;" value="Back to Profiles" /><br />
			<p>&nbsp;</p>
		</form>	-->
		
		<div class="container text-center">
            <h1 class="h1">Login Page</h1>
        </div>
		
		<div class="container text-center">
				<form action="navigating.php" method="post">
					<p>
						<strong>Name: </strong><input type="text" name="User:"  />
					</p>
					
					<p>
						<strong>Password: </strong><input type="password" name="Password:" />
					</p>
					
					<!--We need the submit button-->
					<p>
						<input type="submit" class="btn btn-primary" name="submitInfoButton" />
					</p>
				</form>
		</div>
		
		<script src="js/bootstrap.min.js"></script>
</html>
