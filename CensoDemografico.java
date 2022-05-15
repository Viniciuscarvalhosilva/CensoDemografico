package censoDemografico;
import java.util.Scanner;
public class CensoDemografico 
{

	public static void main(String[] args) 
	{
		int menu = 0,c = 0,idMasc = 0,id1= 0,id2 = 0 ,idGrupo = 0;							//variaveis do tipo inteiro
		float masc = 0,fem = 0, grupo = 0,medIdG = 0,medAltF = 0,medIdH = 0, altFem = 0, alt1 = 0,altGrupo = 0;	//variaveis do tipo float
		double entre =0,perc = 0;																				//variaveis do tipo double
		Scanner read = new Scanner(System.in);
		
		System.out.println("**********************************");								
		System.out.println("******* CENSO DEMOGRAFICO ********");												//exibe na tela do usuario
		System.out.println("**********************************");
		
		
		
		for(int i = 0;i<=999;i++)											//laço for 'i' declarado como inteiro, enquanto i <= 999, i recebe i+1
		{
			do 															//laço do while  ( faca)
			{
				
				System.out.println(" ________________________________");
				System.out.println("|          Qual seu GENERO:      |\n|________________________________|\n\n(0)feminino\n(1)masculino\n(2)outros");
				menu = read.nextInt();
			

				switch (menu)									// estrutura condicional
				{
				case 0:											//Se caso 0
					System.out.print("Feminino\n");				//exibe na tela (feminino)
					break;

				case 1:
					System.out.print("Masculino\n");
					break;

				case 2:
					System.out.print("Outros\n");
					c = c+1;									//variável 'c' recebe c + 1
					break;

				default:
							
					
					System.out.println("\n*********OPCAO INVALIDA**********\n");
				}	
				
			}
			
			while(menu >= 3);									// laço 'do while' faça enquanto switch for >= 3
			
			
					
								
				
				if(menu == 1)									//estrutura condicional se menu = 1
				{
					
					System.out.println(" ________________________________");
					System.out.println("|        Qual sua IDADE:         |"); 	 // exibe na tela
					System.out.println("|________________________________|");
					idMasc = read.nextInt();									//Grava valor digitado na variável 'idMasc'
					System.out.printf("\n%d ANOS\n",idMasc);					//Exibe valor digitado na tela do usuario
					id1 = id1 + idMasc;											//Variável ' id1' recebe ela mesmo + idMasc
					masc = masc+1;												// variável ' masc recebe masc+1
					if(idMasc >= 18 && idMasc <= 35)							//se idade estiver entre 18 e 35
					{
						entre = entre + 1;										//variável 'entre' recebe entre +1
					}
				}
				else											//se não
				{
					System.out.println(" ________________________________");
					System.out.println("|         Qual sua IDADE:        |");
					System.out.println("|________________________________|");
					idGrupo = read.nextInt();									//grava valor digitado na variável'idGrupo'
					System.out.printf("\n%d ANOS\n",idGrupo);
					id2 = id2 + idGrupo;
					if(idGrupo >= 18 && idGrupo <= 35)
					{
						entre = entre + 1;
					}
				}
				if(menu == 0)
				{
					System.out.println(" ________________________________");
					System.out.println("|         Qual sua ALTURA:       |");  
					System.out.println("|________________________________|");
					altFem = read.nextFloat();
					System.out.printf("\n%.2f Metros\n",altFem);
					alt1 = alt1 + altFem;
					fem = fem + 1;
				}
				else
				{
					System.out.println(" ________________________________");
					System.out.println("|       Qual sua ALTURA:         |");
					System.out.println("|________________________________|");
					altGrupo= read.nextFloat();
					System.out.printf("\n%.2f Metros\n",altGrupo);
					grupo = grupo + altGrupo;
				}
				System.out.println("\n################################################ FIM ########################################################\n");
				System.out.print("");
				
						
		}
		medIdG = (id1 + id2)/1000;											//soma todas as idades e divide por 1000
		System.out.printf("\nMEDIA DA IDADE DO GRUPO:\n%.2f\n",medIdG);
		
		medIdH = id1/masc;												//soma da idade dos homens e divide pela quantidade de homens
		System.out.printf("\nMEDIA DA IDADE DOS HOMENS:\n%.2f\n",medIdH);
		
		medAltF = alt1/fem;												//soma da altura das mulheres e divide pela quantidade de mulheres
		System.out.printf("\nMEDIA DA ALTURA DAS MULHERES:\n%.2f\n",medAltF);
		
		System.out.printf("\n%d PESSOAS SE IDENTIFICARAM COMO OUTROS\n",c);  //exibe quantidade de pessoas com genero 'outros'
		
		perc =  entre*0.1;													//idade entre 18 e 35 * 0.1(porcentagem de 1000)
		System.out.printf("\n%d%% DAS PESSOAS ENTREVISTADAS TEM ENTRE 18 E 35 ANOS",perc);
		
		
		
		
		
		
	}

}
