import java.util.Scanner;
class product1{
	
	public static void main(String Args[]){
		Scanner scan= new Scanner(System.in);
		double product=0.0;
		double tax=0.0;
		double total=0.0;
		double taxpercentage=0.0;
		
		System.out.print("Enter the product price : ");
		product=scan.nextDouble();
		
		if (product<=0){
			System.out.println("please enter the correct value");
		}
		else {
		
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
}