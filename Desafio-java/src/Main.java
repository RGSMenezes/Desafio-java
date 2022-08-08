import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;
import Pessoas.Cliente;
import Pessoas.Funcionarios;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente gustavo = new Cliente("gustavo","111.111.111-47",18);
		Funcionarios flavio = new Funcionarios("Flavio","222.222.222-47", 42);

		flavio.setSalario(3200);
		
		Conta cc = new ContaCorrente(gustavo);
		Conta poupanca = new ContaPoupanca(gustavo);
		
		
		cc.depositar(100);
		cc.transferir(100, poupanca);

		flavio.imprimirInfoFuncionario();

		flavio.aumentarSalario(10);

		flavio.imprimirInfoFuncionario();

		gustavo.imprimirInfoCliente();
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
