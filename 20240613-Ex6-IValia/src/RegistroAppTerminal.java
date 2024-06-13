import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroAppTerminal {
    private List<Registro> registros;

    public RegistroAppTerminal() {
        registros = new ArrayList<>();
        generateFakeRegistros(); // Adiciona registros fictícios inicialmente
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Pesquisar Registros");
            System.out.println("2. Mostrar Todos os Registros");
            System.out.println("3. Adicionar Novo Registro");
            System.out.println("4. Filtrar por Categoria");
            System.out.println("5. Filtrar por Pedido ou Estabelecimento");
            System.out.println("6. Sair");
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
                    addNovoRegistro(scanner);
                    break;
                case 4:
                    filtrarPorCategoria(scanner);
                    break;
                case 5:
                    filtrarPorPedidoOuEstabelecimento(scanner);
                    break;
                case 6:
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
                List<Registro> filtered = registros.stream()
                        .filter(registro -> registro.getNota() >= notaMinima)
                        .collect(Collectors.toList());
                printRegistros(filtered);
            } catch (NumberFormatException e) {
                System.out.println("Formato de nota inválido. Use 'nota:valor'.");
            }
        } else {
            List<Registro> filtered = registros.stream()
                    .filter(registro ->
                            registro.getEstabelecimento().toLowerCase().contains(searchText.toLowerCase()) ||
                                    registro.getItens().toLowerCase().contains(searchText.toLowerCase()) ||
                                    String.valueOf(registro.getNota()).equals(searchText) ||
                                    registro.getComentario().toLowerCase().contains(searchText.toLowerCase()))
                    .collect(Collectors.toList());
            printRegistros(filtered);
        }
    }

    private void filtrarPorCategoria(Scanner scanner) {
        System.out.print("Digite a categoria que deseja filtrar (ex: pizza): ");
        String categoria = scanner.nextLine().trim().toLowerCase();

        List<Registro> filtered = registros.stream()
                .filter(registro -> registro.getItens().toLowerCase().contains(categoria))
                .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            System.out.println("Nenhum registro encontrado para a categoria '" + categoria + "'.");
        } else {
            printRegistros(filtered);
        }
    }

    private void filtrarPorPedidoOuEstabelecimento(Scanner scanner) {
        System.out.println("Escolha o tipo de filtro:");
        System.out.println("1. Filtrar por Pedido");
        System.out.println("2. Filtrar por Estabelecimento");
        System.out.print("Digite sua escolha (1 ou 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        switch (choice) {
            case 1:
                filtrarPorPedido(scanner);
                break;
            case 2:
                filtrarPorEstabelecimento(scanner);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private void filtrarPorPedido(Scanner scanner) {
        System.out.print("Digite o pedido que deseja filtrar: ");
        String pedido = scanner.nextLine().trim().toLowerCase();

        List<Registro> filtered = registros.stream()
                .filter(registro -> registro.getItens().toLowerCase().contains(pedido))
                .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            System.out.println("Nenhum registro encontrado para o pedido '" + pedido + "'.");
        } else {
            printRegistros(filtered);
        }
    }

    private void filtrarPorEstabelecimento(Scanner scanner) {
        System.out.print("Digite o estabelecimento que deseja filtrar: ");
        String estabelecimento = scanner.nextLine().trim().toLowerCase();

        List<Registro> filtered = registros.stream()
                .filter(registro -> registro.getEstabelecimento().toLowerCase().contains(estabelecimento))
                .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            System.out.println("Nenhum registro encontrado para o estabelecimento '" + estabelecimento + "'.");
        } else {
            printRegistros(filtered);
        }
    }

    private void showAllRegistros() {
        printRegistros(registros);
    }

    private void addNovoRegistro(Scanner scanner) {
        System.out.print("Digite o nome do estabelecimento: ");
        String estabelecimento = scanner.nextLine().trim();

        System.out.print("Digite os itens avaliados: ");
        String itens = scanner.nextLine().trim();

        System.out.print("Digite a nota do estabelecimento (0 a 10): ");
        int nota = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        System.out.print("Digite um comentário (opcional): ");
        String comentario = scanner.nextLine().trim();

        Registro novoRegistro = new Registro(estabelecimento, itens, nota, comentario);
        registros.add(novoRegistro);

        System.out.println("Novo registro adicionado com sucesso!");
    }

    private void generateFakeRegistros() {
        registros.add(new Registro("Restaurante A", "Refeição completa", 8, "Ótimo atendimento"));
        registros.add(new Registro("Pizzaria B", "Pizza margherita", 9, "Crosta crocante"));
        registros.add(new Registro("Café C", "Café e bolos", 7, "Ambiente aconchegante"));
        registros.add(new Registro("Bar D", "Petiscos variados", 6, "Happy hour animado"));
    }

    private void printRegistros(List<Registro> registros) {
        if (registros.isEmpty()) {
            System.out.println("Nenhum registro encontrado.");
        } else {
            registros.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        RegistroAppTerminal app = new RegistroAppTerminal();
        app.run();
    }
}
