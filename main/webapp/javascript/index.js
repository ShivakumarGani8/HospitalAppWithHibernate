function showIframe(page){
    const buttons = document.querySelectorAll('.navButtons');
    buttons.forEach(button => {
        button.style.color="white";
});

    // Highlight the clicked button
    const clickedButton = document.getElementById(page);
    clickedButton.style.textDecoration="underline";
    clickedButton.style.color="gold";
    
    switch(page){
        case 'doctorPage' : document.getElementById('formElement').src = "./add_doctor.jsp";
        break;
        case 'departmentPage' : document.getElementById('formElement').src = "./add_department.jsp";
        break;
        case 'patientPage' : document.getElementById('formElement').src = "./add_patient.jsp";
    }
    document.getElementById("formElement").style.display = "block"; 
}
