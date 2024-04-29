package com.parctice.arraylist;

import java.util.ArrayList;

public class Arrays {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(22);list.add(22);list.add(22);
		list.add(0, 45);
		System.out.println(list);
	}

}
