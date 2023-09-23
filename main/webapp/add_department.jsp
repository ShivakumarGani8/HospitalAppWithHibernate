<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
    <form action="AddDepartment" method="post" onsubmit="return validateDepartmentForm()">
        <!-- Department details form fields -->
        <div class="form-group">
            <label for="department_name">Department Name<span class="mandatory">*</span> :</label>
            <input type="text" id="department_name" name="department_name" value="Surgery" required>
        </div>
        <div class="form-group">
            <label for="department_description">Department Description (use text area)<span class="mandatory">*</span> :</label>
            <textarea id="department_description" name="department_description" value="Surgery" required></textarea>
        </div>
        <div class="form-group">
            <label for="no_of_doctors">No Of Doctors<span class="mandatory">*</span> :</label>
            <input type="text" id="no_of_doctors" name="no_of_doctors" value="4" required>
        </div>
        <div class="form-group">
            <label for="general_rooms">Number of General Rooms<span class="mandatory">*</span> :</label>
            <input type="text" id="general_rooms" name="general_rooms" value="15" required>
        </div>
        <div class="form-group">
            <label for="ac_rooms">Number of AC Rooms<span class="mandatory">*</span> :</label>
            <input type="text" id="ac_rooms" name="ac_rooms" value="150" required>
        </div>
        <div class="form-group">
            <label for="non_ac_rooms">Number of Non-AC Rooms<span class="mandatory">*</span> :</label>
            <input type="text" id="non_ac_rooms" name="non_ac_rooms" value="150" required>
        </div>
        <div class="form-group">
            <label for="icu">Number of ICU<span class="mandatory">*</span> :</label>
            <input type="text" id="icu" name="icu" value="150" required>
        </div>
        <div class="form-group">
            <label for="cost_general_room">Cost of General Room<span class="mandatory">*</span> :</label>
            <input type="text" id="cost_general_room" name="cost_general_room" value="150" required>
        </div>
        <div class="form-group">
            <label for="cost_ac_room">Cost of AC Room<span class="mandatory">*</span> :</label>
            <input type="text" id="cost_ac_room" name="cost_ac_room" value="150" required>
        </div>
        <div class="form-group">
            <label for="cost_non_ac_room">Cost of Non-AC Room<span class="mandatory">*</span> :</label>
            <input type="text" id="cost_non_ac_room" name="cost_non_ac_room" value="150" required>
        </div>
        <div class="form-group">
            <label for="cost_icu">Cost of Each ICU<span class="mandatory">*</span> :</label>
            <input type="text" id="cost_icu" name="cost_icu" value="150" required>
        </div>

        <button type="submit">Submit</button>
    </form>

    <script src="./javascript/add_department.js">
    </script>
</body>
</html>
