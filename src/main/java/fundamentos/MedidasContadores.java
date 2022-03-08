package fundamentos;

import static fundamentos.Medidas.entrada;

public interface MedidasContadores {
    static void contagemRegressiva() {
        System.out.print("Digite o valor que deseja contar na regressiva:");
        int numero = entrada.nextInt();

        for(int i = numero; i >= 1 ; i --) {
            System.out.println(i);
        }
            System.out.println("Entrou na interface - usou uma modificação do método");
    }
}
