public class SomaMultiplicacao {
    public static void main(String[] args) {
        long impares = 0;
        long pares = 1;
        
        for (long i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                pares *= i;
            } else {
                impares += i;
            }
        }
        
        System.out.println("A soma dos números ímpares entre 0 e 30 é: " + impares);
        System.out.println("A multiplicação dos números pares entre 0 e 30 é: " + pares);
    }
}

