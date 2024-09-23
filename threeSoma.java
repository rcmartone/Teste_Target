public class threeSoma {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("Ao final do processamento, o valor da variavel SOMA é igual á " + SOMA + ".");
    }
}
