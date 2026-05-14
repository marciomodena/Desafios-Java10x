package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {
        //Objeto Conta Corrente
        ContaCorrente cc = new ContaCorrente(500, TipoDeConta.CORRENTE) ;
        cc.depositar(500);
        cc.consultarSaldo();
        cc.transferirValor(200, TipoDeConta.CORRENTE);

        System.out.println("------------------------------------------------");

        //Objeto Conta Poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca(100, TipoDeConta.POUPANÇA);
        contaPoupanca.depositar(200);
        contaPoupanca.consultarSaldo();
        contaPoupanca.transferirValor(500, TipoDeConta.POUPANÇA);


    }
}
