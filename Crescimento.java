import java.util.Scanner;

public class Crescimento
{
	public static void main (String [] args)
	{
		int casos, pa, pb, i, anos = 0;
		float ga, gb;

		Scanner scan = new Scanner(System.in);
		casos = scan.nextInt();
		for (i = 0; i < casos; i ++)
		{
			pa = scan.nextInt();	
			pb = scan.nextInt();
			ga = scan.nextFloat();
			gb = scan.nextFloat();
			anos = funcaoCrescimento(pa, pb, ga, gb);
			
			if (anos > 100)
			{
				System.out.println("Mais de 1 seculo.")	;	
			}
			else
			{
				System.out.println(anos + " anos.");
			}	
		}	
	}

	public static int funcaoCrescimento(int pa,int pb,float ga,float gb)
	{
		float crescimentoA = 0, crescimentoB = 0;	
		int anos = 0;
		while(crescimentoA <= crescimentoB || anos >100)
		{
			crescimentoA =  (float) (pa + pa * (ga/100) * anos);
			crescimentoB = (float) (pb + pb * (gb/100) * anos);
			anos = anos +1;
		}
		return anos;
	}		
}
