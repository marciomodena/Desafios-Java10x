package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoDeConta tipoDeConta;


    //----------------------Constructor ---------------------

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //Sobrecarga do Construtor

    public ContaBancaria(double saldo, TipoDeConta tipoDeConta) {
        this(saldo);
        this.tipoDeConta = tipoDeConta;
    }


    //----------------------------------------------------------

    //Sobrecarga da Interface ----------------------------------
    @Override
    public void consultarSaldo() {
        System.out.println("Seu tipo de conta é " + tipoDeConta);
        System.out.println("O seu saldo atual é de " + saldo);
    }

    @Override
    public abstract void depositar(double valor);

    //---------------------------------------------------------

    //Metodo de transferir valores
    public abstract void transferirValor(double valorATtransferir ,TipoDeConta tipoDeConta);





}
