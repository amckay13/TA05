<?php
	require_once("support.php");
	session_start();
	
	if (isset($_SESSION['user'])) {
		// logged in
		 header("Location:settings.php");
	}

	$body = "";
	if (isset($_POST["submitInfoButton"])) {
		$nameValue = trim($_POST["name"]);
		$passwordValue = trim($_POST["password"]);
		
		if ($nameValue !== "Mom" || $nameValue === "" || $passwordValue === "" || ($passwordValue !== "readingrocks"))
			$body .= "<h1><strong>Invalid login information provided.</strong></h1>";
		if ($body == "") {
			$_SESSION['user'] = $nameValue;
			echo '<script type="text/javascript"> window.open("settingsMenu.php","_self");</script>';
		}
	} else {
		$nameValue = "";
		$passwordValue = "";
	}
	
	// superglobals are not accessible in heredoc
	
	$_SESSION["script"] = $_SERVER["PHP_SELF"];
	$scriptName = $_SESSION["script"];
	$topPart = <<<EOBODY
		<form action="navigating.php" method="post">
			<input type="submit" name="back_profileSelect" style="width:60px; height:45px;" value="Back to Profiles" /><br />
			<p>&nbsp;</p>
		</form>	
		<form action="$scriptName" method="post">
			<p>
				<strong>Name: </strong><input type="text" name="User: " value="$nameValue" />
			</p>
			
			<p>
				<strong>Password: </strong><input type="password" name="Password: " value="$passwordValue"/>
			</p>
			
			<!--We need the submit button-->
			<p>
				<input type="submit" name="submitInfoButton" />
			</p>
		</form>		
EOBODY;
	$body = $topPart.$body;
	
	$page = generatePage($body);
	echo $page;
?>
