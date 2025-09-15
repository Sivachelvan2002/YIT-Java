class MainPen{
	public static void main(String args[]){
		Pen P;
		P=new Pen();
		
		P.Brand="ten";
		P.Color="blue";
		P.MadeIn="2025";
		P.Height=34.0d;
		P.Weight=10.0d;
		
		P.write();
		System.out.println(P.Height);
	}
}
		