package br.com.imobiliaria;

public abstract class Imovel {
    protected String endereco;
    protected double area;
    protected int numeroQuartos;
    protected int id;
    protected String tipo;
    protected String padrao;

    public Imovel(String endereco, double area, int numeroQuartos, int id, String tipo, String padrao) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.id = id;
        this.tipo = tipo;
        this.padrao = padrao;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getArea() {
        return area;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPadrao() {
        return padrao;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", area=" + area +
                ", numeroQuartos=" + numeroQuartos +
                ", id=" + id +
                ", tipo='" + tipo + '\'' +
                ", padrao='" + padrao + '\'' +
                '}';
    }
}
