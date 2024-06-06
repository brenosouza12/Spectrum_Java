public class Estagiario extends Aluno {
    private int horasEstagio;

    public Estagiario(String nome, String endereco, String telefone, String curso, int horasEstagio) {
        super(nome, endereco, telefone, curso);
        this.horasEstagio = horasEstagio;
    }

    // Getters e Setters
    public int getHorasEstagio() {
        return horasEstagio;
    }

    public void setHorasEstagio(int horasEstagio) {
        this.horasEstagio = horasEstagio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Horas de Estágio: " + horasEstagio;
    }
}
