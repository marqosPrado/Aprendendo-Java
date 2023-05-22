public class Main {
    public static void main(String[] args) {
        // Escopo de Variáveis

        int variavel;

        if(true) {
            variavel = 10; // Variavel local
        } else {
            variavel = 2; // '''
        }

        System.out.println(variavel);
    }
}