public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if(dia < 1 || dia > 31) {
                    erroData();
                }
                break;
            case 4, 6, 9, 11:
                if(dia < 1 || dia > 30) {
                    erroData();
                }
                break;
            case 2:
                if (verificaAnoBissexto()) {
                    if (dia < 1 || dia > 29) {
                        erroData();
                    }
                } else {
                    if(dia < 1 || dia > 28) {
                        erroData();
                    }
                }
                break;
            default:
                erroData();
        }
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void erroData(){
        System.out.println("Data Inválida! A data foi redefinida para 1/1/2000");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }
}
