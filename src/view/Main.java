package view;

import model.filaInt.Fila;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();



        fila.insert(2);




        try {
            System.out.println("Tamanho da Fila  "+ fila.size());
            fila.list();

            System.out.println("Dado Removido: "+ fila.remove());

            System.out.println("Tamanho da Fila "+ fila.size());
            fila.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
