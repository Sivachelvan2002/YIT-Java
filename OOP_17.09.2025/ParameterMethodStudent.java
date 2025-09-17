class ParameterMethodStudent{
	int id;
	String name;
	
	void setStudent(int ids,String names){
		id=ids;
		name=names;
	}
	
	void getStudent(){
		System.out.println("Your id is "+id);
		System.out.println("Your name is "+name);
	}
}