import java.util.Scanner;

class Ifelse{
	public static void main(String Args[]){
		int marks=0;
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter your marks:- ");
		marks=s.nextInt();
		
		if((marks>=75) && (marks <101)){
			System.out.println("A");
		}
		else if((marks>=65) && (marks<75)){
			System.out.println("B");
		}
		else if((marks>=50)&&(marks<65)){
			System.out.println("C");
		}
		else if((marks>=0) && (marks<50)){
			System.out.println("Fail");
		}
		else{
			System.out.println("Enter correct marks");
		}
		
		
	}
}