package br.com.panobrincadeira.dados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.panobrincadeira.dominio.Pagamento;

public class StaticBD {
	private static List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	static {
		pagamentos.add(new Pagamento(1, "Mouse", LocalDate.of(2022, 8, 20), 45.00, true));
		pagamentos.add(new Pagamento(2, "Cadeira", LocalDate.of(2022, 8, 21), 890.00, false));
		pagamentos.add(new Pagamento(3, "Mix", LocalDate.of(2022, 8, 22), 350.00, false));
		pagamentos.add(new Pagamento(4, "Lava Louças", LocalDate.of(2022, 8, 20), 2500.00, true));
		pagamentos.add(new Pagamento(5, "Fogão", LocalDate.of(2022, 8, 23), 6000.00, false));
		pagamentos.add(new Pagamento(6, "Fatura celular", LocalDate.of(2022, 8, 23), 46.00, false));
		pagamentos.add(new Pagamento(7, "Agua", LocalDate.of(2022, 8, 12), 45.00, false));
		pagamentos.add(new Pagamento(8, "Lux", LocalDate.of(2022, 8, 12), 126.00, false));
		pagamentos.add(new Pagamento(9, "Ração do Dog", LocalDate.of(2022, 8, 18), 45.00, true));
		pagamentos.add(new Pagamento(10,"whey", LocalDate.of(2022, 8, 30), 100.00, false));
	}
	
	public static List<Pagamento> getPagamentos(){
		return pagamentos;
	}
}
