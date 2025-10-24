public class Item {

    //atributos
    public String nome;
    public double preco;
    public int quantidade;

    //Metodos
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + "\n" + "Preco: " + preco + "\n" + "Quantidade: " + quantidade);
    }

    public double calcularValorTotal() {
        return quantidade * preco;
    }

    public static void main(String[] args) {
        Item p = new Item();

        p.nome = "caneta";
        p.preco = 3.0;
        p.quantidade = 10;
        p.exibirInformacoes();
        System.out.println("Valor Total em estoque: " + p.calcularValorTotal());
        

        Item p1 = new Item();
        p1.nome = "caderno";
        p1.preco = 15.0;
        p1.quantidade = 5;
        p1.exibirInformacoes();
        System.out.println("Valor Total em estoque: " + p1.calcularValorTotal());
    }
}
