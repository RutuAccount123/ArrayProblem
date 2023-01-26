package com.array;

import java.util.HashSet;

public class Array1 {

	public static void main(String[] args) {
		int a[]= {1,5,3,7,3,5,2};
		
   HashSet<Integer> hs=new HashSet<Integer>();
   for(int i=0;i<a.length;i++) {
	   hs.add(i); 
   }
   for(int j:hs) {
	   System.out.print(" "+j);
   }
   
	}

}
