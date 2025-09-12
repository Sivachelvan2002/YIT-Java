import java.util.Scanner;

class Loops{
	public static void main(String Args[]){
		double product=0.0;
		double tax=0.0;
		double total=0.0;
		double taxpercentage=0.0;
		Scanner s= new Scanner(System.in);
		
		do{
			System.out.print("Enter product price:- ");
		    product=s.nextDouble();
				
		}while(product<=0);
		
		
		if((product>=0) && (product<100000)){
			taxpercentage=0.05;
			
		}
		else if((product>=100000) && (product<300000)){
			taxpercentage=0.08;
			
		}
		else if((product>=300000) && (product<500000)) {
			taxpercentage=0.12;
			
		}
		
		else if(product>=500000){
			taxpercentage=0.20;
			
		}
		else{
			System.out.println("Enter correct product Amount");
			
		}
		tax=(product*taxpercentage);
		System.out.println("product price is "+product);
		System.out.println("tax percentage is "+(taxpercentage*100)+"%");
		System.out.println("Tax Amount is "+tax);
		System.out.println("total price is "+(product+tax));
		
		
	}
}