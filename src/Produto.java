public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataDeValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataDeValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String toString(){
        return "Produto " + nome +
                "\nPreço: " + preco +
                "\nData de validade: " + dataValidade.toString();
    }

    public boolean estaVencido(Data dataDeHoje) {
        if(dataValidade.getAno() < dataDeHoje.getAno()) {
            return true;
        } else if (dataValidade.getAno() == dataDeHoje.getAno()) {
            if(dataValidade.getMes() < dataDeHoje.getMes()) {
                return true;
            } else if (dataValidade.getMes() == dataDeHoje.getMes()) {
                return dataValidade.getDia() < dataDeHoje.getDia();
            }
        }

        return false;
    }
}
