package student;

//public class Check {

	//package collection.student;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	class Check {
		public static void student() {
			ArrayList<Student> al = new ArrayList<>();
			al.add(new Student(11, "Hari", 21, "irah"));
			al.add(new Student(2, "Arun", 61, "nura"));
			al.add(new Student(9, "Liffin", 8, "niffil"));
			al.add(new Student(50, "Karthi", 3, "ithrak"));
			
			Collections.sort(al);
			Collections.sort(al, new ComparatorAge());
			System.out.println(al);
			for (Student su : al) {
				System.out.println(su);
			}
			Scanner input = new Scanner(System.in);
			System.out.println("enter  the  name");
			String name = input.nextLine();
			
			for(Student st :al) {
				if (st.getName().equals(name)) {
					System.out.println("your age = "+st.getAge() +"   "+ "your nickname = " +st.getNickname());
					
				}
			}
		}
		public static void main(String[] args) {
			Check.student();
		}
		
		}

