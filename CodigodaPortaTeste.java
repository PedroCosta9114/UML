package porta;

import java.util.Scanner;

public class CodigodaPortaTeste {
	static CodigodaPorta codigo = new CodigodaPorta();
	static Scanner scan = new Scanner(System.in);
	static int inserircodigo;
	static int inserirnovocodigo; 
	
	public static void main(String[] args) throws InterruptedException {
		int abrir;
		do {
			System.out.println("1 - Abrir a porta");
			System.out.println("2 - Trancar a Porta");
			System.out.println("3 - Alterar o C�digo");
			System.out.println("4 - Porta Trancada. Ajuda");
			abrir = scan.nextInt();
			switch (abrir) {
			case 1 :
				System.out.println("Inserir 4 digitos entre 0 e 9");
				inserircodigo = scan.nextInt();
				codigo.verificarcodigo();
				codigo.abriraporta();
				System.out.println("Porta Aberta");
				break;
			case 2 : 
				codigo.fecharaporta();
				System.out.println("Porta Fechada");
				break;
			case 3 : 
				alterarcodigo();
				break;
			case 4 : 
				System.out.println("N�mero de Tentativas esgotadas.");
				System.out.println("Poder� voltar a inserir o c�digo dentro de 5 segundos");
				break;
			default : 
				System.out.println("N�o existem mais op��es");
				break;
			}
				
			}while (abrir != 0);
		}
	public static void alterarcodigo() {
		
		boolean novocodigo = false;
		
		
		
		System.out.println("Inserir o c�digo atual : ");
		inserircodigo = scan.nextInt();
		
		System.out.println("Inserir novos 4 digitos entre 0 e 9 : ");
		inserirnovocodigo = scan.nextInt();
		
		int length = String.valueOf(inserirnovocodigo).length();
		
		if (inserirnovocodigo != codigo.getCodigo() && length == 4) {
			novocodigo = true;
			codigo.setCodigo(inserirnovocodigo);
			
		} else {
			novocodigo = false;
		}
	}

}