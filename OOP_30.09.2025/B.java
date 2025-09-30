class B extends A{
	int y;
	B(){
		this.y=30;
	}
	void gety(){
		System.out.println("BY : "+this.y);
	}
	void getx(int x){
		System.out.println("ABX : "+super.x);
		System.out.println("BX : "+x);
	}
}