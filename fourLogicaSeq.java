public class fourLogicaSeq {
    public static void main(String[] args) {
        // a) 1, 3, 5, 7, ___ (Aumenta de 2 em 2) pela logica sequencial.
        int[] seqA = {1, 3, 5, 7};
        int proxA = seqA[seqA.length - 1] + 2;
        // Deve imprimir 9.
        System.out.println("a) Próximo número aumentando de 2 em 2: " + proxA);  
        //------------------------------------------------------------------------------------//
        // b) 2, 4, 8, 16, 32, 64, ____ (Multiplicação por 2) pela logica sequencial.
        int[] seqB = {2, 4, 8, 16, 32, 64};
        int proxB = seqB[seqB.length - 1] * 2;
        // Deve imprimir 128.
        System.out.println("b) Próximo número multiplicando por 2: " + proxB);  
        //------------------------------------------------------------------------------------//
        // c) 0, 1, 4, 9, 16, 25, 36, ____ (Quadrados perfeitos) pela logica sequencial.
        int[] seqC = {0, 1, 4, 9, 16, 25, 36};
        int proxC = (seqC.length) * (seqC.length);  
        // Próximo quadrado perfeito e deve imprimir 49.
        System.out.println("c) Próximo número quadrado perfeito: " + proxC);  
        //------------------------------------------------------------------------------------//
        // d) 4, 16, 36, 64, ____ (Quadrados de números pares) pela logica sequencial.
        int[] seqD = {4, 16, 36, 64};
        int proxD = (seqD.length + 2) * (seqD.length + 2);
        // Próximo quadrado de número par e deve imprimir 100.
        System.out.println("d) Próximo quadrado de número par: " + proxD); 
        //------------------------------------------------------------------------------------//
        // e) 1, 1, 2, 3, 5, 8, ____ (Sequência de Fibonacci) pela logica sequencial.
        int[] seqE = {1, 1, 2, 3, 5, 8};
        int proxE = seqE[seqE.length - 1] + seqE[seqE.length - 2];
        // Próximo número de Fibonacci e deve imprimir 13.  
        System.out.println("e) Próximo número da sequência de Fibonnaci: " + proxE);
        //------------------------------------------------------------------------------------//
        // f) 2, 10, 12, 16, 17, 18, 19, ____ (Sequência crescente) pela logica sequencial.
        int[] seqF = {2, 10, 12, 16, 17, 18, 19};
        int proxF = seqF[seqF.length - 1] + 1;
        // Próximo número crescente e deve imprimir 20. 
        System.out.println("f) Próximo número crescente: " + proxF);
    }
}
