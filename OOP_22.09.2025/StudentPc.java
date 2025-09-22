class StudentPc{
	int id;
	String name;
	
	StudentPc(int id,String name){     //parameter constructor
		this.id=id;
		this.name=name;
	}
	
	void getStudent(){
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
}
		
		