class C1 extends A1 implements IB1{
	int z;
	C1(){
		this.z=50;
	}
	void getz(){
		System.out.println("Z : "+this.z);
	}
	public void gety(){
		System.out.println("Y : "+IB1.Y);
	}
}