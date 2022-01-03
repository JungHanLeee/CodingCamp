package codingCamp;
import java.util.*;
public class No2 {
	private static boolean equalint(int arr1[],int arr2[]) {
		int cnt=0;
		for(int i=0;i<5;i++) 
		{
			if(arr1[i]==arr2[i]) {
				cnt++;
			}
		}
		if(cnt==arr1.length)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arr1[]=new int[5];
		int arr2[]=new int[5];
		for(int i=0;i<5;i++) 
		{
			arr1[i]=scanner.nextInt();
			arr2[i]=scanner.nextInt();
		}
	
		boolean result=equalint(arr1, arr2);	
		System.out.print(result);
	}

}
