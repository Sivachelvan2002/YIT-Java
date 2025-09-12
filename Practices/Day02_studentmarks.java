import java.util.Scanner;

class studentMarks{
	
	
	public static void main (String Args[]){
		
		int marks=0;
		int stmarks=0;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter your marks :- ");
		stmarks=scan.nextInt();
		
		if(marks<0){
			System.out.println("Enter correct Marks ");
		}
		else{
			if(marks>=50){
				System.out.println("pass");
			}
			else if(marks<50){
				System.out.println("Fail");
			}
			else{
				System.out.println("Enter correct input");
			}
		}
		
		
		
	}
}