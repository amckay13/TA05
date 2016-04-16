<?php
    require_once("support.php");
    
    class Finalized {
		public $body;
        
        public function newPage($data) {
			return generatePage($data);
		}
    }
    
    $finish = new Finalized();
	$finish->body = "";
    
    if (isset($_POST["profile"]) || isset($_POST["back_profileSelect"])) {
        header("Location:profileSelect.php");
    }
	
	if (isset($_POST["back_landing"])) {
        header("Location:mainPage.html");
    }
	
	if (isset($_POST["profile3"])) {
        header("Location:login.html");
    }
?>