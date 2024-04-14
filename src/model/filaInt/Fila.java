package model.filaInt;

public class Fila {
    No inicio;
    No fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public boolean isEmpty() {
        if (inicio == null && fim == null) {
            return true;
        }
        return false;

    }


    public void insert(int valor) {
        No elemento = new No();
        elemento.dado = valor;

        if (inicio == null) {
            inicio = elemento;
            fim = elemento;
            elemento.proximo = null;
        } else if (inicio == fim && inicio != null) {
            fim = elemento;
            inicio.proximo = fim;
            fim.proximo = null;
        } else {
            fim.proximo = elemento;
            elemento.proximo = null;
            fim = elemento;
        }


    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila Vazia");
        }
        No auxiliar = inicio;
        if (inicio == fim && inicio != null) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
        }

        return auxiliar.dado;

    }

    public void list() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila Vazia");
        }
        No auxiliar = inicio;
        while (auxiliar != null) {
            System.out.println(auxiliar.toString());
            auxiliar = auxiliar.proximo;
        }
    }

    public int size() {
        int cont = 0;
        if (!isEmpty()) {
            No auxiliar = inicio;
            while (auxiliar != null) {
                cont++;
                auxiliar = auxiliar.proximo;
            }
        }
        return cont;
    }

}
