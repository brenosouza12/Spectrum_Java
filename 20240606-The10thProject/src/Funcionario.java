public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String endereco, String telefone, double salario) {
        super(nome, endereco, telefone);
        this.salario = salario;
    }

    // Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario;
    }
}

