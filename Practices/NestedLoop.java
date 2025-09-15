class NestedLoop{
	public static void main(String args[]){
	/*	int x=1;
		while(x<=5){
			if(x%2==1){
				int y=1;
				while(y<=5){
				System.out.print(y);
				y++;}
				
			System.out.println("");
			}
			
			else{
				System.out.println("*****");
			}
			x++;
			
			
		} */
		
		/*11111
		  22222
		  33333
		  44444
		  55555*/
		  
		  /*
		int x=1;
		while(x<=5){
			int y=1;
			while(y<=5){
				System.out.print(x);
				y++;
			}
			System.out.println("");
			x++;
		}
			*/

       /* 1*3*5
	      1*3*5
		  1*3*5
		  1*3*5
		  1*3*5   */
		  
		  int x=1;
		  while(x<=5){
			  if(x%2==1){
				  System.out.print(x);
			  }
			  else{
				  System.out.print(*);
			  }
			  x++;
			  
	}
	
}