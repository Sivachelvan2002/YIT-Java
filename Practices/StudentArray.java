import java.util.Scanner;
class StudentArray{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int NumberOfStudents=0;
		int NumberOfCourses=0;
		double Total=0.0;
		int NumberOfStudentsValidCheck=0;
		int MarksValidCheck=0;
		
		while(true){
			System.out.print("Enter NumberofStudents : ");
		    if(scan.hasNextInt()){
				NumberOfStudentsValidCheck=scan.nextInt();
				if(NumberOfStudentsValidCheck>0){
					NumberOfStudents=NumberOfStudentsValidCheck;
					break;
				}
				else{
					System.out.println("Invalid input please Enter positive Number");
				}
			else{
				System.out.println("Invalid input please Enter Numeric value");
				scan.next();
			}
					
		while(true){
			System.out.print("Enter NumberOfCourses : ");
			if(scan.hasNextInt()){
				NumberOfStudentsValidCheck=scan.nextInt();
				if((NumberOfStudentsValidCheck>0)&&(NumberOfStudentsValidCheck<=100)){
					NumberOfCourses=NumberOfStudentsValidCheck;
					break;
				}
				else{
					System.out.println("Invalid Input please enter positive number!");
				}
			}
			else{
				System.out.println("Invalid input please enter numeric value!");
				scan.next();
			}
		}
				
		//NumberOfCourses=scan.nextInt();
		
		int StudentArray[][]=new int[NumberOfStudents][NumberOfCourses];
		String StudentName[]=new String[NumberOfStudents];
		double StudentTotal[]=new double[NumberOfStudents];
		
		for(int i=0;i<NumberOfStudents;i++){
			System.out.println("*******************************");
			System.out.println("");
			System.out.print("Enter your Name : ");
			StudentName[i]=scan.next();
			System.out.println(StudentName[i]);
			int j=0;
			while(j<NumberOfCourses){
				System.out.print("Enter Your mark 0"+(j+1)+" : ");
				while(true){
					if(scan.NextInt()){
						NumberOfStudentsValidCheck=scan.nextInt();
						if(NumberOfStudentsValidCheck>0){
							StudentArray[i][j]=NumberOfStudentsValidCheck;
							break;
						}
						else{
							System.out.println("Invalid input please enter positive number!");
						}
					}
					else{
						System.out.println("Invalid input please enter numeric value!");
						scan.next();
					}
				}
				StudentTotal[i]+=StudentArray[i][j];
				j++;
				
			}
			
		}
		System.out.println("");
		System.out.println("*******************************");
		System.out.println("");
		
		
		double Average[]=new double[NumberOfStudents];
		
		for(int k=0;k<NumberOfStudents;k++){
			System.out.println("");
			System.out.println(StudentName[k]);
			System.out.println("**********************");
			for(int l=0;l<NumberOfCourses;l++){
				System.out.println("Your Course 0"+(l+1)+" marks is "+StudentArray[k][l]);
			}
			Average[k]=(StudentTotal[k]/NumberOfCourses);
			System.out.println("Total "+StudentTotal[k]);
			System.out.println(StudentName[k]+" Average is "+Average[k]);
			
			
		}
	}
}
		