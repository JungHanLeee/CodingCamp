package codingCamp;
import java.util.HashMap;
import java.util.*;
public class No5 {
	class CountryPopulation{
		String country;
		int population;
		public CountryPopulation(String country,int population) {
			this.country=country;this.population=population;
		}
	}
	public static <V, K> void main(String[] args) {
		HashMap<String,Integer> country= new HashMap<String,Integer>();
		Scanner scanner=new Scanner(System.in);
		String countryName = null;
		int population = 0;
		int num=0;
		for(int i=0;i<3;i++) 
		{
			countryName=scanner.next();
			population=scanner.nextInt();
			country.put(countryName, population);
		}
		while(true) 
		{
			System.out.print("�α����� �ñ��� ����: ");
			countryName=scanner.next();
			if(countryName.equals("����"))
				break;
			else
			{
				Integer prn=country.get(countryName);
				System.out.println("�α���: "+prn);
				System.out.println("���Ḧ �Է��ϸ� ����˴ϴ�.");
			}
		}
		
	}

}
