package view;

import model.filaGenerics.Fila;
import model.filaObject.Veiculo;

import java.time.LocalDateTime;

public class MainObject {
    public static void main(String[] args) {
        Fila<Veiculo> fila = new Fila<>();
        Veiculo v1 = new Veiculo();

        v1.placa="AAA-0000";
        v1.marca = "Fiat";
        v1.modelo = "Palio";
        v1.horaEntrada = LocalDateTime.now();

        Veiculo v2 = new Veiculo();
        v2.placa="AAA-1111";
        v2.marca = "Renault";
        v2.modelo = "Logan";
        v2.horaEntrada = LocalDateTime.now();

        Veiculo v3 = new Veiculo();
        v3.placa="AAA-2222";
        v3.marca = "Volkwagen";
        v3.modelo = "Gol";
        v3.horaEntrada = LocalDateTime.now();

        Veiculo v4 = new Veiculo();
        v4.placa="AAA-3333";
        v4.marca = "Relampago";
        v4.modelo = "Marquinhos";
        v4.horaEntrada = LocalDateTime.now();

        fila.insert(v1);
        fila.insert(v2);
        fila.insert(v3);
        fila.insert(v4);




        try {

            System.out.println("Tamanho da Fila  "+ fila.size());
            fila.list();
            System.out.println("Removido "+fila.remove());
            System.out.println("Tamanho da Fila  "+ fila.size());
            fila.list();
        }catch (Exception e){
            e.getMessage();
        }

    }
}
