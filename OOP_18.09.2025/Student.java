class Student{
	int id;
	String name;
	int marks1;
	int marks2;
	int marks3;
	double total;
	double average;
	char result;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
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
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Mark 01 : "+this.marks1);
		System.out.println("Mark 02 : "+this.marks2);
		System.out.println("Mark 03 : "+this.marks3);
		System.out.println("Total : "+this.total);
		System.out.println("Average : "+this.average);
		System.out.println("Result : "+this.result);
	}
		
	
		
	
	
	
	
}