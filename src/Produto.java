public class Produto {
    private String nome;
    private  double valor;
    private int quantidade;
    private Fornecedor fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto(String nome, int quantidade, double valor, Fornecedor fornecedor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }
}
