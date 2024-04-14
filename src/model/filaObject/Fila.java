package model.filaObject;

public class Fila {

    No inicio;
    No fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean isEmpty() {
        if (inicio == fim && inicio == null) {
            return true;
        }
        return false;

    }

    public void insert(Object valor) {
        No elemento = new No();
        elemento.dado = valor;

        if (inicio == null) {
            inicio = elemento;
            fim = elemento;
        } else if (inicio == fim ) {
            fim = elemento;
            inicio.proximo = fim;
            fim.proximo = null;
        } else {
            fim.proximo = elemento;
            elemento.proximo = null;
            fim = elemento;
        }

    }

    public Object remove() throws Exception {
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

    public void list() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila Vazia");
        }
        No auxiliar = inicio;
        while (auxiliar != null) {
            System.out.println(auxiliar.dado);
            auxiliar = auxiliar.proximo;
        }


    }


}
