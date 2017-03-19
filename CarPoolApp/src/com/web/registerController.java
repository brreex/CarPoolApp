package com.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dataaccess.DataAcess;

import com.model.User;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/registerController")
public class registerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public registerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		
		
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		
		String state = request.getParameter("state");
		
		int bdate=0,zipcode=0;
		try{
			String bdTemp = request.getParameter("bdate");
			String zipTemp = request.getParameter("zipcode");
			 bdate = Integer.parseInt(bdTemp);
			 zipcode = Integer.parseInt(zipTemp);

			
		}catch(NumberFormatException e){
			
		}
		
		
		String ageMessage = "hidden";
		if ((LocalDate.now().getYear() - bdate) < 18) {
			ageMessage = "visible";
		} else {
			// Send to the database

		}
		// public void register(String firstName, String lastName,
		// String gender, int birthDate,
		// String email, String city, String state, String street, int
		// zipcode,String password,String username){
		// DataAcess.registerUser(firstName, lastName, gender, birthDate,
		// email,city,state,street,zipcode,password,username);
		User user = new User();
		user.register(fname, lname, gender, bdate,
				email, city, state, street, zipcode, password, username);
		
		request.setAttribute("ageMessage", ageMessage);

		// User user = new User(firstName,lastName,gender,bdate,email,);

	}

}
