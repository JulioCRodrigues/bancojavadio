package sistemabanco;

public class ContaBancaria {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.adicionarSaldo(0.0);
		//System.out.print("Novo saldo da conta: " + conta.saldo);
		
		conta.reduzirSaldo(50.00);
		System.out.print("Novo saldo da conta após reduzir: " + conta.saldo);
		
		conta.mostrarSaldoZerado();
		
		conta.mostrarNomeCorrentista("Julio Rodrigues");
		
	}
}
