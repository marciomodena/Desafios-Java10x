package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{
    //Sobrecarga dos Construtores:


    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(double saldo, TipoDeConta tipoDeConta) {
        super(saldo, tipoDeConta);
    }

    //Sobrecarga dos metodos da superclasse


    @Override
    public void depositar(double valor) {
        System.out.println("Voce depositou o valor de: " + valor);
        saldo = saldo + (valor + valor*0.01);
        System.out.println("Seu novo saldo é de: " + saldo);
    }

    //Metodo transferir valores

    @Override
    public void transferirValor(double valorATtransferir, TipoDeConta tipoDeConta) {
        if (tipoDeConta == TipoDeConta.POUPANÇA){
            saldo = valorATtransferir - saldo;
            System.out.println("Voce transferiu: " + valorATtransferir);
            System.out.println("Seu novo saldo é de: " + saldo);
        }
    }
}
