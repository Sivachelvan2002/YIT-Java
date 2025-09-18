class Student{
	int id;
	String name;
	int marks1;
	int marks2;
	int marks3;
	double total;
	double average;
	char result;
	
	Student(){
		this.id=001;
		this.name="Selvan";
	}
	
	void setStudent(int marks1,int marks2,int marks3){
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	void calcTotal(){
		this.total=marks1+marks2+marks3;
	}
	
	void calcAverage(){
		this.average=total/3;
	}
	
	void getResult(){
		if(this.average>=75){
			result='A';
		}
		else if(this.average>=65){
			result='B';
		}
		else if(this.average>=55){
			result='C';
		}
		else if(this.average>=40){
			result='S';
		}
		else{
			result='W';
		}
	}
	
	void Display(){
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Mark 01 : "+marks1);
		System.out.println("Mark 02 : "+marks2);
		System.out.println("Mark 03 : "+marks3);
		System.out.println("Total : "+total);
		System.out.println("Average : "+average);
		System.out.println("Result : "+result);
	}
		
	
		
	
	
	
	
}