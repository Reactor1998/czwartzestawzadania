package czwartyzestawzadania;
import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args)
	
	{
		boolean czypalindrom = true;
		
		Scanner czytaj = new Scanner(System.in);
		
		System.out.print("Podaj ci¹g znaków , które mam sprawdziæ");
		
		String zdanie = czytaj.next();
		
		
		
		for(int i = 0 ; i < zdanie.length();i++)
		{
			if(zdanie.charAt(i)!=zdanie.charAt(zdanie.length()-1-i))

				{
					czypalindrom=false;
				}
				else
				{
					czypalindrom=true;
				}

			
		}
		System.out.print(czypalindrom);
					


	}

}
