package codingCamp;
import java.math.*;
import java.util.Random;

public class No1 {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int sum=0;
		
		for(int i=0;i<10;i++) 
		{
			arr[i]=(int) (Math.random()*100)+101;
		}
		for(int i=0;i<10;i++) 
		{
			sum+=arr[i];
		}
		System.out.print(sum/10);
	}

}
