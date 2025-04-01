import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Util {
    private Produto[] produto=new Produto[5];
    private Fornecedor[] fornecedor= new Fornecedor[5];
    private int idxProduto=0;
    private int idxFornecedor=0;





    public void menuPrincipal(){
    int opcao;
    String menu="1.cadastrar produto\n2.pesquisar produto por nome\n3.pesquisar fornecedor por cnpj\n4.finalizar";
    do{
        opcao=parseInt(showInputDialog(menu));
        if(opcao<1 || opcao<4){
        showMessageDialog(null,"opçao invalida");
        }else{
            switch (opcao){
                case 1:
                   cadastrarProduto();
                   break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisarFornecedor();
                    break;
            }
        }
    }while (opcao!=4);
    }

    private void cadastrarProduto(){
    String nome;
    double valorUnitario;
    int qtdEstoque;
    Fornecedor fornecedor=pesquisarFornecedor();

    if(fornecedor==null){
       fornecedor = cadastrarFornecedor();

    }
    nome=showInputDialog("Nome do produto");
    valorUnitario=parseDouble(showInputDialog("valor unitario"));
    qtdEstoque=parseInt(showInputDialog("qtd em estoque"));
    produto[idxProduto]=new Produto(nome, qtdEstoque,valorUnitario, fornecedor);

    }

    private void pesquisarProduto(){

    }


    private Fornecedor cadastrarFornecedor(){
        Fornecedor fornecedor;
        String nome=showInputDialog("Nome do fornecedor");
        int cnpj=parseInt(showInputDialog("cnpj"));
        fornecedor=new Fornecedor(nome,cnpj);
        this.fornecedor[idxFornecedor]=fornecedor;
        idxFornecedor ++;
        return fornecedor;
    }

    private Fornecedor pesquisarFornecedor(){
        int cnpj=parseInt(showInputDialog("CNP do fornecedor"));
        for(int i=0;i<idxFornecedor;i++){
            if(fornecedor[i].getCnpj()==cnpj){
            return fornecedor[i];
            }
        }
        return null;
    }
}
