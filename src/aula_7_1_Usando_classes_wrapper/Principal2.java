package aula_7_1_Usando_classes_wrapper;

public class Principal2 {
    public static void main(String[] args) {
        Cliente  cliente = new Cliente();

        // ATRIBUIR VALOR AO TIPO WRAPPER - INTEGER:
        cliente.idade = Integer.valueOf(1);
        cliente.idade = Integer.valueOf("25");
        

        System.out.printf("Idade: %d%n", cliente.idade);

    }
}
