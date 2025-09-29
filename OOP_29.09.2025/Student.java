class Student{
	int id;
	String name;
	
	Student(){
		this.id=001;
		this.name="selvan";
	}
	
	Student(int id){
		this.id=id;
		this.name="arul";
	}
	Student(String name){
		this.id=002;
		this.name=name;
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void Display(){
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
}