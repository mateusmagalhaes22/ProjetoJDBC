package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Connection con = Conecta.start();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		int r = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("\n\n|| GERENCIAMENTO DE ESTOQUE ||");
			System.out.println("1- Adicionar vendedor\n" + "2- Remover vendedor\n" + "3- Visualizar vendedor\n"
					+ "4- Atualizar vendedor\n" + "5- Adicionar produto\n" + "6- Remover produto\n"
					+ "7- Visualizar produto\n" + "8- Atualizar produto\n" + "9- Adicionar venda\n"
					+ "10- Remover venda\n" + "11- Visualizar venda\n" + "12- Atualizar venda\n" + "13- Finalizar\n");
			System.out.print("Digite o número da operação que deseja efetuar: ");
			r = in.nextInt();
			System.out.print("\n");
			switch (r) {
			case 1: {
				if(VendedorController.addVendedor()) {
					System.out.println("vendedor adicionado");
				}
			}
			case 2: {
				if(VendedorController.removeVendedor()) {
					System.out.println("vendedor removido");
				}
			}
			case 3: {
				VendedorController.visualizaVendedor();
			}
			case 4: {
				if(VendedorController.atualizaVendedor()) {
					System.out.println("vendedor atualizado");
				}
			}
			case 5: {
				if(ProdutoController.addProduto()) {
					System.out.println("produto adicionado");
				}
			}
			case 6: {
				if(ProdutoController.removeProduto()) {
					System.out.println("produto removido");
				}
			}
			case 7: {
				ProdutoController.visualizaProduto();
			}
			case 8: {
				if(ProdutoController.atualizaProduto()) {
					System.out.println("produto atualizado");
				}
			}
			case 9: {
				if(VendaController.addVenda()) {
					System.out.println("venda adicionada");
				}
			}
			case 10: {
				if(VendaController.removeVenda()) {
					System.out.println("venda removida");
				}
			}
			case 11: {
				if(VendaController.atualizaVenda()) {
					System.out.println("venda atualizada");
				}
			}
			case 12: {
				VendaController.visualizaVenda();
			}
			default:
				System.out.printf("o valor %i é invalido", r);
				;
			}

		} while (r != 0);
	}
}