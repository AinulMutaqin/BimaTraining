package com.bimapalma.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bimapalma.model.Person;

/**
 * Servlet implementation class FirstWebApp
 */
public class FirstWebApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstWebApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		out.print("<h1>Heelo My Tomcat. This is servlet</h1>");
		Person person = new Person("Ainul Mutaqin", "Ciomas, Bogor");
		request.setAttribute("person", person);
		
		Person anak1 = new Person("Dodi", "Bandung");
		Person anak2 = new Person("John", "Jakarta");
		Person anak3 = new Person("Dodi", "Bogor");
		Person anak4 = new Person("Dodi", "Padang");
		
		
//		orang.setNama("Ainul Mutaqin");
//		orang.setAlamat("Ciomas, Bogor");
		
		List<Person> children = new ArrayList<Person>();
		children.add(anak1);
		children.add(anak2);
		children.add(anak3);
		children.add(anak4);
		
		request.setAttribute("children", children);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/person.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
