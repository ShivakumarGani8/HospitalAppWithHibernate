    function validateDoctorForm() {
        var firstName = document.getElementById("first_name").value;
        var lastName = document.getElementById("last_name").value;
        var registrationNo = document.getElementById("registration_no").value;
        var dob = document.getElementById("date_of_birth").value;
        var email = document.getElementById("email").value;
        var contactNumber = document.getElementById("contact_number").value;
        var specialization = document.getElementById("specialization").value;
        var qualification = document.getElementById("qualification").value;
   
        var departmentNo = document.getElementById("department_no").value;

        // Add validations for other fields as per instructions

        if (firstName.length > 20 || !/^[a-zA-Z]+$/.test(firstName)) {
            alert("First Name should be less than 20 characters and contain only alphabets.");
            return false;
        }
        
        if (lastName.length > 20 || !/^[a-zA-Z]+$/.test(lastName)) {
            alert("Last Name should be less than 20 characters and contain only alphabets.");
            return false;
        }

        if (!/^\d{10}$/.test(contactNumber)) {
            alert("Contact Number should have exactly 10 digits.");
            return false;
        }

        if (!/\S+@\S+\.\S+/.test(email)) {
            alert("Email should be in the format 'name@example.com'.");
            return false;
        }

        if (isNaN(departmentNo)) {
            alert("Department No should be a number.");
            return false;
        }


        return true;
    }
