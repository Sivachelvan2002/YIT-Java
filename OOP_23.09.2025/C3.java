class C3 extends B3{
	int z;
	C3(int z,int y,int x){
		super(y,x);
		this.z=z;
	}
	void getz(){
		System.out.println("CZ : "+this.z);
	}
}