package empresa;

import java.text.NumberFormat;

public class Main {
	public static void main(String[] args) {

		ProducaoFuncionario funcionario1 = new ProducaoFuncionario("Sidnei");

		funcionario1.ficha.add(new Peca("Bauru", 700, 82.00, 1250));
		funcionario1.ficha.add(new Peca("chupeta", 700, 82, 1300));
		funcionario1.getObterDadosProducao();

		ProducaoFuncionario funcionario2 = new ProducaoFuncionario("Tiago");
		funcionario2.ficha.add(new Peca("Aro Batata", 800, 82, 1000));
		funcionario2.getObterDadosProducao();
		

		ProducaoFuncionario funcionario3 = new ProducaoFuncionario("Breno");
		funcionario3.ficha.add(new Peca("Aro Batata", 800, 82, 1200));
		funcionario3.getObterDadosProducao();


		Pagamento.pagamentoFuncionarios(funcionario1);
		Pagamento.pagamentoFuncionarios(funcionario2);
		Pagamento.pagamentoFuncionarios(funcionario3);

		System.out.println("Total a pagar ao funcionarios " + NumberFormat.getCurrencyInstance().format(Pagamento.totalpagar));

	}
}
