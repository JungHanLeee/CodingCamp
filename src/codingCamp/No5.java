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
			System.out.print("인구수가 궁금한 도시: ");
			countryName=scanner.next();
			if(countryName.equals("종료"))
				break;
			else
			{
				Integer prn=country.get(countryName);
				System.out.println("인구수: "+prn);
				System.out.println("종료를 입력하면 종료됩니다.");
			}
		}
		
	}

}
