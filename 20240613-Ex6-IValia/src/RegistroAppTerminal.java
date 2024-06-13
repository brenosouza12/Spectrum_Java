import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroAppTerminal {
    private List<Registro> registros;

    public RegistroAppTerminal() {
        registros = new ArrayList<>();
        generateFakeRegistros();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Pesquisar Registros");
            System.out.println("2. Mostrar Todos os Registros");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (option) {
                case 1:
                    searchRegistros(scanner);
                    break;
                case 2:
                    showAllRegistros();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void searchRegistros(Scanner scanner) {
        System.out.print("Digite o texto de pesquisa ou 'nota:valor' para pesquisar por nota mínima: ");
        String searchText = scanner.nextLine().trim();

        if (searchText.startsWith("nota:")) {
            try {
                int notaMinima = Integer.parseInt(searchText.split(":")[1]);
                for (Registro registro : registros) {
                    if (registro.getNota() >= notaMinima) {
                        System.out.println(registro);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de nota inválido. Use 'nota:valor'.");
            }
        } else {
            for (Registro registro : registros) {
                if (registro.getNome().toLowerCase().contains(searchText.toLowerCase()) ||
                        registro.getTag().toLowerCase().contains(searchText.toLowerCase()) ||
                        String.valueOf(registro.getNota()).equals(searchText)) {
                    System.out.println(registro);
                }
            }
        }
    }

    private void showAllRegistros() {
        for (Registro registro : registros) {
            System.out.println(registro);
        }
    }

    private void generateFakeRegistros() {
        registros.add(new Registro("Alice", 85, "Math"));
        registros.add(new Registro("Bob", 90, "Science"));
        registros.add(new Registro("Charlie", 75, "History"));
    }
}
