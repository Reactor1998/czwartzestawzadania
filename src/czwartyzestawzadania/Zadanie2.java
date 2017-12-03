package czwartyzestawzadania;
import java.util.Scanner;


public class Zadanie2 {

	public static void main(String[] args) 
	{
		String napis2="";
		
		Scanner czytaj = new Scanner(System.in);
		
		System.out.print("Podaj ci¹g znaków");
		
		String napis1 = czytaj.next();
		
		for(int i =0 ; i<napis1.length();i++)
		{
			napis2=napis2+napis1.charAt(napis1.length()-1-i);
		}
		System.out.println(napis2);
	}

}
