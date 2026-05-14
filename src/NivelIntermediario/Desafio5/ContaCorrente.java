package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    //------------------- Sobrecarga de constructor----------

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoDeConta tipoDeConta) {
        super(saldo, tipoDeConta);
    }
    //-------------------------------------------------------
    //Sobrecarga dos metodos da superclasse:


    @Override
    public void depositar(double valor) {
        System.out.println("Voce depositou o valor de: " + valor);
        System.out.println("Seu novo saldo é de: " + saldo);
    }
    //Transferir valores:

    @Override
    public void transferirValor(double valorATtransferir, TipoDeConta tipoDeConta) {
        if (saldo< valorATtransferir){
            System.out.println("Você não tem saldo Suficiente!");

        } else if (tipoDeConta == TipoDeConta.CORRENTE){
            double novoSaldo = saldo-valorATtransferir;
            System.out.println("Voce transferiu: " + valorATtransferir);
            System.out.println("Seu novo saldo é de: " + novoSaldo );

        }else {
            System.out.println("Sua conta é do Tipo Poupança, voce não pode depositar por aqui!");
        }
    }
}
