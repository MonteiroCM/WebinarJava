package br.com.panobrincadeira.teste;

import java.time.LocalDate;

import br.com.panobrincadeira.dados.StaticBD;

public class TestePagamento {
	public static void main(String[] args) {
		List<Pagamento> pagamentos = StaticBD.getPagamentos();
		System.out.println("Lista de pagamentos: ");
		pagamentos.forEach(System.out::println);
		
		System.out.println("\nPagamento para hoje:");
		double totalHoje = StaticBD.getPagamentos()
				.stream().filter(p -> p.getDataVencimento().equals(LocalDate.now()))
				.mapToDouble(Pagamento::getValor).sum();
		System.out.print("Total para Hoje: " + totalHoje);
	}
}
