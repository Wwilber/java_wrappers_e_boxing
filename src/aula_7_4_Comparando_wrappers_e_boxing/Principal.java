package aula_7_4_Comparando_wrappers_e_boxing;

public class Principal {
    public static void main(String[] args) {

        int numero1 = 128;
        int numero2 = 128;

        System.out.println(numero1== numero2);


        // WRAPPER = ENDEREÇO EM MEMÓRIA E NÃO CONTEÚDO EM MEMÓRIA: INTERVALO -128 E 127
        Integer numero_w1 = 128;
        Integer numero_w2 = 128;



        System.out.println(numero_w1== numero_w2);
        // COMPARAÇÃO DE CONTEÚDO E TIPO DE WRAPPER:
        System.out.println(numero_w1.equals(numero_w2));


    }
}