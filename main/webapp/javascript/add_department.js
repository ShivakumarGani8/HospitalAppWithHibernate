
    function validateDepartmentForm() {
        var departmentName = document.getElementById("department_name").value;
        var departmentDescription = document.getElementById("department_description").value;
        var noOfDoctors = document.getElementById("no_of_doctors").value;
        var generalRooms = document.getElementById("general_rooms").value;
        var acRooms = document.getElementById("ac_rooms").value;
        var nonAcRooms = document.getElementById("non_ac_rooms").value;
        var icu = document.getElementById("icu").value;
        var costGeneralRoom = document.getElementById("cost_general_room").value;
        var costAcRoom = document.getElementById("cost_ac_room").value;
        var costNonAcRoom = document.getElementById("cost_non_ac_room").value;
        var costIcu = document.getElementById("cost_icu").value;

        if (departmentName.length > 30 || /[^a-zA-Z0-9\s]/.test(departmentName)) {
            alert("Department Name should be less than 30 characters and contain only alphanumeric characters.");
            return false;
        }

        if (departmentDescription.length > 50) {
            alert("Department Description should be less than or equal to 50 characters.");
            return false;
        }

        if (isNaN(noOfDoctors)) {
            alert("No Of Doctors should be a number.");
            return false;
        }

        if (isNaN(generalRooms) || isNaN(acRooms) || isNaN(nonAcRooms) || isNaN(icu)) {
            alert("Room counts should be numbers.");
            return false;
        }

        if (isNaN(costGeneralRoom) || isNaN(costAcRoom) || isNaN(costNonAcRoom) || isNaN(costIcu)) {
            alert("Cost values should be numbers.");
            return false;
        }

        return true;
    }
