class DefaultConstructor{
	int id;
	String name;
	
	DefaultConstructor(){
		this.id=1000;
		this.name="Selvan";
	}
	
	void getStudent(){
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
}