import java.util.List;

import Conta.Conta;

public class Banco {

	private int Codigodobanco;
	private String nome;
	private List<Conta> contas;
	
	
	public int getCodigodobanco() {
		return Codigodobanco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
