package aula_7_6_Boas_praticas_prefira_tipos_primi_a_wrappers;

public class Principal2 {
    public static void main(String[] args) {
        Integer idade = null;

        // NullPointerException em todas as instruções abaixo:
        // MISTURA DO TIPO WRAPPER COM O TIPO PRIMITIVO: tipo primitivo não recebe null: Imteger=null; int = 10; int=100
        System.out.println(idade+10);
        System.out.println(idade == 100);
        System.out.println(idade.equals(100));
    }
}
