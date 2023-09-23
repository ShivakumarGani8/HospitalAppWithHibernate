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
import com.hospital.Patient;

@WebServlet("/AddPatient")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Retrieve form data
		System.out.println("Patient page");
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String dateOfBirth = request.getParameter("date_of_birth");
		String gender = request.getParameter("gender");
		String fatherOrSpouseName = request.getParameter("father_spouse_name");
		String bloodGroup = request.getParameter("blood_group");
		String contactNumber = request.getParameter("contact_number");
		boolean visitedEarlier = request.getParameter("visited_earlier") != null;
		try {
			Patient patient = new Patient(firstName, lastName, dateOfBirth, gender, fatherOrSpouseName, bloodGroup,
					contactNumber, visitedEarlier);
			factory = FactoryGenerator.getFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(patient);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}
}
