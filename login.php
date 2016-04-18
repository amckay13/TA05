<html>
		<head>
				<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
				<title>Login Page</title>
				<link href="bootstrap.min.css" rel="stylesheet">
		</head>
		<a class="btn btn-info" href="profileSelect.php" role="button">Back to Profiles</a>
		<!--<form action="navigating.php" method="post">
				
			<input type="submit" name="back_profileSelect" style="width:120px; height:45px;" value="Back to Profiles" /><br />
			<p>&nbsp;</p>
		</form>	-->
		<form action="navigating.php" method="post">
			<p>
				<strong>Name: </strong><input type="text" name="User:"  />
			</p>
			
			<p>
				<strong>Password: </strong><input type="password" name="Password:" />
			</p>
			
			<!--We need the submit button-->
			<p>
				<input type="submit" name="submitInfoButton" />
			</p>
		</form>
		<script src="js/bootstrap.min.js"></script>
</html>
