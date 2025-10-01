class MainA{
	public static void main(String args[]){	
	A obja=new A();
	obja.getx();
	obja.x=30;
	obja.getx();
	
	A obja1=new A();
		obja1.getx();
		obja.getx();
		obja1.x=50;
		obja1.getx();
		obja.getx();
		A.x=70;
		A.getx();
		obja1.getx();
		
	A obja2=new A();
	   obja2.getx();
	   obja1.getx();
}
}