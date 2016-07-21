package com.bimapalma.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bimapalma.model.Item;

/**
 * Servlet implementation class ItemServlet
 */
public class ItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String word = request.getParameter("word");
		String sendback = "You send me: " +word;
		request.setAttribute("send", sendback);
		
		String angka1 = request.getParameter("angka1");
		String angka2 = request.getParameter("angka2");
		
		int hasil = Integer.parseInt(angka1) + Integer.parseInt(angka2);
		request.setAttribute("hasil", hasil);
		
		Item item1 = new Item("Kertas A4", 37000.0, 5);
		Item item2 = new Item("Printer HP", 45000.0, 3);
		Item item3 = new Item("Scanner Cannon", 25000.0, 2);
		
		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		request.setAttribute("barang", items);
		
		request.getRequestDispatcher("/itemList.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
