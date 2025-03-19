public class TesteZoo {
    public static void main(String[] args) {
        Leao leao1 = new Leao("Simba", 14, "200");
        Elefante elefante1 = new Elefante("César", 40, "5500");
        Pinguim pinguim1 = new Pinguim("Dave", 12, "30");
        Girafa girafa1 = new Girafa("Giraldina", 17, "600");
        Tratador tratador1 = new Tratador("Artur", 19, "52553", 3);
        Administrador admin1 = new Administrador("David", 20, "69697", 2);
        Guia guia1 = new Guia("Bernardo", 20, "57489", 4);
        Visitante visitante1 = new Visitante("Manfred", 84, "12704");
        Visitante visitante2 = new Visitante("Duarte",25, "32442");
        Visitante visitante3 = new Visitante("Lara",21, "43760");
        Carne carne = new Carne(6);
        Palha palha = new Palha(200);
        Peixe peixe = new Peixe(3);
        System.out.println("=== Animais ===");
        System.out.println(elefante1.toString());
        System.out.println(leao1.toString());
        System.out.println(girafa1.toString());
        System.out.println(pinguim1.toString());
        System.out.println("\n=== Funcionários ===");
        System.out.println(tratador1.toString());
        System.out.println(admin1.toString());
        System.out.println(guia1.toString());
        System.out.println(visitante1.toString());
        System.out.println(visitante2.toString());
        System.out.println(visitante3.toString());
        System.out.println("\n=== Tipos de Alimentação ===");
        System.out.println(carne.toString());
        System.out.println(palha.toString());
        System.out.println(peixe.toString());
    }
}