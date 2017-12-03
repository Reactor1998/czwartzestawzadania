package czwartyzestawzadania;
import java.util.Scanner;

public class Zadanie2b {

	public static void main(String[] args) 
	{
		Scanner czytaj = new Scanner(System.in);
		
		System.out.println("Podaj slowo");
		
		String slowo = czytaj.next();
		
		char []	tab = new char[slowo.length()];
		
		
		for(int i =0;i<slowo.length();i++)
		{
			tab[i]=slowo.charAt(slowo.length()-1-i);
		}
		
		String slowo2= new String(tab);
		System.out.println(tab);

	}

}
