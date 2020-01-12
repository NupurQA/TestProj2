import java.util.*;
public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=Math.random();
		System.out.println(a);
		//Random r=new Random();
		Random randomClass = new Random();
		System.out.println(randomClass.nextInt(10));
		
	      
		 for(int i =0; i<5; i++){
		      int randomInteger = randomClass.nextInt(100);
		      System.out.println("Random Integer in Java: " + randomInteger);
		 }


	}

}
