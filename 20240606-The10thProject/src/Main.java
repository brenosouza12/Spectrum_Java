public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Louise", "Rua A, 123", "1234-5678", 2500.0);
        System.out.println(funcionario);

        Fornecedor fornecedor = new Fornecedor("Emma", "Avenida B, 456", "8765-4321", 5000.0, 1500.0);
        System.out.println(fornecedor);

        Aluno aluno = new Aluno("Lottie", "Praça C, 789", "1111-2222", "Engenharia");
        System.out.println(aluno);

        Estagiario estagiario = new Estagiario("Annie", "Rua D, 101", "3333-4444", "Administração", 20);
        System.out.println(estagiario);
    }
}

