package HashTable;

import java.util.ArrayList;

public class Hashing {
	LinkedList[] a;
	int key, index;
	Hashing(){
		a = new LinkedList[10];
		for(int i = 0; i<a.length; i++)
			a[i] = new LinkedList();
	}
	void insert(Student m){
		String k = m.getRegNo();
		a[getHash(k)].addAtEnd(m);
	}
	void search(String no){
		Student q = new Student();
		int i = getHash(no); 
		q = a[i].search(no);
		System.out.println(q.getName()+" "+q.getRegNo()+" "+q.getContact());
	}
	void delete(String no){
		int i = getHash(no); 
			a[i].remove(no);
	}
	void traverse(){
		int i = 0;
		while(i<10){
			System.out.println(i);
		for(i = 0; i<a.length; i++)
			a[i].displayAll();
	}}
	int getHash(String x){
		int e = 0;
		for(int i = 9 ,j = 2; i<x.length(); i++,j--)
			e += (int) ((char) x.charAt(i)*Math.pow(10, j));
		key = e;
		System.out.println(key);
		index = key%a.length;
		System.out.println(index);
		return index;
	}
}