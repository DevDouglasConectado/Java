package contacorrente;

public class Exer02 {

	public static void main(String[] args) {
       
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "123";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		System.out.println("Salso da conta " + conta.numero + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
	      if(saqueEfetuado) {
	    	  System.out.println("Saque eetuado com sucesso ");
	    	  System.out.println("Saldo atual da conta =  " + conta.saldo);
	      }else {
	    	  System.out.println(" Não foi possivel realizar saque. Saldo insuficiente");

	      }
	      saqueEfetuado = conta.realizarSaque(500);
    	  System.out.println("Tentativa de saque de 500 reais ");

	      if(saqueEfetuado) {
	    	  System.out.println("Saque eetuado com sucesso ");
	    	  System.out.println("Saldo atual da conta =  " + conta.saldo);
	      }else {
	    	  System.out.println(" Não foi possivel realizar saque. Saldo insuficiente");

	      }
	      System.out.println("Depósito de 500 reais ");
	      conta.depositar(500);
          conta.consultarSaldo();
           
          if(conta.verificarUsoChegueEspecial()) {
        	  System.out.println("Esta usando check especial ");
          }else {
        	  System.out.println("Não está usando cheque especial ");

          }
          conta.realizarSaque(600);
          conta.consultarSaldo();
          if(conta.verificarUsoChegueEspecial()) {
        	  System.out.println("Esta usando check especial ");
          }else {
        	  System.out.println("Não está usando cheque especial ");

          }
	      
			}

}
