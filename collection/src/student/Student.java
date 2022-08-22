package student;



	public class Student implements Comparable<Student>  {
		int rollno;
		String name;
		int age;
		String nickname;
		
		
		public Student(){}
		
		public Student(int rollno, String name, int age, String nickname) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.age = age;
			this.nickname = nickname;
		}

		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", nickname=" + nickname + "]";
		}
		@Override
		public int compareTo(Student su) {
			// TODO Auto-generated method stub
			return rollno - su.rollno;
		}
	}

