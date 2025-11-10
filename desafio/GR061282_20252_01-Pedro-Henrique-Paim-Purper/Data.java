public class Data {
    private int dia, mes, ano;

    // Construtor
    public Data(int dia, int mes, int ano) {
        boolean dataValida = true;
        int maxDias = 31; 
        
        /*
        Primeira validação, vemos se mês é um inteiro válido de acordo com o calendário padrão(católico) 
        e vemos se ano é maior que 0
        */ 
        if (mes < 1 || mes > 12 || ano <= 0) {
            dataValida = false;
        } else {
            /*Segunda validação, serve para determinar os números máximos de dias de acordo com cada mês */
            
            // Meses com 30 dias
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
            } 
            // Fevereiro (caso especial)
            else if (mes == 2) {
                // Checa se o ano é bissexto
                boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                
                if (bissexto) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
            }

            /*Terceira validação, checa se dia é maior que 0 e verifica se dia é maior que maxDias, no caso se for
                então dia não está batendo
             */
            if (dia < 1 || dia > maxDias) {
                dataValida = false;
            }
        }

        /*Caso tudo de certo, o construtor inicializa os atributos, caso de errado, ele atribui a data padrão
         * informada no enumciado
         */
        if (dataValida) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Erro na data informada, atribuindo a data padrão!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Getters e setters
    public void setDia(int dia){this.dia = dia;}
    public int getDia(){return dia;}

    public void setMes(int mes){this.mes = mes;}
    public int getMes(){return mes;}

    public void setAno(int ano){this.ano = ano;}
    public int getAno(){return ano;}

    public String toString(){
        return getDia()+ "/" +getMes()+ "/" +getAno();
    }

    // Método que verifica se o ano é bissexto  
    public boolean verificaAnoBissexto(){
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
