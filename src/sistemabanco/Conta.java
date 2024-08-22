package sistemabanco;

public class Conta {
	
	// Variáveis comuns de uma conta bancária
	public String nomeTitularConta;
	public Integer numeroConta = 0;
	public Integer agenciaConta = 0;
	public Double saldo = 0.0;
	
	
	// Métodos da conta 
	
	
	// Adicionar saldo
	public void adicionarSaldo(Double novoSaldo) {
		saldo = novoSaldo;
	}
	
	public void reduzirSaldo(Double novoSaldoReduzido) {
		saldo = saldo - novoSaldoReduzido;
	}
	
	public void mostrarNomeCorrentista(String nome) {
		nomeTitularConta = nome;
		System.out.print("Olá, correntista " + nomeTitularConta + "!");
	}
	
	public void mostrarSaldoZerado() {
		if(saldo == 0) {
			System.out.print("O saldo está zerado, faça um depósito agora!");
		}
	}
	
	
}
