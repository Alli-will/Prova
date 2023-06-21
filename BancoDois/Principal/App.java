package Principal;

import java.util.ArrayList;

import ColecaoVeiculo.ColecaoVeiculos;
import Enum.enumMarca;
import Veiculoo.Veiculo;

public class App {
    public static void main(String[] args) {
        ColecaoVeiculos colecao = new ColecaoVeiculos();

        // Exemplo de adição de veículos para algumas marcas
        colecao.addVeiculoMarca(enumMarca.VOLKSWAGEN, new Veiculo("Gol GTI 2000"));
        colecao.addVeiculoMarca(enumMarca.VOLKSWAGEN, new Veiculo("Gol GTS 1800"));
        colecao.addVeiculoMarca(enumMarca.VOLKSWAGEN, new Veiculo("GOLF SAPÃO"));

        colecao.addVeiculoMarca(enumMarca.FORD, new Veiculo("Fiesta"));
        colecao.addVeiculoMarca(enumMarca.FORD, new Veiculo("Focus"));
        colecao.addVeiculoMarca(enumMarca.FORD, new Veiculo("Mustang"));

        colecao.addVeiculoMarca(enumMarca.GM, new Veiculo("Celta"));
        colecao.addVeiculoMarca(enumMarca.GM, new Veiculo("Onix"));
        colecao.addVeiculoMarca(enumMarca.GM, new Veiculo("Cruze"));

        // Exemplo de filtro por marca
        ArrayList<Veiculo> veiculosFiltradosMarca = colecao.filtroMarca(enumMarca.VOLKSWAGEN, "Gol");
        System.out.println("Veículos da marca VOLKSWAGEN filtrados por 'Gol':");
        for (Veiculo veiculo : veiculosFiltradosMarca) {
            System.out.println(veiculo);
        }
}
}
