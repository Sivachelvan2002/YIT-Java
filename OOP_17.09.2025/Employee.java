class Employee{
	int id;
	String name;
	double basic_salary;
	double bonus=0.0;
	double total_salary=0.0;
	
	void setEmployee(int ids,String names,double basic_salarys){
		this.id=ids;
		this.name=names;
		this.basic_salary=basic_salarys;
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
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Basic Salary : "+this.basic_salary);
		System.out.println("Bonus : "+this.bonus);
		System.out.println("Total Salary : "+this.total_salary);
	}
}
		
			