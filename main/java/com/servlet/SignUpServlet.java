package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator.RequestorType;
import java.util.List;

import javax.persistence.PersistenceException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.ResponseUtil;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import com.factory.FactoryGenerator;
import com.hospital.UserData;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SessionFactory factory;
	private Session session;
	private Transaction transaction;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doPost(request, response);
		String email = request.getParameter("email");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			factory = FactoryGenerator.getFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();

			UserData userData = new UserData(email, userName, password);
			session.save(userData);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			session.close();
			factory.close();
		}
	}

}