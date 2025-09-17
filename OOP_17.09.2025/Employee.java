class Employee{
	int id;
	String name;
	double basic_salary;
	double bonus=0.0;
	double total_salary=0.0;
	
	void setEmployee(int ids,String names,double basic_salarys){
		id=ids;
		name=names;
		basic_salary=basic_salarys;
	}
	
	void bonusCalculation(){
		if(basic_salary>=100000){
			bonus=(basic_salary*0.1);
		}
		else{
			bonus=(basic_salary*0.05);
		}
		total_salary=basic_salary+bonus;
	}
	
	void Display(){
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Basic Salary : "+basic_salary);
		System.out.println("Bonus : "+bonus);
		System.out.println("Total Salary : "+total_salary);
	}
}
		
			