import java.util.Scanner;
class StudentArray{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int NumberOfStudents=0;
		int NumberOfCourses=0;
		double Total=0.0;
		
		
		System.out.print("Enter NumberofStudents : ");
		NumberOfStudents=scan.nextInt();
		
		System.out.print("Enter NumberOfCourses : ");
		NumberOfCourses=scan.nextInt();
		
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
				StudentArray[i][j]=scan.nextInt();
				Total+=StudentArray[i][j];
				j++;
				
			}
			StudentTotal[i]=Total;
			
			Total=0.0;
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
		