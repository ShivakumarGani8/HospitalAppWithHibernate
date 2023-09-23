<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<style>
html {
	height: 100%;
}

body {
	margin: 0;
	padding: 0;
	font-family: sans-serif;
	background: linear-gradient(#141e30, #243b55);
}

.login-box {
	position: absolute;
	top: 50%;
	left: 50%;
	width: 400px;
	padding: 40px;
	transform: translate(-50%, -50%);
	background: rgba(0, 0, 0, .5);
	box-sizing: border-box;
	box-shadow: 0 15px 25px rgba(0, 0, 0, .6);
	border-radius: 10px;
}

.login-box h2 {
	margin: 0 0 30px;
	padding: 0;
	color: #fff;
	text-align: center;
}

.login-box .user-box {
	position: relative;
}

.login-box .user-box input {
	width: 100%;
	padding: 10px 0;
	font-size: 16px;
	color: #fff;
	margin-bottom: 30px;
	border: none;
	border-bottom: 1px solid #fff;
	outline: none;
	background: transparent;
}

.login-box form button {
	background-color: transparent;
	position: relative;
	display: inline-block;
	padding: 10px 20px;
	color: #03e9f4;
	font-size: 16px;
	text-decoration: none;
	text-transform: uppercase;
	overflow: hidden;
	margin: 40px 0px 10px 10px;
	letter-spacing: 4px
}

.login-box form button a {
	color: inherit;
	text-decoration: inherit;
	text-transform: inherit;
}

.login-box button:hover {
	background: #03e9f4;
	color: #fff;
	border-radius: 5px;
}

.login-box .user-box input:hover {
	border-bottom: #03e9f4 4px solid;
}
</style>
</head>
<body>
	<div class="login-box">
		<h2>Login</h2>
		<form action="login" method="get">
			<div class="user-box">
				<input type="text" placeholder="username" name="username">
			</div>
			<div class="user-box">
				<input type="password" placeholder="password" name="password">
			</div>
			<button type="submit">Submit</button>
			<button>
				<a href="./signup.jsp">Sign-up</a>
			</button>
		</form>
	</div>
</body>
<script>
var alertMessage = '<%=request.getAttribute("alertMessage")%>';
	if (alertMessage != 'null') {
		alert(alertMessage);
		alerMessage = null;
	}
</script>
</html>