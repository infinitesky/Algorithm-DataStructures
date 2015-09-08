package Sorting;

import java.util.Comparator;

public class Orders implements Comparable<Orders> {

	int ordernum;
	String orderName;
	String orderType;


	public Orders(int ordernum, String orderName, String orderType) {
		super();
		this.ordernum = ordernum;
		this.orderName = orderName;
		this.orderType = orderType;
	}

	public int getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(int ordernum) {
		this.ordernum = ordernum;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	
	public int compareTo(Orders o) {
		
		int ordernumber = o.getOrdernum();
		return this.ordernum - ordernumber;
		
		
		
	}

	
	
	




}
