import java.util.Scanner;

public class TesteLoja {
	static Venda venda = new Venda();
	static Scanner scanner = new Scanner(System.in);
	static Refrigerante coca = new Refrigerante("8949461894984", "Coca-Cola","10/05/2025", 9, 25);
	static Cerveja boa = new Cerveja("9449466894964", "Antartica","15/04/2025", 3, 50);
	
	public static void main(String[] args) {
			coca.ajustaPrecoVenda();
			boa.ajustaPrecoVenda();
			System.out.println("===========================\nOlá seja bem vindo a loja\n===========================\n");
			
			System.out.println("Qual tipo de cliente você é?\n Digite 1 para Pessoa Fisica ou 2 para Pessoa Juridica:");
			int resposta = scanner.nextInt();
			
			cadastrarCliente(resposta, venda, scanner);
			
			realizarVenda();
			
			
		}
	
		public static void cadastrarCliente(int tipoPessoa, Venda venda, Scanner scanner) {
			if(tipoPessoa == 1) {
				System.out.println("Para realizar seu cadastro de Pessoa fisica informe:\n");
				System.out.println("\nIdade:");
				int idade = scanner.nextInt();
				System.out.println("\nCPF:");
				String cpf = scanner.nextLine();
				cpf = scanner.nextLine();
				System.out.println("\nEndereço:");
				String endereco = scanner.nextLine();
				
				ConsumidorPf pf = new ConsumidorPf(endereco, idade, cpf);
				venda.setCliente(pf);
			}else {
				System.out.println("\nPara realizar seu cadastro de Pessoa Juridica informe:");
				System.out.println("\nIdade:");
				int idade = scanner.nextInt();
				System.out.println("\nCNPJ:");
				String cpf = scanner.nextLine();
				cpf = scanner.nextLine();
				System.out.println("\nEndereço:");
				String endereco = scanner.nextLine();
				
				ConsumidorPj pj = new ConsumidorPj(endereco, idade, cpf);
				venda.setCliente(pj);
			}
		}
		
		public static void realizarVenda() {
			System.out.println("\n\nAgora realize uma compra, veja os produtos disponiveis");
			
			coca.exibeBebida();
			boa.exibeBebida();
			
			System.out.println("Qual você deseja comprar?\n 1-refrigerante 2-Cerveja");
			int resposta = scanner.nextInt();
			
			if(resposta == 1) {
				venda.setBebida(coca);
				System.out.println("Quantos refrigerantes você deseja?: ");
				int quantidade = scanner.nextInt();
				venda.setTotal(quantidade * coca.getPrecoVenda());
				venda.verificarQuantidade(quantidade, venda.getCliente(), venda.getBebida());
			}else {
				if(boa.verificaIdade(venda.getCliente())) {
					venda.setBebida(boa);
					System.out.println("Quantos cervejas você deseja?: ");
					int quantidade = scanner.nextInt();
					venda.setTotal(quantidade * boa.getPrecoVenda());
					venda.verificarQuantidade(quantidade, venda.getCliente(), venda.getBebida());
				}else {
					System.out.println("Compra bloqueada, você é menor de 18");
				}
				
			}
		}
	}
