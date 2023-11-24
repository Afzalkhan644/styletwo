<jsp:useBean id='designtaionBean' scope='request' class='com.thinking.machines.he.beans.DesignationBean' />
<jsp:useBean id='errorBean' scope='request' class='com.thinking.machines.hr.beans.ErrorBean' />
<!DOCTYPE HTML> 
<html lang='en'>
<head>
<title>HR Application</title>
<script src='/styletwo/js/DesignationAddForm.js'></script>
<link rel='stylesheet' type='text/css' href='/styletwo/css/styles.css'>
</head>

<body>
<!-- Main container starts here -->
<div  class='main-container'>
<!-- Header starts here -->
<div class='header'>
<img src='/styleone/images/logo.png' class='logo'>Thinking Machines</div>
</div><!-- Header ends here -->
<!-- content-section starts here -->
<div  class ='content'>
<!-- left panel starts here -->
<div class ='content-right-panel'>
<b>Designations</b></br>
<a href='/styletwo/Employees.jsp'>Employees</a><br>
<a href='/styleone/index.html'>Home</a>
</div>
<!-- left panel ends here -->
<!-- right panel starts here -->
<div class='content-right-panel'>
<h2>Designation(Add module)</h2>
<span class='error'><jsp:getProperty name='errorBean' property='error' />
</span>
<form method='post' action='/styletwo/AddDesignation.jsp' onsubmit='return validateForm(this)'>
Designation
<input type='text' id='title' name='title' maxlength='35' size='36' value='${designationBean.title}'>
<span id='titleErrorSection' style='color:red'></span><br>
<button type='submit' style='float:left'>Add</button>
<button type='Button' onclick='cancelAddition()'>Cancel</button>
</form>

</div>
<!-- right panel ends here -->
</div><!-- content-section ends here -->
<!-- footer starts here -->
<div class='footer'>
&copy;Thinking Machines 2023
</div><!-- footer ends here -->
</div><!-- Main container ends here -->
<form id='cancelAdditionForm' action='/styleone/designationsView'>
</form>
</body>
</html>