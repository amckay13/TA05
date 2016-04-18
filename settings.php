<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Parent Settings</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    
    <body>
        <a class="btn btn-info" href="settingsMenu.php" role="button">Back to Menu</a>
        
        <div class="container text-center">
            <h1 class="h1">Account Settings</h1>
        </div
        <br>
        
        <div class="container">
            <form action="confirm.php" method="post">
                <b>Text Language Control</b><br>
                <input type="checkbox" name="language" value="English"> English<br>
                <input type="checkbox" name="language" value="Russian"> Russian<br>
                <input type="checkbox" name="language" value="Spanish"> Spanish<br><br>
                
                <b>Webcam</b><br>
                <input type="radio" name="webcam" value="on"> On<br>
                <input type="radio" name="webcam" value="off"> Off<br><br>
                
                <b>Narration</b><br>
                <input type="radio" name="narration" value="on"> On<br>
                <input type="radio" name="narration" value="off"> Off<br><br>
                
                <b>Remote Play Connected Via:</b><br>
                <input type="radio" name="connection" value="Skype"> Skype<br>
                <input type="radio" name="connection" value="Facetime"> Facetime<br>
                <input type="radio" name="connection" value="web"> Web Host<br><br>
                
                <input type="submit" name="save" value="Save Changes">
            </form>
        </div>
        
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>