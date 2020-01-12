
public class Patterns {
	
	public static void main(String a[])
	{
	
			 
		/*	
			 for (int x = 1; x <= 10; x++) {
			 for (int y = 1; y <= x; y++) {
			 System.out.print(y+" ");
			 }
			 System.out.println();
			 }
			 */
		
		
		//Fibonacci 
		
		/*int b=0;
		int c=1;
		int d;
		for(int i=1;i<=10;i++)
		{
			d=b+c;
			System.out.print(d+" ");
		b=c;
		c=d;
			
		}*/
		
		//StringReverse
		/*String s="hello java";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
		for(int i=s.length()-1;i>=0;i--)
			
		{
			System.out.print(s.charAt(i));
		}
			 
			
	}*/
		
	
	//largest in array
	
	int[] arr={28,3,15,9,17,4,23,2};
	int val=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(val<arr[i])
		{
			val=arr[i];
	}
	}
		System.out.println(val);
	

}
}


