package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.loader.ParallelWebappClassLoader;
import org.apache.naming.java.javaURLContextFactory;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.factory.FactoryGenerator;
import com.hospital.UserData;

import java.util.Arrays;
import java.util.List;


@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Sign-in page");
		System.out.println("doPost: "+request);
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println("Username: "+userName+" Password: "+password);
		try {
			factory=FactoryGenerator.getFactory();
			session=factory.openSession();
			UserData userData= session.get(UserData.class, userName);
			if(userData!=null && password.equals(userData.getPassword())) {
					response.sendRedirect("index.jsp");
			}else {
				request.setAttribute("alertMessage", "Invalid username or password");
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		        dispatcher.forward(request, response);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
