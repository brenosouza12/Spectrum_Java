package br.com.imobiliaria;

public class Main {
    public static void main(String[] args) {
        ImovelDeAluguel imovelAluguel = new ImovelDeAluguel("Rua A, 123", 85.0, 3, 1, "Apartamento", "Alto", 1500.0);
        ImovelDeVenda imovelVenda = new ImovelDeVenda("Rua B, 456", 120.0, 4, 2, "Casa", "Luxo", 450000.0);

        System.out.println(imovelAluguel);
        System.out.println(imovelVenda);

        imovelAluguel.alugar();
        System.out.println("Disponibilidade após alugar: " + imovelAluguel.isDisponivel());

        imovelAluguel.devolver();
        System.out.println("Disponibilidade após devolver: " + imovelAluguel.isDisponivel());
    }
}
