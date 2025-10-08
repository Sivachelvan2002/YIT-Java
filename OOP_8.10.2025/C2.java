class C2 implements IA2,IB2{
	int z;
	C2(){
		this.z=99;
	}
	public void getx(){
		System.out.println("X : "+IA2.X);
	}
	public void gety(){
		System.out.println("Y : "+this.Y);
	}
}