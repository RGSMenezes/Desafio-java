package Pessoas;

public class Funcionarios extends Pessoas {

    private double salario;

    public Funcionarios(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
 
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }


    public void aumentarSalario(int percentualDeAumento){
        double valorDeAumento = 1 + (percentualDeAumento/100.00);
        this.salario = valorDeAumento * this.salario;

    }

    public void imprimirInfoFuncionario(){
		System.out.println("=== Informacoes do Funcionario ===");
		imprimirInfoPessoas();
        System.out.println(String.format("Salario: %.2f", getSalario()));
	}
    


}
