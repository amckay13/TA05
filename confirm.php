<html>
    <head>
        <meta http-equiv="Content=Type" content="text/html; charset=UTF-8" />
        <title>Confirmation</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/custom.css" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container">
                <a class="navbar-brand" href="#">Storybook Dashboard</a>
                <ul class="nav navbar-nav">
                    <li><a href="settings.php">App Settings</a></li>
                    <li><a href="store.php">Bookstore</a></li>
                    <li><a href="info.php">Account Info</a></li>
                </ul>
                <ul class="nav navbar-nav pull-right">
                    <li><a href="login.php">Logout</a></li>
                </ul>
            </div>
        </nav>
        
        <div class="container">
            <h1 class="h1">Success!</h1>
        </div>
        <br>
        
        <div class="container">
            <form action="settings.php" method="post">
				<input type="submit" name="profile"  class="btn btn-primary" value="Back to Dashboard" /><br />
			</form>
        </div>
        <br>
        
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>