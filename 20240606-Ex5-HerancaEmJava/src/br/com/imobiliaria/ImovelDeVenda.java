package br.com.imobiliaria;

public class ImovelDeVenda extends Imovel {
    private double preco;

    public ImovelDeVenda(String endereco, double area, int numeroQuartos, int id, String tipo, String padrao, double preco) {
        super(endereco, area, numeroQuartos, id, tipo, padrao);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "ImovelDeVenda{" +
                "preco=" + preco +
                "} " + super.toString();
    }
}
