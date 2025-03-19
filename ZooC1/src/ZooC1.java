import java.util.Scanner;

public class ZooC1 {
    static Peixe peixe = new Peixe(0);
    static Carne carne = new Carne(0);
    static Palha palha = new Palha(0);
    static Zoo zoo = new Zoo("", 0);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dê um nome para o seu zoo: ");
        zoo.setName(input.nextLine());
        System.out.println("Qual será o preçario para o seu zoo:");
        zoo.setPreçario(Integer.parseInt(input.nextLine()));
        System.out.println("Pretende começar com um zoo predefinido? (Escreva 'n' para um zoo sem nada)");
        if (!input.nextLine().equals("n")) criarZooPredefinido();
        while (true) {
            System.out.println("\n----- Bem vindo à administração do(a) " + zoo.getName() + "!!! Preçario atual: " + zoo.getPreçario() + "$ -----");
            System.out.println("O que deseja visualizar?");
            System.out.println("1 - Stock de alimentos.");
            System.out.println("2 - Animais.");
            System.out.println("3 - Funcionários/Visitantes.");
            System.out.println("4 - Zoológico.");
            System.out.println("5 - Terminar todas as operações.");

            switch (input.nextLine()) {
                case "1" -> ListaRequerida(1);
                case "2" -> ListaRequerida(2);
                case "3" -> ListaRequerida(3);
                case "4" -> zoo.printZoo(carne, palha, peixe);
                case "5" -> encerrarPrograma();
                default -> System.out.println("Essa opção não é válida.");
            }
        }
    }

    public static void criarZooPredefinido() {
        zoo.addLeao("Simba", 14, 200);
        zoo.addElefante("César", 40, 5500);
        zoo.addGirafa("Giraldina", 17, 600);
        zoo.addPinguim("Dave", 12, 30);
        zoo.addTratador("Artur", 52553, 19, 3);
        zoo.setAnimalTratador(52553, "Simba", 1);
        zoo.setAnimalTratador(52553, "César", 2);
        zoo.addTratador("Vermelhudo", 51475, 19, 3);
        zoo.setAnimalTratador(51475, "Giraldina", 3);
        zoo.setAnimalTratador(51475, "Dave", 4);
        zoo.addGuia("David", 69697, 20, 2);
        zoo.addAdmin("Bernardo", 57489, 20, 4);
        zoo.addVisitante("Bea", 62704, 18);
        zoo.addVisitante("Duarte", 32442, 32);
        zoo.addVisitante("Lara", 43760, 25);
        zoo.addCarne(6, carne);
        zoo.addPalha(240, palha);
        zoo.addPeixe(3, peixe);
    }

    public static void ListaRequerida(int requerimento) {
        Scanner input = new Scanner(System.in);
        boolean invalid = true;
        System.out.println("\nEscolha uma opção: ");
        if (requerimento == 1) {
            System.out.println("1 - Carne");
            System.out.println("2 - Palha");
            System.out.println("3 - Peixe");
            System.out.println("4 - Voltar para trás.");
            while (invalid) {
                invalid = false;
                switch (input.nextLine()) {
                    case "1" -> Lista2Requerida(1);
                    case "2" -> Lista2Requerida(2);
                    case "3" -> Lista2Requerida(3);
                    case "4" -> System.out.println();
                    default -> invalid = InvalidText();
                }
            }
        }
        if (requerimento == 2) {
            System.out.println("1 - Leões");
            System.out.println("2 - Elefantes");
            System.out.println("3 - Girafas");
            System.out.println("4 - Pinguins");
            System.out.println("5 - Voltar para trás.");
            while (invalid) {
                invalid = false;
                switch (input.nextLine()) {
                    case "1" -> Lista2Requerida(4);
                    case "2" -> Lista2Requerida(5);
                    case "3" -> Lista2Requerida(6);
                    case "4" -> Lista2Requerida(7);
                    case "5" -> System.out.println();
                    default -> invalid = InvalidText();
                }
            }
        }
        if (requerimento == 3) {
            System.out.println("1 - Tratadores");
            System.out.println("2 - Administradores");
            System.out.println("3 - Guias");
            System.out.println("4 - Visitantes");
            System.out.println("5 - Voltar para trás.");
            while (invalid) {
                invalid = false;
                switch (input.nextLine()) {
                    case "1" -> Lista2Requerida(8);
                    case "2" -> Lista2Requerida(9);
                    case "3" -> Lista2Requerida(10);
                    case "4" -> Lista2Requerida(11);
                    case "5" -> System.out.println();
                    default -> invalid = InvalidText();
                }
            }
        }

    }

    public static void Lista2Requerida(int requerimento) {
        Scanner input = new Scanner(System.in);
        String name;
        int ID;
        int age;
        int peso;
        int experience;


        boolean invalid = true;
        if (requerimento == 1) {
            while (invalid) {
                invalid = false;
                System.out.println("\n" + carne.toString());
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar.");
                System.out.println("2 - Remover.");
                System.out.println("3 - Voltar para tràs.");
                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Quanto que deseja adicionar?");
                        zoo.addCarne(Integer.parseInt(input.nextLine()), carne);
                        break;
                    case "2":
                        System.out.println("Quanto que deseja remover?");
                        zoo.removeCarne(Integer.parseInt(input.nextLine()), carne);
                        break;
                    case "3":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                        break;
                }
            }
        }
        if (requerimento == 2) {
            while (invalid) {
                invalid = false;
                System.out.println(palha.toString());
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar.");
                System.out.println("2 - Remover.");
                System.out.println("3 - Voltar para tràs.");
                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Quanto que deseja adicionar?");
                        zoo.addPalha(Integer.parseInt(input.nextLine()), palha);
                        break;
                    case "2":
                        System.out.println("Quanto que deseja remover?");
                        zoo.removePalha(Integer.parseInt(input.nextLine()), palha);
                        break;
                    case "3":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                        break;
                }
            }
        }
        if (requerimento == 3) {
            while (invalid) {
                invalid = false;
                System.out.println(peixe.toString());
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar.");
                System.out.println("2 - Remover.");
                System.out.println("3 - Voltar para tràs.");
                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Quanto que deseja adicionar?");
                        zoo.addPeixe(Integer.parseInt(input.nextLine()), peixe);
                        break;
                    case "2":
                        System.out.println("Quanto que deseja remover?");
                        zoo.removePeixe(Integer.parseInt(input.nextLine()), peixe);
                        break;
                    case "3":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                        break;
                }
            }
        }
        if (requerimento == 4) {
            while (invalid) {
                invalid = false;
                zoo.printLeoes();
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar um novo.");
                System.out.println("2 - Remover um existente.");
                System.out.println("3 - Mudar informações existentes.");
                System.out.println("4 - Voltar para trás.");
                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Qual é o nome do novo leão? (sem nomes repetidos)");
                        name = input.nextLine();
                        System.out.println("Qual é a idade do novo leão?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é o peso do novo leão?");
                        peso = Integer.parseInt(input.nextLine());
                        if (!zoo.validateLeao(name) && age >= 0 && peso >= 0) zoo.addLeao(name, age, peso);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        System.out.println("Qual é o nome do leão que deseja remover?");
                        name = input.nextLine();
                        if (zoo.validateLeao(name)) zoo.deleteLeao(name);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        System.out.println("Qual é o nome do leão que deseja mudar as informações?");
                        name = input.nextLine();
                        System.out.println("Qual é a atual idade do leão?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é o atual peso do leão?");
                        peso = Integer.parseInt(input.nextLine());
                        if (zoo.validateLeao(name) && age >= 0 && peso >= 0) zoo.changeLeao(name, age, peso);
                        else invalid = true;
                        break;
                    case "4":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                }
            }
        }
        if (requerimento == 5) {
            while (invalid) {
                invalid = false;
                zoo.printElefantes();
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar um novo.");
                System.out.println("2 - Remover um existente.");
                System.out.println("3 - Mudar informações existentes.");
                System.out.println("4 - Voltar para trás.");
                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Qual é o nome do novo elefante? (sem nomes repetidos)");
                        name = input.nextLine();
                        System.out.println("Qual é a idade do novo elefante?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é o peso do novo elefante?");
                        peso = Integer.parseInt(input.nextLine());
                        if (!zoo.validateElefante(name) && age >= 0 && peso >= 0) zoo.addElefante(name, age, peso);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        System.out.println("Qual é o nome do elefante que deseja remover?");
                        name = input.nextLine();
                        if (zoo.validateElefante(name)) zoo.deleteElefante(name);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        System.out.println("Qual é o nome do elefante que deseja mudar as informações?");
                        name = input.nextLine();
                        System.out.println("Qual é a atual idade do elefante?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é o atual peso do elefante?");
                        peso = Integer.parseInt(input.nextLine());
                        if (zoo.validateElefante(name) && age >= 0 && peso >= 0) zoo.changeElefante(name, age, peso);
                        else invalid = InvalidText();
                        break;
                    case "4":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                }
            }
        }
        if (requerimento == 6) {
            while (invalid) {
                invalid = false;
                zoo.printGirafas();
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar uma nova.");
                System.out.println("2 - Remover uma existente.");
                System.out.println("3 - Mudar informações existentes.");
                System.out.println("4 - Voltar para trás.");

                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Qual é o nome da nova girafa? (sem nomes repetidos)");
                        name = input.nextLine();
                        System.out.println("Qual é a idade da nova girafa?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é o peso da nova girafa?");
                        peso = Integer.parseInt(input.nextLine());
                        if (!zoo.validateGirafa(name) && age >= 0 && peso >= 0) zoo.addGirafa(name, age, peso);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        System.out.println("Qual é o nome da girafa que deseja remover?");
                        name = input.nextLine();
                        if (zoo.validateGirafa(name)) zoo.deleteGirafa(name);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        System.out.println("Qual é o nome da girafa que deseja mudar as informações?");
                        name = input.nextLine();
                        System.out.println("Qual é a atual idade da girafa?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é o atual peso da girafa?");
                        peso = Integer.parseInt(input.nextLine());
                        if (zoo.validateGirafa(name) && age >= 0 && peso >= 0) zoo.changeGirafa(name, age, peso);
                        else invalid = InvalidText();
                        break;
                    case "4":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                }
            }
        }
        if (requerimento == 7) {
            while (invalid) {
                invalid = false;
                zoo.printPinguins();
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar um novo.");
                System.out.println("2 - Remover um existente.");
                System.out.println("3 - Mudar informações existentes.");
                System.out.println("4 - Voltar para trás.");

                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Qual é o nome do novo pinguim? (sem nomes repetidos)");
                        name = input.nextLine();
                        System.out.println("Qual é a idade do novo pinguim?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é o peso do novo pinguim?");
                        peso = Integer.parseInt(input.nextLine());
                        if (!zoo.validatePinguim(name) && age >= 0 && peso >= 0) zoo.addPinguim(name, age, peso);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        System.out.println("Qual é o nome do pinguim que deseja remover?");
                        name = input.nextLine();
                        if (zoo.validatePinguim(name)) zoo.deletePinguim(name);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        System.out.println("Qual é o nome do pinguim que deseja mudar as informações?");
                        name = input.nextLine();
                        System.out.println("Qual é a atual idade do pinguim?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é o atual peso do pinguim?");
                        peso = Integer.parseInt(input.nextLine());
                        if (zoo.validatePinguim(name) && age >= 0 && peso >= 0) zoo.changePinguim(name, age, peso);
                        else invalid = InvalidText();
                        break;
                    case "4":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                }
            }
        }
        if (requerimento == 8) {
            while (invalid) {
                invalid = false;
                zoo.printTratadores();
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar um novo.");
                System.out.println("2 - Remover um existente.");
                System.out.println("3 - Mudar informações existentes.");
                System.out.println("4 - Associar animal.");
                System.out.println("5 - Dessassociar animal.");
                System.out.println("6 - Voltar para trás.");

                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Qual é o nome do novo tratador?");
                        name = input.nextLine();
                        System.out.println("Qual é o ID do novo tratador? (sem IDs repetidos)");
                        ID = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é a idade do novo tratador?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Quantos anos de experiência tem o novo tratador?");
                        experience = Integer.parseInt(input.nextLine());
                        if (!zoo.validateTratador(ID) && age >= 0 && experience >= 0)
                            zoo.addTratador(name, ID, age, experience);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        System.out.println("Qual é o ID do tratador que deseja remover?");
                        ID = Integer.parseInt(input.nextLine());
                        if (zoo.validateTratador(ID)) zoo.deleteTratador(ID);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        System.out.println("Qual é o ID do tratador que deseja mudar as informações?");
                        ID = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é a idade do tratador?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Quantos anos de experiência tem o tratador?");
                        experience = Integer.parseInt(input.nextLine());
                        if (zoo.validateTratador(ID) && age >= 0 && experience >= 0)
                            zoo.changeTratador(ID, age, experience);
                        else invalid = InvalidText();
                        break;
                    case "4":
                        Lista3Requerida(1);
                        break;
                    case "5":
                        Lista3Requerida(2);
                        break;
                    case "6":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                }
            }
        }
        if (requerimento == 9) {
            while (invalid) {
                invalid = false;
                zoo.printGuias();
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar um novo.");
                System.out.println("2 - Remover um existente.");
                System.out.println("3 - Mudar informações existentes.");
                System.out.println("4 - Voltar para trás.");

                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Qual é o nome do novo guia?");
                        name = input.nextLine();
                        System.out.println("Qual é o ID do novo guia? (sem IDs repetidos)");
                        ID = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é a idade do novo guia?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Quantos anos de experiência tem o novo guia?");
                        experience = Integer.parseInt(input.nextLine());
                        if (!zoo.validateGuia(ID) && age >= 0 && experience >= 0)
                            zoo.addGuia(name, ID, age, experience);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        System.out.println("Qual é o ID do guia que deseja remover?");
                        ID = Integer.parseInt(input.nextLine());
                        if (zoo.validateGuia(ID)) zoo.deleteGuia(ID);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        System.out.println("Qual é o ID do guia que deseja mudar as informações?");
                        ID = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é a idade do guia?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Quantos anos de experiência tem o guia?");
                        experience = Integer.parseInt(input.nextLine());
                        if (zoo.validateGuia(ID) && age >= 0 && experience >= 0) zoo.changeGuia(ID, age, experience);
                        else invalid = InvalidText();
                        break;
                    case "4":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                }
            }
        }
        if (requerimento == 10) {
            while (invalid) {
                invalid = false;
                zoo.printAdmins();
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar um novo.");
                System.out.println("2 - Remover um existente.");
                System.out.println("3 - Mudar informações existentes.");
                System.out.println("4 - Voltar para trás.");
                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Qual é o nome do novo administrador?");
                        name = input.nextLine();
                        System.out.println("Qual é o ID do novo administrador? (sem IDs repetidos)");
                        ID = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é a idade do novo administrador?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Quantos anos de experiência tem o novo administrador?");
                        experience = Integer.parseInt(input.nextLine());
                        if (!zoo.validateAdmin(ID) && age >= 0 && experience >= 0)
                            zoo.addAdmin(name, ID, age, experience);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        System.out.println("Qual é o ID do administrador que deseja remover?");
                        ID = Integer.parseInt(input.nextLine());
                        if (zoo.validateAdmin(ID)) zoo.deleteAdmin(ID);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        System.out.println("Qual é o ID do administrador que deseja mudar as informações?");
                        ID = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é a idade do administrador?");
                        age = Integer.parseInt(input.nextLine());
                        System.out.println("Quantos anos de experiência tem o administrador?");
                        experience = Integer.parseInt(input.nextLine());
                        if (zoo.validateAdmin(ID) && age >= 0 && experience >= 0) zoo.changeAdmin(ID, age, experience);
                        else invalid = InvalidText();
                        break;
                    case "4":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                }
            }
        }
        if (requerimento == 11) {
            while (invalid) {
                invalid = false;
                zoo.printVisitantes();
                System.out.println("O que pretende fazer?");
                System.out.println("1 - Adicionar um novo.");
                System.out.println("2 - Remover um existente.");
                System.out.println("3 - Voltar para trás.");
                switch (input.nextLine()) {
                    case "1":
                        System.out.println("Qual é o nome do novo visitante?");
                        name = input.nextLine();
                        System.out.println("Qual é o ID do novo visitante? (sem IDs repetidos)");
                        ID = Integer.parseInt(input.nextLine());
                        System.out.println("Qual é a idade do novo visitante?");
                        age = Integer.parseInt(input.nextLine());
                        if (!zoo.validateVisitante(ID) && age >= 0) zoo.addVisitante(name, ID, age);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        System.out.println("Qual é o ID do visitante que deseja remover?");
                        ID = Integer.parseInt(input.nextLine());
                        if (zoo.validateVisitante(ID)) zoo.deleteVisitante(ID);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                }
            }
        }
    }

    public static void Lista3Requerida(int requerimento) {
        Scanner input = new Scanner(System.in);
        String name;
        int ID;
        boolean invalid = true;

        System.out.println();
        zoo.printTratadores();
        zoo.printLeoes();
        zoo.printElefantes();
        zoo.printGirafas();
        zoo.printPinguins();
        if (requerimento == 1) {
            while (invalid) {
                invalid = false;
                System.out.println("Qual é o ID do Tratador a quem deseja associar um animal?");
                ID = Integer.parseInt(input.nextLine());
                System.out.println("Qual é o nome do animal que será associado?");
                name = input.nextLine();
                System.out.println("Qual é o tipo de animal?");
                System.out.println("1 - Leão");
                System.out.println("2 - Elefantes");
                System.out.println("3 - Girafa");
                System.out.println("4 - Pinguim");
                System.out.println("5 - Voltar para trás.");
                switch (input.nextLine()) {
                    case "1":
                        if (!zoo.validateAnimalInTratador(ID, name, 1)) zoo.setAnimalTratador(ID, name, 1);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        if (!zoo.validateAnimalInTratador(ID, name, 2)) zoo.setAnimalTratador(ID, name, 2);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        if (!zoo.validateAnimalInTratador(ID, name, 3)) zoo.setAnimalTratador(ID, name, 3);
                        else invalid = InvalidText();
                        break;
                    case "4":
                        if (!zoo.validateAnimalInTratador(ID, name, 4)) zoo.setAnimalTratador(ID, name, 4);
                        else invalid = InvalidText();
                        break;
                    case "5":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                        break;
                }
            }
        }
        if (requerimento == 2) {
            while (invalid) {
                invalid = false;
                System.out.println("Qual é o ID do Tratador a quem deseja desassociar um animal?");
                ID = Integer.parseInt(input.nextLine());
                System.out.println("Qual é o nome do animal que será desassociado?");
                name = input.nextLine();
                System.out.println("Qual é o tipo do animal?");
                System.out.println("1 - Leão");
                System.out.println("2 - Elefantes");
                System.out.println("3 - Girafa");
                System.out.println("4 - Pinguim");
                System.out.println("5 - Voltar para trás.");
                switch (input.nextLine()) {
                    case "1":
                        if (zoo.validateAnimalInTratador(ID, name, 1)) zoo.removeAnimalTratador(ID, name, 1);
                        else invalid = InvalidText();
                        break;
                    case "2":
                        if (zoo.validateAnimalInTratador(ID, name, 2)) zoo.removeAnimalTratador(ID, name, 2);
                        else invalid = InvalidText();
                        break;
                    case "3":
                        if (zoo.validateAnimalInTratador(ID, name, 3)) zoo.removeAnimalTratador(ID, name, 3);
                        else invalid = InvalidText();
                        break;
                    case "4":
                        if (zoo.validateAnimalInTratador(ID, name, 4)) zoo.removeAnimalTratador(ID, name, 4);
                        else invalid = InvalidText();
                        break;
                    case "5":
                        System.out.println();
                        break;
                    default:
                        invalid = InvalidText();
                        break;
                }
            }
        }
    }

    private static void encerrarPrograma() {
        System.out.println("Este é o final do seu zoo:");
        zoo.printZoo(carne, palha, peixe);
        System.exit(0);
    }

    private static boolean InvalidText() {
        System.out.println("A opção ou um dos argumentos não é válido.");
        return true;
    }
}