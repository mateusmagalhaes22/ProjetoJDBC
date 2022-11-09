package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class VendedorController {
	static Scanner in = new Scanner(System.in);
	static VendedorDao dao;

	public VendedorController() {
		try {
			dao = new VendedorDao();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean addVendedor() {
		boolean r = true;
		try {
			Vendedor v = new Vendedor();
			System.out.println("vamos inserir um novo vendedor:");
			System.out.println("Nome: ");
			v.setNomev(in.nextLine());
			System.out.println("Endereco: ");
			v.setEndereco(in.nextLine());
			System.out.println("Sexo: ");
			v.setSexo(in.nextLine());
			System.out.println("Codigo: ");
			v.setCodv(in.nextInt());
			System.out.println("CPF: ");
			v.setCpf(in.nextInt());
			dao.inserirVendedor(v);
		} catch (Exception e) {
			r = false;
		}
		return r;
	}public static boolean removeVendedor() {
		boolean r = true;
		try {
			System.out.println("deletando vendedor:");
			System.out.println("digite o codigo do vendedor:");
			dao.deletarVendedor(in.nextInt());
		} catch (Exception e) {
			r = false;
		}
		return r;
	}public static boolean atualizaVendedor() {
		boolean r = true;
		try {
			Vendedor v = new Vendedor();
			System.out.println("atualizando vendedor:");
			System.out.println("digite as informações do vendedor:");
			System.out.println("Codigo: ");
			int codv = in.nextInt();
			v.setCodv(codv);
			System.out.println("Nome: ");
			v.setNomev(in.nextLine());
			System.out.println("Endereco: ");
			v.setEndereco(in.nextLine());
			System.out.println("Sexo: ");
			v.setSexo(in.nextLine());
			dao.alterarVendedor(codv, v);
		} catch (Exception e) {
			r = false;
		}
		return r;
	}public static boolean visualizaVendedor() {
		boolean r = true;
		try {
			System.out.println("visualizando vendedor:");
			System.out.println("digite o codigo do vendedor:");
			Vendedor v = dao.getVendedor(in.nextInt());
			System.out.println("Codigo: " + v.getCodv());
			System.out.println("Nome: " + v.getNomev());
			System.out.println("CPF: " + v.getCpf());
			System.out.println("Endereco: " + v.getEndereco());
			System.out.println("Sexo: " + v.getSexo());
		} catch (Exception e) {
			r = false;
		}
		return r;
	}
}
