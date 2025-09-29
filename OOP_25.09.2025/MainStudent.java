class MainStudent{
	public static void main(String args[]){
		Student stu1=new Student();
		stu1.setStudent();
		stu1.Display();
		
		Student stu2=new Student();
		stu2.setStudent(001);
		stu2.Display();
		
		Student stu3=new Student();
		stu3.setStudent("Ultra");
		stu3.Display();
		
		Student stu4=new Student();
		stu4.setStudent(002,"Arul");
		stu4.Display();
		
		Student stu5=new Student();
		stu5.setStudent("gowtham",007);
		stu5.Display();
	}
}
		