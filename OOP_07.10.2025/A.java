final class A{
	static final int X=20;
	A(){
		//X=20;
	}
	final void getX(){
		final int X=40;
		System.out.println("Ax : "+this.X);
		System.out.println("Ax : "+X);
	}
}