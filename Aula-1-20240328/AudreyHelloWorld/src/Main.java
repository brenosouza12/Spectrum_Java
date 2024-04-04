//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int numeroInteiro = 12;
        float numeroReal = 1223.77f;
        char letra = 'A';
        boolean terminado = false;

        System.out.println("Inteiro: " + numeroInteiro);
        System.out.println("Float: " + numeroReal);
        System.out.println("Char: " + letra);
        System.out.println("Lógico: " + terminado);
        System.out.println("================================");

        System.out.printf("O valor do float: %.1f \n", numeroReal);

        System.out.println("================================");
        String nome = "Audrey Spring";
        float media = 8.9f;
        System.out.printf("A nota de %s é %.3f \n", nome, media);
        System.out.format("A nota de %s é %.3f \n", nome, media);

    }
}