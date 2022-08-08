package Pessoas;

public class Cliente extends Pessoas  {

	public Cliente(String nome, String cpf, int idade) {
		super(nome, cpf, idade);

	}

	public void imprimirInfoCliente(){
		System.out.println("=== Informacoes do cliente ===");
		imprimirInfoPessoas();
	}

}
