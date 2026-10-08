package aula_7_6_Boas_praticas_prefira_tipos_primi_a_wrappers;

public class Principal3 {
    public static void main(String[] args) {
        // currentTimeMillis() -> data hora em milesegundo.
        long tempoInicio = System.currentTimeMillis();

        //Long soma = 0L;
        long soma = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            soma += i;
        }
        System.out.println(soma);
        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000.d;
    System.out.printf("Duração: %.2fs%n", duracao);
    }
}
