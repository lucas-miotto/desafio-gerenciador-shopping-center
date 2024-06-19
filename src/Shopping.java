public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja lojas[];

    public Shopping(String nome, Endereco endereco, int qtdMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if(lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }

        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }

        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int qtd = 0;

        if(tipoLoja.equalsIgnoreCase("Cosmético")) {
            for(Loja loja : lojas) {
                if(loja instanceof Cosmetico) {
                    qtd++;
                }
            }
        } else if (tipoLoja.equalsIgnoreCase("Vestuário")) {
            for(Loja loja : lojas) {
                if(loja instanceof Vestuario) {
                    qtd++;
                }
            }
        } else if (tipoLoja.equalsIgnoreCase("Bijuteria")) {
            for(Loja loja : lojas) {
                if(loja instanceof Bijuteria) {
                    qtd++;
                }
            }
        } else if (tipoLoja.equalsIgnoreCase("Alimentação")) {
            for(Loja loja : lojas) {
                if(loja instanceof Alimentacao) {
                    qtd++;
                }
            }
        } else if (tipoLoja.equalsIgnoreCase("Informática")) {
            for(Loja loja : lojas) {
                if(loja instanceof Informatica) {
                    qtd++;
                }
            }
        } else{
            return -1;
        }

       return qtd;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaSeguroMaisCaro = null;

        for (Loja loja : lojas) {
            if(loja instanceof Informatica) {
                Informatica lojaAtual = (Informatica) loja;

                if(lojaSeguroMaisCaro == null || lojaAtual.getSeguroEletronicos() > lojaSeguroMaisCaro.getSeguroEletronicos()) {
                    lojaSeguroMaisCaro = lojaAtual;
                }
            }
        }

        return lojaSeguroMaisCaro;
    }

    public String toString(){
        return "Nome " + nome +
                "\nEndereço: " + endereco.toString() +
                "\nLojas: " + lojas;
    }
}
