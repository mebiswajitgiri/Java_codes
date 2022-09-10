package com.company.c;

import com.company.Javagenerics.MyArrayList;

public class Main {

    public static void main(String[] args) {
//	ArrayList<Integer> list = new ArrayList<>();
//	list.add(45);
//	list.get(0);
//	list.add(1,34);
//	list.size();
//	list.set(0,54);
//		CustomArrayList list = new CustomArrayList();
//		list.add(45);
//		list.add(57);
//		list.add(11);
//		list.add(9);
//		System.out.println(list);
//		list.add(2,0);
//		System.out.println(list);
//		list.set(0,1);
//		System.out.println(list);
//		System.out.println(list.size());
//		Box box = new Box();
//		box.set(67);
//		box.set("Biswajit");
//		box.get();
		MyArrayList<String> s = new MyArrayList<>();
		for(int i=0;i<25;i++)
		{
			s.add("Biswajit");
		}
		s.set(1,"Giri");
		MyArrayList<Integer> i = new MyArrayList<>();
		for(int j=0;j<25;j++)
		{
			i.add(j*5);
		}
		i.set(1,1);

    }
}
