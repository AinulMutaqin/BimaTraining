package com.bimapalma.day7;

import java.util.ArrayList;

public class PO {
	String header;
	ArrayList item;
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList getItem() {
		if (item==null) {
			item = new ArrayList();
		}
		return item;
	}
	public void setItem(ArrayList item) {
		this.item = item;
	}
	
	
	
}
