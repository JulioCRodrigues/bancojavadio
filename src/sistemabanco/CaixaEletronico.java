package sistemabanco;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 17.0;
		
		if(valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			
			System.out.print(saldo);
		} else {
			System.out.print("O valor do saldo solicitado é maior do que o saldo atual!");
		}
	}

}
