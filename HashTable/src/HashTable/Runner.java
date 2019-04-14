package HashTable;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student s[] = new Student[100];
		Student s1 = new Student("Areeb Siddiqui", "FA16-BCS-084", "0334-2887281");
		Student s2 = new Student("AbdulRehman", "FA16-BCS-124", "0332-6694310");
		Student s3 = new Student("Maida Shaheen", "FA16-BCS-122", "0343-2567411");
		Student s4 = new Student("Affan Arshad", "FA16-BCS-125", "0332-5092209");
		Student s5 = new Student("Linta Anmol", "FA16-BCS-128", "0325-6428328");
		Hashing h = new Hashing();
		//You can add 100 students by using following
//		for(int i = 0; i<100; i++){
//			int c = input.nextInt();
//			if(c==0)
//				break;
//			s[i] = new Student(input.next(), input.next(), input.next());
//			h.insert(s[i]);
//		}
		h.insert(s1);
		h.insert(s2);
		h.insert(s3);
		h.insert(s4);
		h.insert(s5);
		h.traverse();
//		h.search("FA16-BCS-124");
//		h.delete("FA16-BCS-128");
//		h.getHash(s1.getRegNo());
//		h.traverse();
	
	}
}
