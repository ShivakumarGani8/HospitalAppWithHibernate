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
			
			Query query= session.createQuery("from UserData where username =: userName");
			query.setParameter("userName", userName);
			List<UserData> resultSet= query.getResultList();
			
			if(!resultSet.isEmpty()) {
				response.getWriter().write("Data already exists!");
			}else {
				UserData userData = new UserData(email, userName, password);
				session.save(userData);
				response.getWriter().write("Data updated successfully");
	            response.getWriter().write("<script>alert('Data updated successfully');</script>");
	            transaction.commit();
			}

		} catch (Exception e) {
			if (transaction != null) transaction.rollback();
	        e.printStackTrace();
	        response.getWriter().write("Error updating data");
		} finally {
			session.close();
			factory.close();
		}
	}

}