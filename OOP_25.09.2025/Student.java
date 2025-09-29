class Student{
	int id;
	String name;
	
	void setStudent(){
		this.id=8;
		this.name="Selvan";
	}
	
	void setStudent(int id){
		this.id=id;
		this.name="kiri";
	}
	void setStudent(String name){
		this.id=10;
		this.name=name;
	}
	void setStudent(int id,String name){
		this.id=id;
		this.name=name;
	}
	void setStudent(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	void Display(){
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
}