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
		return this.marks1+this.marks2+this.marks3;
		
	}
	
	double calcAverage(int total){
		double average=total/3;
		return average;
	}
	
	char getResult(double average){
		if(average>=75){
			return 'A';
		}
		else if(average>=65){
			return 'B';
		}
		else if(average>=50){
			return 'C';
		}
		else if(average>=35){
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
		int tot=this.calcTotal();
		double avg=this.calcAverage(tot);
		char result=this.getResult(avg);
		
		System.out.println("Total : "+tot);
		System.out.println("Average : "+avg);
		System.out.println("Result : "+result);
		
	}
}