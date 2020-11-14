package empresa;

public class Pagamento {
	static double totalpagar = 0;

	static double pagamentoFuncionarios(ProducaoFuncionario p) {
		totalpagar += p.obterValorTotal();
		return totalpagar;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Total Pagar R$" + String.format("%.2f", totalpagar);
	}
}
