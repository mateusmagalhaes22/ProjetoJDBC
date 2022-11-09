package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class ProdutoController {
	static Scanner in = new Scanner(System.in);
	static ProdutoDao dao;

	public ProdutoController() {
		try {
			dao = new ProdutoDao();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean addProduto() {
		boolean r = true;
		try {
			Produto v = new Produto();
			System.out.println("vamos inserir um novo produto:");
			System.out.println("Codigo: ");
			v.setCodp(in.nextInt());
			System.out.println("Nome: ");
			v.setNomep(in.nextLine());
			System.out.println("Endereco: ");
			v.setPrecop(in.nextDouble());
			System.out.println("Sexo: ");
			v.setEstoquep(in.nextInt());
			dao.inserirProduto(v);
		} catch (Exception e) {
			r = false;
		}
		return r;
	}public static boolean removeProduto() {
		boolean r = true;
		try {
			System.out.println("deletando produto:");
			System.out.println("digite o codigo do produto:");
			dao.deletarProduto(in.nextInt());
		} catch (Exception e) {
			r = false;
		}
		return r;
	}public static boolean atualizaProduto() {
		boolean r = true;
		try {
			Produto v = new Produto();
			System.out.println("atualizando produto:");
			System.out.println("digite as informações do produto:");
			System.out.println("Codigo: ");
			int codp = in.nextInt();
			v.setCodp(codp);
			System.out.println("Nome: ");
			v.setNomep(in.nextLine());
			System.out.println("Endereco: ");
			v.setPrecop(in.nextDouble());
			System.out.println("Sexo: ");
			v.setEstoquep(in.nextInt());
			dao.alterarProduto(codp, v);
		} catch (Exception e) {
			r = false;
		}
		return r;
	}public static boolean visualizaProduto() {
		boolean r = true;
		try {
			System.out.println("visualizando produto:");
			System.out.println("digite o codigo do produto:");
			Produto v = dao.getProduto(in.nextInt());
			System.out.println("Codigo: " + v.getCodp());
			System.out.println("Nome: " + v.getNomep());
			System.out.println("Estoque: " + v.getEstoquep());
			System.out.println("Preco: " + v.getPrecop());
		} catch (Exception e) {
			r = false;
		}
		return r;
	}
}
