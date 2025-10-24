package semana9e10.exercicios05;

public class InformacoesAtletas {
    
    public void imprimeExclusivosAtleta(Atleta a){
        if (a instanceof Nadador) {
            Nadador aNadador = (Nadador) a;
            System.out.println("É um nadador, e sua categoria é: " +aNadador.getCategoria());
        }else if(a instanceof Corredor){
            Corredor aCorredor = (Corredor) a;
            System.out.println("É um corredor, e o peso deste corredor é: " +aCorredor.getPeso());
        }   
    }

    public void imprimeInformacoesAtleta(Atleta a){
        a.imprimeInfo();
    }
}
