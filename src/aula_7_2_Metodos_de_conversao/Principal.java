package aula_7_2_Metodos_de_conversao;

public class Principal {
    public static void main(String[] args) {

        // CONVERSÃO DE TIPO PRIMITIVO para PRIMITIVO:
        int idade = 20;
        short idadeShort = (short) idade;

        // CONVERSÃO WRAPPER PARA PRIMITIVO - short:
        Integer diasEntrega = Integer.valueOf(30);
        short diasEntregaShort = diasEntrega.shortValue();

        // CONVERSÃO DE WRAPPER PARA WRAPPER:
        Short diasEntregaShort2 = Short.valueOf(diasEntrega.shortValue());
        Long diasEntregaLong = Long.valueOf(diasEntrega.longValue());

        Double valorTotal = Double.valueOf(1500.20);
        int valorTotalInt = valorTotal.intValue();
        System.out.println(valorTotalInt);

    }
}