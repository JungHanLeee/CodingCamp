package codingCamp;

public class Arrayint {
	void copy(int a[],int b[]) {
	}
	boolean compare(int a[],int b[]) {
		return false;
	}
	int sum(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	int[] sort(int a[]) {
		int tmp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
