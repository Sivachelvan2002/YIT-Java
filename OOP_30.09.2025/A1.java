class A1{
	private int y;
	int x;
	//private int z;
	private A1(){
		this.x=20;
	}
	A1(int y){
		this();
		this.y=y;
	}
		
	private void getx(){
		System.out.println("X : "+this.x);
		System.out.println("Y : "+this.y);
	}
	
	/*void getx(int z){
		this.getx();
		this.z=z;
		System.out.println("z : "+this.z);
	}*/
}