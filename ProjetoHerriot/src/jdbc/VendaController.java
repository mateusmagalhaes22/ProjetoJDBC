package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class VendaController {
	static Scanner in = new Scanner(System.in);
	static VendaDao dao;

	public VendaController() {
		try {
			dao = new VendaDao();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean addVenda() {
		boolean r = true;
		try {
			Venda v = new Venda();
			System.out.println("vamos inserir uma nova venda:");
			System.out.println("Nota fiscal: ");
			v.setNf(in.nextInt());
			System.out.println("Codigo do vendedor: ");
			v.setCodvendedor(in.nextInt());
			System.out.println("Codigo do produto: ");
			v.setCodproduto(in.nextInt());
			System.out.println("Valor total: ");
			v.setValorvenda(in.nextDouble());
			System.out.println("quantidade do produto: ");
			v.setQtdproduto(in.nextInt());
			System.out.println("data da venda: ");
			v.setDtvenda(in.nextLine());
			dao.inserirVenda(v);
		} catch (Exception e) {
			r = false;
		}
		return r;
	}public static boolean removeVenda() {
		boolean r = true;
		try {
			System.out.println("deletando venda:");
			System.out.println("digite a nota fiscal da venda:");
			dao.deletarVenda(in.nextInt());
		} catch (Exception e) {
			r = false;
		}
		return r;
	}public static boolean atualizaVenda() {
		boolean r = true;
		try {
			Venda v = new Venda();
			System.out.println("atualizando venda:");
			System.out.println("digite as informações da venda:");
			System.out.println("Nota fiscal: ");
			int nf = in.nextInt();
			v.setNf(nf);
			System.out.println("Codigo do vendedor: ");
			v.setCodvendedor(in.nextInt());
			System.out.println("Codigo do produto: ");
			v.setCodproduto(in.nextInt());
			System.out.println("Valor total: ");
			v.setValorvenda(in.nextDouble());
			System.out.println("quantidade do produto: ");
			v.setQtdproduto(in.nextInt());
			System.out.println("data da venda: ");
			v.setDtvenda(in.nextLine());
			dao.alterarVenda(nf, v);
		} catch (Exception e) {
			r = false;
		}
		return r;
	}public static boolean visualizaVenda() {
		boolean r = true;
		try {
			System.out.println("visualizando venda:");
			System.out.println("digite a nota fiscal da venda:");
			Venda v = dao.getVenda(in.nextInt());
			System.out.println("Nota Fiscal: " + v.getNf());
			System.out.println("Codigo Do Vendedor: " + v.getCodvendedor());
			System.out.println("Codigo Do Produto: " + v.getCodproduto());
			System.out.println("Valor Total: " + v.getValorvenda());
			System.out.println("Quantidade Do Produto: " + v.getQtdproduto());
			System.out.println("Data Da Venda: " + v.getDtvenda());
		} catch (Exception e) {
			r = false;
		}
		return r;
	}
}
