package czwartyzestawzadania;
import java.util.Scanner;


public class Zadanie1 {

	public static void main(String[] args) 
	{
		int suma = 0;
		
		Scanner czytaj = new Scanner(System.in);
		
		System.out.println("Podaj ci¹g znaków");
		
		String znaki = czytaj.next();
		
		System.out.println(znaki);
		
		for(int i=0;i<znaki.length()-1;i++)
		{
			if(znaki.charAt(znaki.length()-1)==znaki.charAt(i))
			{
				suma=suma+1;
			}
			
			
		}
		System.out.print(suma);

	}

}
