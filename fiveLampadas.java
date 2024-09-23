public class fiveLampadas {
    public static void main(String[] args) {
        boolean[] lampadas = new boolean[3];  // false = desligada, true = ligada
        boolean[] quente = new boolean[3];    // false = fria, true = quente, o tempo de uso determina a temperatura.
        //----------------------------------------------------------------------------------------------------------//
        // Simulação dos interruptores e das lâmpadas.
        // Passo 1: Ligue o Interruptor 1 e deixe-o ligado por alguns minutos
        lampadas[0] = true;
        quente[0] = true;  // Lâmpada 1 está quente após alguns minutos ligada.
        //----------------------------------------------------------------------------------------------------------//
        // Passo 2: Desligue o Interruptor 1 e ligue o Interruptor 2.
        lampadas[0] = false;
        lampadas[1] = true;  // Lâmpada 2 está acesa.
        //----------------------------------------------------------------------------------------------------------//
        // Passo 3: Verificar qual lâmpada corresponde a cada interruptor
        verificarLampadas(lampadas, quente);
        //----------------------------------------------------------------------------------------------------------//
    }
    
    public static void verificarLampadas(boolean[] lampadas, boolean[] quente) {
        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i]) {
                System.out.println("Se a lâmpada " + (i + 1) + " está ligada: corresponde ao Interruptor 2.");
            } else if (quente[i]) {
                System.out.println("Se a lâmpada " + (i + 1) + " está apagada, mas quente: corresponde ao Interruptor 1.");
            } else {
                System.out.println("Se a lâmpada " + (i + 1) + " está apagada e fria: corresponde ao Interruptor 3.");
            }
        }
        System.out.println("Assim é possivel identificar qual interruptor controla qual lâmpada com apenas uma ida à sala das lâmpadas.");
    }
}