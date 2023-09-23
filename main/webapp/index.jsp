<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="./css/index.css">
</head>
<body>
    <nav>
            <a onclick="showIframe('doctorPage')" id='doctorPage' class="navButtons">Add a Doctor</a>
            <a onclick="showIframe('departmentPage')" id="departmentPage" class="navButtons">Add a Department</a>
            <a onclick="showIframe('patientPage')" id='patientPage' class="navButtons" style="color: gold;text-decoration: underline;">Add a Patient</a>
    </nav>
    <iframe style="display:block; border:none" src="./add_patient.jsp" id="formElement"></iframe>
</body>
<footer><P style="padding: 0 10px;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Molestias fuga, vero nam possimus blanditiis accusantium beatae sint aut quisquam cumque quas inventore, quo laudantium placeat dicta tempora voluptate nisi repellat?
</P></footer>
<script src="./javascript/index.js"> </script>
</html>
