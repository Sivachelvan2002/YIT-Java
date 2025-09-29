class B1 extends A1{
	int x=50;
	int y;
	B1(){
		this.y=70;
	}
	void gety(){
		System.out.println("BY : "+this.y);
		//this.getx();
		super.getx();
	}
	void getx(){
		//int x=100;
		System.out.println("BX : "+x);
		System.out.println("AX : "+x);
		System.out.println("X : "+x);
		//this.gety();
		
		//super.getx();
	}
}