package aula_7_6_Boas_praticas_prefira_tipos_primi_a_wrappers;

public class Principal {
    public static void main(String[] args) {
        Integer numero1 = 128;
        Integer numero2 = 128;

        // ERRADO: COMPARA O ENDEREÇO DE MEMÓRIA:
        System.out.println(numero1 == numero2);

        // CERTO - COMPARA O VALOR DO OBJETO QUE ESTÁ DENTRO DA VARIÁVEL:
        System.out.println(numero1.equals(numero2));

        // CERTO -
        System.out.println(numero1.compareTo(numero2) == 0);


    }
}