class B extends A{
	int y;
	//int x;
	B(int y,int x){
		super(x);
		this.y=y;
		this.x=20;
	}
	void gety(){
		System.out.println("BY : "+this.y);
	}
	
	void getx(){
		
		System.out.println("BX : "+this.x);
		super.getx();
	}
}