package czwartyzestawzadania;
import java.util.Scanner;


public class Zadanie5 {

	public static void main(String[] args) 
	{
		Scanner czytaj = new Scanner(System.in);
		
		int suma1=0, suma2=0;
		
		System.out.println("Podaj wyra¿aenie algerbraiczne , w któym mam srawdziæ poprawnoœæ sprawowania nawiasó");
		
		String wyrazenie = czytaj.nextLine();
		
		
		for(int i = 0 ; i < wyrazenie.length(); i++)
		{
			if (wyrazenie.charAt(i)== '(')
			{
				suma1=suma1+1;
			}
			
			if (wyrazenie.charAt(i)== ')')
			{
				suma2=suma2+1;
			}
			
		}
		if(suma1 == suma2)
		{
			System.out.println("wyra¿enie poprawnie sparowane");
			
		}
		else
		{
			System.out.println("wyra¿enie niepoprawnie sparowane");
		}
	}

}
