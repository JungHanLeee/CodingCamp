package codingCamp;
import java.util.*;

public class No8 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		String regame;
		
		System.out.println("���� �����߽��ϴ�. ���纸����");
		while(true) {
			int low=0;
			int high=99;
			int n=(int)(Math.random()*100);
			int cnt=1;
			while(true) {
				System.out.println(low+"-"+high);
				System.out.print(cnt+">>");
				
				int answer=scanner.nextInt();
				
				if(answer==n){
					System.out.println("�����Դϴ�.");
					System.out.println("�ٽ��Ͻðڽ��ϱ�? (y/n)>>");
					regame=scanner.next();
					if(regame.equals("y")) {
						break;
					}
					else {
						System.exit(0);
					}
				}
				else if(answer>n) {
					System.out.println("DOWN");
					high=answer;
				}
				else {
					System.out.println("UP");
					low=answer;
				}
				
				cnt++;

			}
			
		}
	}

}
