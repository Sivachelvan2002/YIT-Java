class B5 extends A5{
	int y;
	B5(int y,int x){
		super(x);
		this.y=y;
	}
	
	void gety(){
		System.out.println("BY : "+this.y);
	}
}