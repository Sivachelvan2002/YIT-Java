class ParameterConstructor{
	int id;
	String name;
	
	ParameterConstructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void getStudent(){
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
}
		