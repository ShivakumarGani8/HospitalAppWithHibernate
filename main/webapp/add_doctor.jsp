<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
    <form action="AddDoctor" method="post" onsubmit="return validateDoctorForm()">
        <!-- Doctor registration form fields -->
        <div class="form-group">
            <label for="first_name">First Name<span class="mandatory">*</span> :</label>
            <input type="text" id="first_name" name="first_name" value="Shiva" required>
        </div>
        <div class="form-group">
            <label for="middle_name">Middle Name</label>
            <input type="text" id="middle_name" name="middle_name">
        </div>
        <div class="form-group">
            <label for="last_name">Last Name<span class="mandatory">*</span> :</label>
            <input type="text" id="last_name" name="last_name" value="Gani" required>
        </div>
        <div class="form-group">
            <label for="registration_no">Registration No<span class="mandatory">*</span> :</label>
            <input type="text" id="registration_no" name="registration_no" value="1545" required>
        </div>
        <div class="form-group">
            <label for="date_of_birth">Date of Birth<span class="mandatory">*</span> :</label>
            <input type="date" id="date_of_birth" name="date_of_birth" value="26-05-1999" required>
        </div>
        <div class="form-group">
            <label for="gender">Gender<span class="mandatory">*</span> :</label>
            <input type="radio" id="male" name="gender" value="male" checked required> Male
            <input type="radio" id="female" name="gender" value="female" required> Female
            <input type="radio" id="others" name="gender" value="others" required> Others
        </div>
        <div class="form-group">
            <label for="email">Email<span class="mandatory">*</span> :</label>
            <input type="email" id="email" name="email" value="sfdfsf@gmail.com" required>
        </div>
        <div class="form-group">
            <label for="specialization">Specialization<span class="mandatory">*</span> :</label>
            <input type="text" id="specialization" name="specialization" value="MBBS" required>
        </div>
        <div class="form-group">
            <label for="qualification">Qualification<span class="mandatory">*</span> :</label>
            <input type="text" id="qualification" name="qualification" value="BE" required>
        </div>
        <div class="form-group">
            <label for="contact_number">Contact Number<span class="mandatory">*</span> :</label>
            <input type="text" id="contact_number" name="contact_number" value="1234567890" maxlength="10" required>
        </div>
        <div class="form-group">
            <label for="address">Address</label>
            <textarea id="address" name="address"></textarea>
        </div>
        <div class="form-group">
            <label for="visiting_time">Visiting Time<span class="mandatory">*</span> :</label>
            <input type="time" id="visiting_time" name="visiting_time" value="12:00" required>
        </div>
        <div class="form-group">
            <label for="visiting_days">Visiting Days<span class="mandatory">*</span> :</label>
            <select id="visiting_days" name="visiting_days" multiple required>
                <option value="Mon" selected>Monday</option>
                <option value="Tue">Tuesday</option>
                <option value="Wed">Wednesday</option>
                <option value="Thu">Thursday</option>
                <option value="Fri">Friday</option>
                <option value="Sat">Saturday</option>
                <option value="Sun">Sunday</option>
            </select>
        </div>
        <div class="form-group">
            <label for="no_of_patients">No Of Patients Per Day<span class="mandatory">*</span> :</label>
            <input type="text" id="no_of_patients" name="no_of_patients" value="12" required>
        </div>
        <div class="form-group">
            <label for="department_no">Department No<span class="mandatory">*</span> :</label>
            <input type="text" id="department_no" name="department_no" value="213" required>
        </div>

        <button type="submit">Submit</button>
    </form>

    <script src="./javascript/add_doctor.js">
    </script>
</body>
</html>
