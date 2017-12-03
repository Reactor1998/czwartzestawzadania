package czwartyzestawzadania;
import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args)
	{
		Scanner czytaj = new Scanner (System.in);
		
		System.out.print("Podaj zdanie zawierajace liczby");
		
		String zdanie = czytaj.nextLine();
		int wynik = 0;
		
		for(int i = 0 ; i < zdanie.length(); i ++)
		{
			if (Character.isDigit(zdanie.charAt(i))==true)
			{
				wynik=wynik+Character.getNumericValue(zdanie.charAt(i));
			}
			
			
			
		}
		System.out.print(wynik);

	}

}
