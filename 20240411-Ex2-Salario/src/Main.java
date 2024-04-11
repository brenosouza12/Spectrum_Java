//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeSalarios = 0;
        System.out.print("Digite a quantidade de salários: ");
        quantidadeSalarios = scanner.nextInt();

        ArrayList<Double> salarios = new ArrayList<>();
        while (true) {
            System.out.print("Digite o salário (ou 0 para finalizar): ");
            double salario = scanner.nextDouble();
            if (salario == 0) {
                break;
            }
            salarios.add(salario);
        }
        
        double maiorSalario = 0;
        for (double salario : salarios) {
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
        }

        double totalFolhaOriginal = 0;
        double totalFolhaCorrigida = 0;
        for (int i = 0; i < salarios.size(); i++) {
            double salario = salarios.get(i);
            double novoSalario = salario;

            if (salario < 2500) {
                novoSalario += salario * 0.1;
            }

            salarios.set(i, novoSalario);
            totalFolhaOriginal += salario;
            totalFolhaCorrigida += novoSalario;
        }

        // Exibir resultados
        System.out.println("\nMaior salário: R$" + maiorSalario);
        System.out.println("\nFolha de Pagamento Original:");
        for (int i = 0; i < salarios.size(); i++) {
            System.out.println("Funcionário " + (i + 1) + ": R$" + salarios.get(i));
        }
        System.out.println("\nTotal: R$" + totalFolhaOriginal);

        System.out.println("\nFolha de Pagamento Corrigida:");
        for (int i = 0; i < salarios.size(); i++) {
            System.out.println("Funcionário " + (i + 1) + ": R$" + salarios.get(i));
        }
        System.out.println("\nTotal: R$" + totalFolhaCorrigida);
    }
}
