class Student1{
	int id;
	String name;
	int marks1;
	int marks2;
	int marks3;
	
	Student1(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void setMarks(int marks1,int marks2,int marks3){
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	int calcTotal(){
		int total=this.marks1+this.marks2+this.marks3;
		return total;
		
	}
	
	double calcAverage(){
		double average=this.calcTotal()/3;
		return average;
	}
	
	char getResult(){
		double result=this.calcAverage();
		if(result>=75){
			return 'A';
		}
		else if(result>=65){
			return 'B';
		}
		else if(result>=50){
			return 'C';
		}
		else if(result>=35){
			return 'S';
		}
		else{
			return'W';
		}
		
		
	}
	
	void Display(){
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Marks 01: "+this.marks1);
		System.out.println("Marks 02: "+this.marks2);
		System.out.println("Marks 03: "+this.marks3);
		
		System.out.println("Total : "+this.calcTotal());
		System.out.println("Total : "+this.calcAverage());
		System.out.println("Total : "+this.getResult());
		
	}
}