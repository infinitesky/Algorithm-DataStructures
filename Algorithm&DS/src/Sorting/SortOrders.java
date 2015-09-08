package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortOrders implements Comparator<Orders>  {

	
	
	public static void main(String args[]){
	
		Orders ord1 = new Orders(3,"sofa","U");
		Orders ord2 = new Orders(1, "Recliner","R");
		Orders ord3 = new Orders(2,"LoveSeat","L");
		List<Orders> ordList = new ArrayList<Orders>();
		ordList.add(ord1);
		ordList.add(ord2);
		ordList.add(ord3);
		
		
		Collections.sort(ordList, new SortOrders());
		for (Orders ord: ordList)
		System.out.println("Order number: "+ ord.getOrdernum() + " Order Name: " + ord.getOrderName() + " Order Type: "+  ord.getOrderType());
		
		
		
		Collections.sort(ordList);
		for (Orders ord: ordList)
		System.out.println("Order number: "+ ord.getOrdernum() + " Order Name: " + ord.getOrderName() + " Order Type: "+  ord.getOrderType());
	}

	@Override
	public int compare(Orders o1, Orders o2) {
		Orders O1 = o1;
		Orders O2 = o2;
		return O1.getOrderName().compareTo(O2.getOrderName());
	}


	
}
