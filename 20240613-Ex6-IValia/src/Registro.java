public class Registro {
    private String nome;
    private int nota;
    private String tag;

    public Registro(String nome, int nota, String tag) {
        this.nome = nome;
        this.nota = nota;
        this.tag = tag;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return nome + " - Nota: " + nota + " - Tag: " + tag;
    }
}
