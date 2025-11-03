package semana11e12.listaDeExercicios2;

public class Exer04 {
    public static boolean procuraNome(String[] array, String nome){
        boolean encontrado = false;
        for(int i = 0; i < array.length; i++){
            if (array[i].equalsIgnoreCase(nome)) {
                System.out.println("Nome localizado na posição: " +i);
                encontrado = true;
                return encontrado;
            }
        }
        return encontrado;
    }

    public static void main(String[] args) {
        String[] array = {"pedro", "maya", "maristela", "rossano", "manu"};
        String nome = "maristela";
        System.out.println(procuraNome(array, nome));
    }
}
