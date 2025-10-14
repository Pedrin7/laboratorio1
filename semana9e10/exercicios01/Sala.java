package semana9e10.exercicios01;

public class Sala {
    public String nome;
    public Cadeira cadeira01;
    public Cadeira cadeira02;
    public Cadeira cadeira03;
    public Cadeira cadeira04;

    public Sala(String nome, Cadeira cadeira01, Cadeira cadeira02, Cadeira cadeira03, Cadeira cadeira04){
        this.nome = nome;
        this.cadeira01 = cadeira01;
        this.cadeira02 = cadeira02;
        this.cadeira03 = cadeira03;
        this.cadeira04 = cadeira04;
    }

    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}

    public void setCadeira01(Cadeira cadeira01){this.cadeira01 = cadeira01;}
    public Cadeira getCadeira01(){return cadeira01;}
    
    public void setCadeira02(Cadeira cadeira02){this.cadeira02 = cadeira02;}
    public Cadeira getCadeira02(){return cadeira02;}
    
    public void setCadeira03(Cadeira cadeira03){this.cadeira03 = cadeira03;}
    public Cadeira getCadeira03(){return cadeira03;}
    
    public void setCadeira04(Cadeira cadeira04){this.cadeira04 = cadeira04;}
    public Cadeira getCadeira04(){return cadeira04;}

    @Override
    public String toString(){
        return "Nome da sala: " + getNome()+
            "\nCadeira 01: " +getCadeira01()+
            "\nCadeira 02: " +getCadeira02()+
            "\nCadeira 03: " +getCadeira03()+
            "\nCadeira 04: " +getCadeira04();
    }
    
    public int cadeirasComMesaDisponiveis(){
        int cont = 0;
        if (cadeira01 != null && cadeira01 instanceof CadeiraComMesa && cadeira01.getAluno() == null) {
            cont++;
        }
        if (cadeira02 != null && cadeira02 instanceof CadeiraComMesa && cadeira02.getAluno() == null) {
            cont++;
        }
        if (cadeira03 != null && cadeira03 instanceof CadeiraComMesa && cadeira03.getAluno() == null) {
            cont++;
        }
        if (cadeira04 != null && cadeira04 instanceof CadeiraComMesa && cadeira04.getAluno() == null) {
            cont++;
        }
        if (cont == 0) {
            System.out.println("Não tem cadeiras com mesa disponíveis na sala.");
        }
        return cont;
    }

    public int cadeirasComRodinhasDisponiveis(){
        int cont = 0;

        if (cadeira01 != null && cadeira01 instanceof CadeiraComRodinhas && cadeira01.getAluno() == null) {
            cont++;
        }
        if (cadeira02 != null && cadeira02 instanceof CadeiraComRodinhas && cadeira02.getAluno() == null) {
            cont++;
        }
        if (cadeira03 != null && cadeira03 instanceof CadeiraComRodinhas && cadeira03.getAluno() == null) {
            cont++;
        }
        if (cadeira04 != null && cadeira04 instanceof CadeiraComRodinhas && cadeira04.getAluno() == null) {
            cont++;
        }
        if (cont == 0) {
            System.out.println("Não tem cadeiras de rodinhas disponíveis.");
        }

        return cont;
    }

    public Cadeira entraAluno(Aluno aluno, String tipoCadeira){
        if (tipoCadeira.equalsIgnoreCase("mesa")) {
           if (cadeira01 != null && cadeira01 instanceof CadeiraComMesa  && cadeira01.getAluno() == null) {
                cadeira01.setAluno(aluno);
                return cadeira01;
            }else if(cadeira02 != null && cadeira02 instanceof CadeiraComMesa && cadeira02.getAluno() == null){
                cadeira02.setAluno(aluno);
                return cadeira02;
            }else if(cadeira03 != null && cadeira03 instanceof CadeiraComMesa && cadeira03.getAluno() == null){
                cadeira03.setAluno(aluno);
                return cadeira03;
            }else if(cadeira04 != null && cadeira04 instanceof CadeiraComMesa && cadeira04.getAluno() == null){
                cadeira04.setAluno(aluno);
                return cadeira04;
            }
            else{
                // System.out.println("Não há cadeiras com mesas livres. Tentando cadeiras com rodinhas.");
                if (cadeira01 != null && cadeira01 instanceof CadeiraComRodinhas && cadeira01.getAluno() == null) {
                    cadeira01.setAluno(aluno);
                    return cadeira01;
                }
                else if (cadeira02 != null && cadeira02 instanceof CadeiraComRodinhas&& cadeira02.getAluno() == null) {
                    cadeira02.setAluno(aluno);
                return cadeira02;
                }
                else if (cadeira03 != null && cadeira03 instanceof CadeiraComRodinhas && cadeira03.getAluno() == null) {
                    cadeira03.setAluno(aluno);
                    return cadeira03;
                }
                else if (cadeira04 != null && cadeira04 instanceof CadeiraComRodinhas && cadeira04.getAluno() == null) {
                    cadeira04.setAluno(aluno);
                    return cadeira04;
                }
            }
        }
        else if(tipoCadeira.equalsIgnoreCase("rodinha")){
            if (cadeira01 != null && cadeira01 instanceof CadeiraComRodinhas && cadeira01.getAluno() == null) {
                cadeira01.setAluno(aluno);
                return cadeira01;
            }
            else if (cadeira02 != null && cadeira02 instanceof CadeiraComRodinhas&& cadeira02.getAluno() == null) {
                cadeira02.setAluno(aluno);
            return cadeira02;
            }
            else if (cadeira03 != null && cadeira03 instanceof CadeiraComRodinhas && cadeira03.getAluno() == null) {
                cadeira03.setAluno(aluno);
                return cadeira03;
            }
            else if (cadeira04 != null && cadeira04 instanceof CadeiraComRodinhas && cadeira04.getAluno() == null) {
                cadeira04.setAluno(aluno);
                return cadeira04;
            }else{
                // System.out.println("Não há cadeiras com rodinhas livres. Tentando cadeiras com mesa.");
                if (cadeira01 != null && cadeira01 instanceof CadeiraComMesa  && cadeira01.getAluno() == null) {
                    cadeira01.setAluno(aluno);
                    return cadeira01;
                }else if(cadeira02 != null && cadeira02 instanceof CadeiraComMesa && cadeira02.getAluno() == null){
                    cadeira02.setAluno(aluno);
                    return cadeira02;
                }else if(cadeira03 != null && cadeira03 instanceof CadeiraComMesa && cadeira03.getAluno() == null){
                    cadeira03.setAluno(aluno);
                    return cadeira03;
                }else if(cadeira04 != null && cadeira04 instanceof CadeiraComMesa && cadeira04.getAluno() == null){
                    cadeira04.setAluno(aluno);
                    return cadeira04;
                }
            }
        }
        return null;
    } 
    
}
