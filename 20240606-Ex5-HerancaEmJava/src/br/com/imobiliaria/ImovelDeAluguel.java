package br.com.imobiliaria;

public class ImovelDeAluguel extends Imovel {
    private double valorDoAluguel;
    private boolean disponibilidade;

    public ImovelDeAluguel(String endereco, double area, int numeroQuartos, int id, String tipo, String padrao, double valorDoAluguel) {
        super(endereco, area, numeroQuartos, id, tipo, padrao);
        this.valorDoAluguel = valorDoAluguel;
        this.disponibilidade = true; // Disponível por padrão
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void alugar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Imóvel alugado com sucesso!");
        } else {
            System.out.println("Imóvel já está alugado.");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("Imóvel devolvido com sucesso!");
        } else {
            System.out.println("Imóvel já está disponível.");
        }
    }

    @Override
    public String toString() {
        return "ImovelDeAluguel{" +
                "valorDoAluguel=" + valorDoAluguel +
                ", disponibilidade=" + disponibilidade +
                "} " + super.toString();
    }
}
