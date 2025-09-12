import java.util.Scanner;

class Telecom{
	public static void main(String Args[]){
		int minutes=0;
		int newMin=0;
		double charge=0.0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your minutes:- ");
		minutes=s.nextInt();
		
		if((minutes<=30) && (minutes>0)){
			charge=minutes*2.00;
		}
		else if((minutes<=60) && (minutes>30)){
			newMin=minutes-30;
			charge=(30*2)+(newMin*1.5);
		}
		else if((minutes<=120) && (minutes>60)){
			newMin=minutes-60;
			charge=(30*2)+(30*1.50)+(newMin*1.00);
		}
		else if(minutes>120){
			newMin=minutes-120;
			charge=(30*2)+(30*1.50)+(60*1.00)+(newMin*0.50);
		}
		else{
			System.out.println("Your input is incorrect");
		}
		
		System.out.println("Your minutes is "+minutes);
		System.out.println("Your charge is "+charge+" Rupees");
	}
}
	
	