import java.util.Scanner;

///Classes abstra

public class Programa {

	public static void main(String[] args) {
		
		
		
		Scanner scan= new Scanner(System.in); 
		
		System.out.print("Digite o nome do animal :");
		String nome = scan.next();
		
		System.out.printf("Qual a classe do %s",nome);
		
		System.out.print("\n 1- Aves 2-Peixes 3-Anfibios 4- Répteis 5- Mamiferos");
		
		int escolha =scan.nextInt();
		
		if(escolha==1)
		{
			Aves ave1 = new Aves();
			ave1.caracteristicasAnimal();
			ave1.caracteristicasCordados();
			ave1.caracteristicasAves();
		}
		if(escolha==2)
		{
			Peixes peixe1 = new Peixes();
			 peixe1.caracteristicasAnimal();
			 peixe1.caracteristicasCordados();
			 peixe1.caracteristicasPeixes();
		}
		if(escolha==3)
		{
			Anfibios anfibio1 = new Anfibios();
			anfibio1.caracteristicasAnimal();
			anfibio1.caracteristicasCordados();
			anfibio1.caracteristicasAnfibios();
		}
		if(escolha==4)
		{
			Repteis reptel1 = new Repteis();
			reptel1.caracteristicasAnimal();
			reptel1.caracteristicasCordados();
			reptel1.caracteristicasRepteis();
		}
		if(escolha==5)
		{
			
			
			System.out.print("\n O mamifero é 1-terrestre, 2-aereo ou 3-marinho ?\n");
			int escolha2 =scan.nextInt();
			
			if(escolha2 == 1)
			{
				Terrestre t1 = new Terrestre();
			
				t1.caracteristicasT_mamiferos();
				
			}
			
			if(escolha2 == 2)
			{
				aereo a1 = new aereo();
				a1.caracteristicasAereo();
				
			}
			
			if(escolha2 == 3)
			{
				marinho m1 = new marinho();
				m1.caracteristicasM_mamiferos();
				
			}
			
		}
		
		
		
	}
		
		
}
