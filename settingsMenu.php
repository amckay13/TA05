<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Parent Menu</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/custom.css" rel="stylesheet">
        <style type="text/css">body { background: navy !important; } /* Adding !important forces the browser to overwrite the default style applied by Bootstrap */</style>
    </head>
    
    <body>
        
        <nav class="navbar navbar-default navbar-custom">
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
        
        <div class="container text-center">
            <h1 class="h1">Parent Settings Menu</h1>
        </div><br>
            
        <div class="container text-center">
            <form action="settings.php" method="post">
                <input type="submit" value="App Settings" class="btn btn-primary" style="width:300px; height:80px;">
            </form>
            <form action="store.php" method="post">
                <input type="submit" value="Bookstore" class="btn btn-primary" style="width:300px; height:80px;">
            </form>
            <form action="info.php" method="post">
                <input type="submit" value="Account Info" class="btn btn-primary" style="width:300px; height:80px;">
            </form>
        </div>
        
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>