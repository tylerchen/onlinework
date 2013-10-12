message.body=
"""
<html>
<head>
<title>Hello!</title>
<link type="text/css" rel="stylesheet" href="/route/css/bootstrap.css">
<link type="text/css" rel="stylesheet" href="/route/css/docs.css">
<link type="text/css" rel="stylesheet" href="/route/css/main.css">
<script type="text/javascript" charset="utf-8" src="/route/js/jquery-1.8.1-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/route/js/bootstrap.js"></script>
</head>
<body>
<!-- Main Top Navbar -->
<div class="navbar navbar-fixed-top" id="my-navbar">
	<div class="navbar-inner">
		<div class="container">
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</a>
			<a class="brand" href="http://www.foreveross.com">LVS Web Console</a>
			<div class="nav-collapse">
				<ul class="nav">
					<li class="divider-vertical"></li>
					<li class="<%=request.getRequestURI().indexOf("configure.jsp")<0?"active":""%>"><a href="${rs[0]}/">Home</a></li>
					<li class="divider-vertical"></li>
					<!-- <li class="divider-vertical"></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li class="divider"></li>
						<li><a href="#">Separated link</a></li>
					</ul>
					</li> -->
				</ul>
				<ul class="nav pull-right">
					<li class="divider-vertical"></li>
					<li class="loginform">
						<form action="" class="form-inline" method="post">
							<input  class="input-small" type="text"     placeholder="Username" name="login_username" id="login_username"/>
							<input  class="input-small" type="password" placeholder="Password" name="login_password" id="login_password"/>
							<button class="btn"         type="submit"   name="logform_sumit" value="login">Sign in</button>
						</form>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- Main Top Navbar END -->
	<div class="container">
		<div class="content">
			<div class="page-header">
				<h1>Monitor Pannel</h1>
					<h1>Online Work!!!</h1>
					<form action="${uri}" method="POST"><input name="aaa" type="text"></form>
			</div>
		</div>
		<div class="row">
			<div class="span10"><!-- lvs machine -->
				<div class="bs-docs-example">
					<center>
						<span class="btn btn-large btn-success">LVS<br />Primary</span>
						<i class="icon-arrow-left icon-black"></i>
						<i class="icon-minus icon-black"></i>
						<i class="icon-minus icon-black"></i>
						<i class="icon-minus icon-black"></i>
						<i class="icon-minus icon-black"></i>
						<i class="icon-minus icon-black"></i>
						<span class="btn btn-small btn-success">OK</span>
						<i class="icon-minus icon-black"></i>
						<i class="icon-minus icon-black"></i>
						<i class="icon-minus icon-black"></i>
						<i class="icon-minus icon-black"></i>
						<i class="icon-minus icon-black"></i>
						<i class="icon-arrow-right icon-black"></i>
						<span class="btn btn-large btn-success">LVS<br />Backup</span>
					</center>
				</div>
				<!-- lvs machine END1-->
				<div class="bs-docs-example">
					<pre>
					</pre>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
"""


