package Pessoas;

public class Pessoas {
    private String nome;
	private String cpf;
	private int idade;

    public Pessoas(String nome, String cpf, int idade ){
		this.nome = nome;
		this.cpf = cpf;
		setIdade(idade);
	}

	private void setIdade(int idade) {
        maiorIdade(idade);
	}
	

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}

	protected void imprimirInfoPessoas(){
		System.out.println(String.format("Nome: %s", this.nome));
		System.out.println(String.format("CPF: %s", this.cpf));
		System.out.println(String.format("Idade: %d", this.idade));
		
	}

	private void maiorIdade(int idade){
		if (idade < 18){
			System.out.println("Idade invalida");
		}else{
            this.idade = idade;
        }

	}
}
