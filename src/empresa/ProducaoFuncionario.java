package empresa;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ProducaoFuncionario {
	String nomeFuncionario;

	public ProducaoFuncionario(String nome) {
		this.nomeFuncionario = nome;
	}

	ArrayList<Peca> ficha = new ArrayList<Peca>();

	double obterValorTotal() {
		double total = 0;
		for (Peca peca : ficha) {
			total += peca.valorProducao / peca.quantidade * peca.quantidadeProduzida;

		}
		return total;
	}

	void getObterDadosProducao() {
		for (Peca peca : ficha) {
			System.out.println("Nome do fundidor: " + this.nomeFuncionario + "\nPeça: " + peca.nome + "\nProdução: "
					+ peca.quantidade + "\nQuantidade produzida: " + peca.quantidadeProduzida + "\nValor: "
					+ NumberFormat.getCurrencyInstance().format(peca.obterValorProducaoDoDia()) +"\n");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Total a receber ", NumberFormat.getCurrencyInstance().format(obterValorTotal()));
	}

}
