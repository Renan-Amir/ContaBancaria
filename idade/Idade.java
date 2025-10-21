public class Idade {
    public static void main(String[] args) {
        int idade = 25;
        String nome = "Renan";
        System.out.println("A idade da pessoa eh " + idade + " e o nome eh " + nome);
        
        Conta c = new Conta();
        c.agencia = 1234;
        c.contaCorrente = 56789;
        c.saldo = 0;
        System.out.println("Saldo inicial: " + c.saldo());
        c.saldo += 1000;
        System.out.println("Saldo apos deposito: " + c.saldo());

        Conta c2 = new Conta();
        c2.agencia = 4321;
        c2.contaCorrente = 98765;
        c2.saldo = 500;
        System.out.println("Saldo inicial da segunda conta: " + c2.saldo());
        c2.saldo += 1500;
        System.out.println("Saldo apos deposito na segunda conta: " + c2.saldo());
    }
}