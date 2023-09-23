<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
    <form action="AddPatient" method="post" onsubmit="return validatePatientForm()">
        <div class="form-group">
            <label for="first_name">First Name<span class="mandatory">*</span> :</label>
            <input type="text" id="first_name" name="first_name" value="Shiva" required>
        </div>
        <div class="form-group">
            <label for="last_name">Last Name<span class="mandatory">*</span> :</label>
            <input type="text" id="last_name" name="last_name" value="Gani" required>
        </div>
        <div class="form-group">
            <label for="date_of_birth">Date of Birth<span class="mandatory">*</span> :</label>
            <input type="date" id="date_of_birth" name="date_of_birth" value="07-08-2023" required>
        </div>
        <div class="form-group">
            <label for="gender">Gender<span class="mandatory">*</span> :</label>
            <input type="radio" id="male" name="gender" value="male" checked required> Male
            <input type="radio" id="female" name="gender" value="female" required> Female
            <input type="radio" id="others" name="gender" value="others" required> Others
        </div>
        <div class="form-group">
            <label for="father_spouse_name">Father/Spouse Name:</label>
            <input type="text" id="father_spouse_name" name="father_spouse_name">
        </div>
        <div class="form-group">
            <label for="blood_group">Blood Group<span class="mandatory">*</span> :</label>
            <select id="blood_group" name="blood_group" required>
                <option value="0+" selected>0+</option>
                <option value="0-">0-</option>
                <option value="A+">A+</option>
                <option value="A-">A-</option>
                <option value="B+">B+</option>
                <option value="B-">B-</option>
                <option value="AB+">AB+</option>
                <option value="AB-">AB-</option>
            </select>
        </div>
        <div class="form-group">
            <label for="contact_number">Contact Number<span class="mandatory">*</span> :</label>
            <input type="text" id="contact_number" name="contact_number" value="1234567890" required>
        </div>
        <div class="form-group">
            <label for="visited_earlier">Visited Earlier</label>
            <input type="checkbox" id="visited_earlier" name="visited_earlier">
        </div>

        <button type="submit">Submit</button>
    </form>

    <script src="./javascript/add_patient.js">
    </script>
</body>
</html>
