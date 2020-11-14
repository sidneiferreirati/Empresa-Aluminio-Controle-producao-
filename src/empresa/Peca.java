package empresa;

public class Peca {
	String nome;
	int quantidade;
	double valorProducao;
	int quantidadeProduzida;

	public Peca(String nome, int quantidadeDaProducao, double valorProducao, int quantidadeProduzida) {
		this.nome = nome;
		this.quantidade = quantidadeDaProducao;
		this.valorProducao = valorProducao;
		this.quantidadeProduzida = quantidadeProduzida;

	}

	double obterValorProducaoDoDia() {
		double total = 0;
		total = valorProducao / quantidade * quantidadeProduzida;
		return total;
	}

}
