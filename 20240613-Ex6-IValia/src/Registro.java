public class Registro {
    private String estabelecimento;
    private String itens;
    private int nota;
    private String comentario;

    public Registro(String estabelecimento, String itens, int nota, String comentario) {
        this.estabelecimento = estabelecimento;
        this.itens = itens;
        this.nota = nota;
        this.comentario = comentario;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public String getItens() {
        return itens;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "Estabelecimento: " + estabelecimento + " - Itens: " + itens + " - Nota: " + nota + " - Comentário: " + comentario;
    }
}
