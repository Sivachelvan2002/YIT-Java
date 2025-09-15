import java.util.Scanner;

class ArrayLoop{
	public static void main(String args[]){
		double marksArray[]=new double[5];
		double total=0.0;
		double average=0.0;
		String results="";
		double positiveNumber=0.0;
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<marksArray.length;i++){
			System.out.print("Enter your marks :- ");
			if(scan.hasNextDouble()){
				positiveNumber=scan.nextDouble();
				
				if(positiveNumber>=0){
					for(int j=0;j<marksArray.length;j++){
						marksArray[j]=positiveNumber;
						total+=marksArray[j];
					    break;
					}
				}
				else{
					System.out.println("please enter positive number marks");
					i--;
				}
			}
			else{
				System.out.println("Invalid input");
				i--;
				scan.next();
			}
			for(int k=0;k<marksArray.length;k++){
		    System.out.println("your marks 0" +(k+1)+ " is "+(marksArray[k]));
		}
			
		}
			
					
		
		System.out.println("**********************************");
		
		
		System.out.println("**********************************");
		System.out.println("Your Total marks is "+total);
		average=(total/marksArray.length);
		System.out.println("Your average is "+average);
		
		if(average>=50.0){
			results="pass";
		}
		else{
			results="fail";
		}
		System.out.println(results);
		
		
	}
}
		
		
