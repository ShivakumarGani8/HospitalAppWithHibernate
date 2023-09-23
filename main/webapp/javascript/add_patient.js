    function validatePatientForm() {
        var firstName = document.getElementById("first_name").value;
        var lastName = document.getElementById("last_name").value;
        var dob = document.getElementById("date_of_birth").value;
        var fatherOrSpouseName = document.getElementById("father_spouse_name").value;
        var bloodGroup = document.getElementById("blood_group").value;
        var contactNumber = document.getElementById("contact_number").value;


        if (firstName.length > 30 || !/^[a-zA-Z]+$/.test(firstName)) {
            alert("First Name should be less than 30 characters and contain only alphabets.");
            return false;
        }

        if (lastName.length > 30 || !/^[a-zA-Z]+$/.test(lastName)) {
            alert("Last Name should be less than 30 characters and contain only alphabets.");
            return false;
        }


        if (!/^\d{10}$/.test(contactNumber)) {
            alert("Contact Number should have exactly 10 digits.");
            return false;
        }


        return true;
    }
