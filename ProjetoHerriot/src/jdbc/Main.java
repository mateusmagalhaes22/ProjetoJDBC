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
			System.out.println("|| GERENCIAMENTO DE ESTOQUE ||");
			System.out.println("adicionar vendedor: 1 \n " + "remover vendedor: 2 \n" + "visualizar vendedor: 3 \n"
					+ "atualizar vendedor: 4 \n" + "adicionar produto: 5 \n" + "remover produto: 6 \n"
					+ "visualizar produto: 7 \n" + "atualizar produto: 8 \n" + "adicionar venda: 9 \n"
					+ "remover venda: 10 \n" + "visualizar venda: 11 \n" + "atualizar venda: 12 \n");
			System.out.print("digite um valor: ");
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