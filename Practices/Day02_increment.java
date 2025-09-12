class Increment{
	
	public static void main(String Args[]){
		int i=15;
		int j=6;
		int k=3;
		
		i=(j++ - k++ - --i);
		
		System.out.println(i);
		
		k= --i - ++j + --k - j--;
		System.out.println(k);
		
		j= ++i - --i + ++j - k++;
		System.out.println(j);
	}
}