package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.factory.FactoryGenerator;
import com.hospital.Department;
import com.hospital.Doctor;

@WebServlet("/AddDoctor")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Retrieve form data
		System.out.println("Doctor page");
		String firstName = request.getParameter("first_name");
		String middleName = request.getParameter("middle_name");
		String lastName = request.getParameter("last_name");
		String registrationNo = request.getParameter("registration_no");
		String dateOfBirth = request.getParameter("date_of_birth");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String specialization = request.getParameter("specialization");
		String qualification = request.getParameter("qualification");
		String contactNumber = request.getParameter("contact_number");
		String address = request.getParameter("address");
		String visitingTime = request.getParameter("visiting_time");
		String[] visitingDays = request.getParameterValues("visiting_days");
		int noOfPatientsPerDay = Integer.parseInt(request.getParameter("no_of_patients"));
		int departmentNo = Integer.parseInt(request.getParameter("department_no"));

		try {
			Doctor doctor = new Doctor(firstName, middleName, lastName, registrationNo, dateOfBirth, gender, email,
					specialization, qualification, contactNumber, address, visitingTime, visitingDays,
					noOfPatientsPerDay, departmentNo);
			factory = FactoryGenerator.getFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(doctor);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}
}
