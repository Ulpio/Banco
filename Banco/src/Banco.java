public class Banco {
    float saldo;

    void verificarSaldo(){
        System.out.println("Seu saldo é: R$"+saldo);
    }
    void sacar(float valorSacado){
        this.saldo -= valorSacado;
        System.out.println("Você sacou :R$"+valorSacado);
    }
    void depositar(float valorDepositado){
        this.saldo += valorDepositado;
        System.out.println("Você depositou:R$"+valorDepositado);
    }
    public static void main(String[] args) {
        Banco ubank = new Banco();
        ubank.verificarSaldo();
        ubank.depositar(450);
        ubank.verificarSaldo();
        ubank.sacar(35);
        ubank.verificarSaldo();
    }
}
