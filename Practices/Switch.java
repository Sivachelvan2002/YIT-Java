import java.util.Scanner;

class Switch{
	public static void main (String Args[]){
		int day=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the day number :- ");
		day=scan.nextInt();
		
		
		
		switch(day){
			case 1:{
				System.out.println("Monday");
			break;
			}
			
			case 2:{
				System.out.println("Tuesday");
			break;
			}
			
			case 3:{
				System.out.println("Wednesday");
			break;
			}
			
			case 4:{
				System.out.println("Thursday");
			break;
			}
			
			case 5:{
				System.out.println("Friday");
			break;
			}
			
			case 6:{
				System.out.println("Saturday");
			break;
			}
				
			case 7:{
				System.out.println("Sunday");
			break;
			}
			default:{
				System.out.println("Input Error");
			break;
			}
		}
	}
}