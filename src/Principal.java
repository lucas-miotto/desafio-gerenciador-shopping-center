public class Principal {
    public static void main(String[] args) {

        int opcaoMenu;
        Loja loja = null;
        Produto produto = null;

        do {
            System.out.println("...:: Menu de Cadastro ::...");
            System.out.println("Digite (1) criar uma loja");
            System.out.println("Digite (2) criar um produto");
            System.out.println("Digite (3) sair");
            opcaoMenu = Teclado.leInt("Digite uma opção: ");

            switch (opcaoMenu) {
                case 1:
                    //Informações da loja
                    String nomeLoja = Teclado.leString("Digite o nome da loja: ");
                    int quantidadeFuncionarios = Teclado.leInt("Digite a quantidade de funcionarios: ");
                    double salarioBaseFuncionarios = Teclado.leDouble("Digite o salário base dos funcionarios: ");

                    //Endereço
                    String rua = Teclado.leString("Digite a Rua: ");
                    String cidade = Teclado.leString("Digite a Cidade: ");
                    String estado = Teclado.leString("Digite o Estado: ");
                    String pais = Teclado.leString("Digite o Pais: ");
                    String cep = Teclado.leString("Digite o CEP: ");
                    String numero = Teclado.leString("Digite o número: ");
                    String complemento = Teclado.leString("Digite o Complemento: ");
                    Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                    //Data da fundação
                    int dia = Teclado.leInt("Digite o dia da fundação: ");
                    int mes = Teclado.leInt("Digite o mês da fundação: ");
                    int ano = Teclado.leInt("Digite o ano da fundação: ");
                    Data dataFundacao = new Data(dia, mes, ano);

                    //Criando a loja.
                    loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao,10);

                    break;
                case 2:
                    //Produto
                    String nomeProduto = Teclado.leString("Digite o nome do Produto: ");
                    double preco = Teclado.leDouble("Digite o preço do Produto: ");

                    //Data da validade
                    int diaValidade = Teclado.leInt("Digite o dia da validade: ");
                    int mesValidade = Teclado.leInt("Digite o mês da validade: ");
                    int anoValiade = Teclado.leInt("Digite o ano da validade: ");
                    Data dataValidade = new Data(diaValidade, mesValidade, anoValiade);

                    //Criando o produto
                    produto = new Produto(nomeProduto, preco, dataValidade);

                    break;
                case 3:
                    System.out.println("Saindo do programa....");

                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        } while (opcaoMenu != 3);

        int diaHoje = 20;
        int mesHoje = 10;
        int anoHoje = 2023;
        Data dataHoje = new Data(diaHoje, mesHoje, anoHoje);

        if(produto.estaVencido(dataHoje)) {
            System.out.println("PRODUTO VENCIDO!");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO!");
        }

        System.out.println(loja);
    }
}
