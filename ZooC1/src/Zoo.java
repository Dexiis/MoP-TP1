import java.util.ArrayList;
import java.util.Objects;

/**
 * Classe que representa um Zoológico.
 */
public class Zoo {
    private String name;
    private int preçario;
    ArrayList<Leao> leoes = new ArrayList<>();
    ArrayList<Elefante> elefantes = new ArrayList<>();
    ArrayList<Girafa> girafas = new ArrayList<>();
    ArrayList<Pinguim> pinguins = new ArrayList<>();
    ArrayList<Tratador> tratadores = new ArrayList<>();
    ArrayList<Administrador> admins = new ArrayList<>();
    ArrayList<Guia> guias = new ArrayList<>();
    ArrayList<Visitante> visitantes = new ArrayList<>();

    /**
     * Construtor da classe Zoo.
     *
     * @param name     Nome do zoológico
     * @param preçario Preço de entrada do zoológico
     */
    public Zoo(String name, int preçario) {
        this.name = name;
        this.preçario = preçario;
    }

    /**
     * Obtém o nome do zoológico.
     *
     * @return Nome do zoológico.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtém o preço de entrada do zoológico.
     *
     * @return Preço de entrada.
     */
    public int getPreçario() {
        return this.preçario;
    }

    /**
     * Define um novo preço de entrada para o zoológico.
     *
     * @param preçario Novo preço de entrada.
     */
    public void setPreçario(int preçario) {
        this.preçario = preçario;
    }

    /**
     * Define um novo nome para o zoológico.
     *
     * @param name Novo nome do zoológico.
     */
    public void setName(String name) {
        this.name = name;
    }


    // ADDS E REMOVES

    /**
     * Adiciona um novo leão à lista.
     *
     * @param name Nome do leão.
     * @param age  Idade do leão.
     * @param peso Peso do leão.
     */
    public void addLeao(String name, int age, int peso) {
        leoes.add(new Leao(name, age, peso));
        System.out.println("O leão foi adicionado com sucesso!");
    }

    /**
     * Remove um leão da lista pelo nome.
     *
     * @param name Nome do leão a ser removido.
     */
    public void deleteLeao(String name) {
        for (Leao x : leoes)
            if (x.getName().equals(name)) {
                this.leoes.remove(x);
                break;
            }
        System.out.println("O leão foi removido com sucesso!");
    }

    /**
     * Modifica os atributos de um leão existente.
     *
     * @param name Nome do leão.
     * @param age  Nova idade do leão.
     * @param peso Novo peso do leão.
     */
    public void changeLeao(String name, int age, int peso) {
        for (Leao x : leoes)
            if (Objects.equals(x.getName(), name)) {
                x.setAge(age);
                x.setPeso(peso);
            }
        System.out.println("O leão foi mudado com sucesso!");
    }

    /**
     * Adiciona um novo elefante à lista.
     *
     * @param name Nome do elefante.
     * @param age  Idade do elefante.
     * @param peso Peso do elefante.
     */
    public void addElefante(String name, int age, int peso) {
        elefantes.add(new Elefante(name, age, peso));
        System.out.println("O elefante foi adicionado com sucesso!");
    }

    /**
     * Remove um elefante da lista pelo nome.
     *
     * @param name Nome do elefante a ser removido.
     */
    public void deleteElefante(String name) {
        for (Elefante x : elefantes) {
            if (x.getName().equals(name)) {
                this.elefantes.remove(x);
                break;
            }
        }
        System.out.println("O elefante foi removido com sucesso!");
    }

    /**
     * Modifica os atributos de um elefante existente.
     *
     * @param name Nome do elefante.
     * @param age  Nova idade do elefante.
     * @param peso Novo peso do elefante.
     */
    public void changeElefante(String name, int age, int peso) {
        for (Elefante x : elefantes)
            if (Objects.equals(x.getName(), name)) {
                x.setAge(age);
                x.setPeso(peso);
            }
        System.out.println("O elefante foi mudado com sucesso!");
    }

    /**
     * Adiciona uma nova girafa à lista de girafas.
     *
     * @param name Nome da girafa a ser adicionada.
     * @param age  Idade da girafa a ser adicionada.
     * @param peso Peso da girafa a ser adicionada.
     */
    public void addGirafa(String name, int age, int peso) {
        girafas.add(new Girafa(name, age, peso));
        System.out.println("A girafa foi adicionada com sucesso!");
    }

    /**
     * Remove uma girafa da lista de girafas com base no nome fornecido.
     *
     * @param name Nome da girafa a ser removida.
     */
    public void deleteGirafa(String name) {
        for (Girafa x : girafas) {
            if (x.getName().equals(name)) {
                this.girafas.remove(x);
                break;
            }
        }
        System.out.println("A girafa foi removida com sucesso!");
    }

    /**
     * Modifica as informações de uma girafa (idade e peso) com base no nome fornecido.
     *
     * @param name Nome da girafa a ser modificada.
     * @param age  Nova idade da girafa.
     * @param peso Novo peso da girafa.
     */
    public void changeGirafa(String name, int age, int peso) {
        for (Girafa x : girafas)
            if (Objects.equals(x.getName(), name)) {
                x.setAge(age);
                x.setPeso(peso);
            }
        System.out.println("A girafa foi mudada com sucesso!");
    }

    /**
     * Adiciona um novo pinguim à lista de pinguins.
     *
     * @param name Nome do pinguim a ser adicionado.
     * @param age  Idade do pinguim a ser adicionado.
     * @param peso Peso do pinguim a ser adicionado.
     */
    public void addPinguim(String name, int age, int peso) {
        pinguins.add(new Pinguim(name, age, peso));
        System.out.println("O pinguim foi adicionado com sucesso!");
    }

    /**
     * Remove um pinguim da lista de pinguins com base no nome fornecido.
     *
     * @param name Nome do pinguim a ser removido.
     */
    public void deletePinguim(String name) {
        for (Pinguim x : pinguins) {
            if (x.getName().equals(name)) {
                this.pinguins.remove(x);
                break;
            }
        }
        System.out.println("O pinguim foi removido com sucesso!");
    }

    /**
     * Modifica as informações de um pinguim (idade e peso) com base no nome fornecido.
     *
     * @param name Nome do pinguim a ser modificado.
     * @param age  Nova idade do pinguim.
     * @param peso Novo peso do pinguim.
     */
    public void changePinguim(String name, int age, int peso) {
        for (Pinguim x : pinguins)
            if (Objects.equals(x.getName(), name)) {
                x.setAge(age);
                x.setPeso(peso);
            }
        System.out.println("O pinguim foi mudado com sucesso!");
    }


    /**
     * Adiciona um novo tratador à lista de tratadores.
     *
     * @param name       Nome do tratador a ser adicionado.
     * @param ID         Identificação única do tratador.
     * @param age        Idade do tratador.
     * @param experience Anos de experiência do tratador.
     */
    public void addTratador(String name, int ID, int age, int experience) {
        tratadores.add(new Tratador(name, age, ID, experience));
        System.out.println("O tratador foi adicionado com sucesso!");
    }

    /**
     * Remove um tratador da lista de tratadores com base no ID fornecido.
     *
     * @param ID Identificação única do tratador a ser removido.
     */
    public void deleteTratador(int ID) {
        for (Tratador x : tratadores) {
            if (x.getID() == ID) {
                this.tratadores.remove(x);
                break;
            }
        }
        System.out.println("O tratador foi removido com sucesso!");
    }

    /**
     * Modifica as informações de um tratador (idade e experiência) com base no ID fornecido.
     *
     * @param ID         Identificação única do tratador a ser modificado.
     * @param age        Nova idade do tratador.
     * @param experience Nova quantidade de experiência do tratador.
     */
    public void changeTratador(int ID, int age, int experience) {
        for (Tratador x : tratadores)
            if (x.getID() == ID) {
                x.setAge(age);
                x.setExperience(experience);
            }
        System.out.println("O tratador foi mudado com sucesso!");
    }

    /**
     * Associa um animal ao tratador com base no ID do tratador, nome do animal e tipo de procedimento.
     *
     * @param ID        Identificação única do tratador.
     * @param name      Nome do animal a ser associado.
     * @param procedure Tipo de animal a ser associado (1: Leão, 2: Elefante, 3: Girafa, 4: Pinguim).
     */
    public void setAnimalTratador(int ID, String name, int procedure) {
        if (procedure == 1) for (Tratador x : tratadores)
            if (x.getID() == ID) for (Leao y : leoes) if (Objects.equals(y.getName(), name)) x.setAnimais(y);
        if (procedure == 2) for (Tratador x : tratadores)
            if (x.getID() == ID) for (Elefante y : elefantes) if (Objects.equals(y.getName(), name)) x.setAnimais(y);
        if (procedure == 3) for (Tratador x : tratadores)
            if (x.getID() == ID) for (Girafa y : girafas) if (Objects.equals(y.getName(), name)) x.setAnimais(y);
        if (procedure == 4) for (Tratador x : tratadores)
            if (x.getID() == ID) for (Pinguim y : pinguins) if (Objects.equals(y.getName(), name)) x.setAnimais(y);
        System.out.println("Animal associado com sucesso!");
    }

    /**
     * Remove a associação de um animal com o tratador com base no ID do tratador, nome do animal e tipo de procedimento.
     *
     * @param ID        Identificação única do tratador.
     * @param name      Nome do animal a ser desassociado.
     * @param procedure Tipo de animal a ser desassociado (1: Leão, 2: Elefante, 3: Girafa, 4: Pinguim).
     */
    public void removeAnimalTratador(int ID, String name, int procedure) {
        if (procedure == 1) for (Tratador x : tratadores)
            if (x.getID() == ID) for (Leao y : leoes) if (Objects.equals(y.getName(), name)) x.removeAnimais(y);
        if (procedure == 2) for (Tratador x : tratadores)
            if (x.getID() == ID) for (Elefante y : elefantes) if (Objects.equals(y.getName(), name)) x.removeAnimais(y);
        if (procedure == 3) for (Tratador x : tratadores)
            if (x.getID() == ID) for (Girafa y : girafas) if (Objects.equals(y.getName(), name)) x.removeAnimais(y);
        if (procedure == 4) for (Tratador x : tratadores)
            if (x.getID() == ID) for (Pinguim y : pinguins) if (Objects.equals(y.getName(), name)) x.removeAnimais(y);
        System.out.println("Animal desassociado com sucesso!");
    }

    /**
     * Adiciona um novo administrador à lista de administradores.
     *
     * @param name       Nome do administrador a ser adicionado.
     * @param ID         Identificação única do administrador.
     * @param age        Idade do administrador.
     * @param experience Anos de experiência do administrador.
     */
    public void addAdmin(String name, int ID, int age, int experience) {
        admins.add(new Administrador(name, age, ID, experience));
        System.out.println("O administrador foi adicionado com sucesso!");
    }

    /**
     * Remove um administrador da lista de administradores com base no ID fornecido.
     *
     * @param ID Identificação única do administrador a ser removido.
     */
    public void deleteAdmin(int ID) {
        for (Administrador x : admins) {
            if (x.getID() == ID) {
                this.admins.remove(x);
                break;
            }
        }
        System.out.println("O administrador foi removido com sucesso!");
    }

    /**
     * Modifica as informações de um administrador (idade e experiência) com base no ID fornecido.
     *
     * @param ID         Identificação única do administrador a ser modificado.
     * @param age        Nova idade do administrador.
     * @param experience Nova quantidade de experiência do administrador.
     */
    public void changeAdmin(int ID, int age, int experience) {
        for (Administrador x : admins)
            if (x.getID() == ID) {
                x.setAge(age);
                x.setExperience(experience);
            }
        System.out.println("O administrador foi mudado com sucesso!");
    }

    /**
     * Adiciona um novo guia à lista de guias.
     *
     * @param name       Nome do guia a ser adicionado.
     * @param ID         Identificação única do guia.
     * @param age        Idade do guia.
     * @param experience Anos de experiência do guia.
     */
    public void addGuia(String name, int ID, int age, int experience) {
        guias.add(new Guia(name, age, ID, experience));
        System.out.println("O guia foi adicionado com sucesso!");
    }

    /**
     * Remove um guia da lista de guias com base no ID fornecido.
     *
     * @param ID Identificação única do guia a ser removido.
     */
    public void deleteGuia(int ID) {
        for (Guia x : guias) {
            if (x.getID() == ID) {
                this.guias.remove(x);
                break;
            }
        }
        System.out.println("O guia foi removido com sucesso!");
    }

    /**
     * Modifica as informações de um guia (idade e experiência) com base no ID fornecido.
     *
     * @param ID         Identificação única do guia a ser modificado.
     * @param age        Nova idade do guia.
     * @param experience Nova quantidade de experiência do guia.
     */
    public void changeGuia(int ID, int age, int experience) {
        for (Guia x : guias)
            if (x.getID() == ID) {
                x.setAge(age);
                x.setExperience(experience);
            }
        System.out.println("O guia foi mudado com sucesso!");
    }


    /**
     * Adiciona um novo visitante à lista de visitantes.
     *
     * @param name Nome do visitante a ser adicionado.
     * @param ID   Identificação única do visitante.
     * @param age  Idade do visitante.
     */
    public void addVisitante(String name, int ID, int age) {
        visitantes.add(new Visitante(name, age, ID));
        System.out.println("O visitante foi adicionado com sucesso!");
    }

    /**
     * Remove um visitante da lista de visitantes com base no ID fornecido.
     *
     * @param ID Identificação única do visitante a ser removido.
     */
    public void deleteVisitante(int ID) {
        for (Visitante x : visitantes) {
            if (x.getID() == ID) {
                this.visitantes.remove(x);
                break;
            }
        }
        System.out.println("O visitante foi removido com sucesso!");
    }


    /**
     * Adiciona uma quantidade de carne ao estoque de carne.
     *
     * @param peso  Quantidade de carne a ser adicionada.
     * @param carne Objeto do tipo Carne que representa o estoque de carne.
     */
    public void addCarne(int peso, Carne carne) {
        carne.setQuantidade(carne.getQuantidade() + peso);
        System.out.println("A carne foi adicionada com sucesso!");
    }

    /**
     * Remove uma quantidade de carne do estoque de carne, se a quantidade for válida.
     *
     * @param peso  Quantidade de carne a ser removida.
     * @param carne Objeto do tipo Carne que representa o estoque de carne.
     */
    public void removeCarne(int peso, Carne carne) {
        if (carne.getQuantidade() - peso >= 0) {
            carne.setQuantidade(carne.getQuantidade() - peso);
            System.out.println("A carne foi removida com sucesso!");
        } else System.out.print("Esse valor é inválido.");
    }

    /**
     * Adiciona uma quantidade de palha ao estoque de palha.
     *
     * @param peso  Quantidade de palha a ser adicionada.
     * @param palha Objeto do tipo Palha que representa o estoque de palha.
     */
    public void addPalha(int peso, Palha palha) {
        palha.setQuantidade(palha.getQuantidade() + peso);
        System.out.println("A palha foi adicionada com sucesso!");
    }

    /**
     * Remove uma quantidade de palha do estoque de palha, se a quantidade for válida.
     *
     * @param peso  Quantidade de palha a ser removida.
     * @param palha Objeto do tipo Palha que representa o estoque de palha.
     */
    public void removePalha(int peso, Palha palha) {
        if (palha.getQuantidade() - peso >= 0) {
            palha.setQuantidade(palha.getQuantidade() - peso);
            System.out.println("A palha foi removida com sucesso!");
        } else System.out.print("Esse valor é inválido.");
    }

    /**
     * Adiciona uma quantidade de peixe ao estoque de peixe.
     *
     * @param peso  Quantidade de peixe a ser adicionada.
     * @param peixe Objeto do tipo Peixe que representa o estoque de peixe.
     */
    public void addPeixe(int peso, Peixe peixe) {
        peixe.setQuantidade(peixe.getQuantidade() + peso);
        System.out.println("O peixe foi adicionado com sucesso!");
    }

    /**
     * Remove uma quantidade de peixe do estoque de peixe, se a quantidade for válida.
     *
     * @param peso  Quantidade de peixe a ser removida.
     * @param peixe Objeto do tipo Peixe que representa o estoque de peixe.
     */
    public void removePeixe(int peso, Peixe peixe) {
        if (peixe.getQuantidade() - peso >= 0) {
            peixe.setQuantidade(peixe.getQuantidade() - peso);
            System.out.println("O peixe foi removido com sucesso!");
        } else System.out.print("Esse valor é inválido.");
    }


    // PRINTS

    /**
     * Imprime informações sobre o zoológico, incluindo todos os animais, tratadores, administradores,
     * guias e visitantes, bem como a quantidade de carne, palha e peixe disponíveis.
     *
     * @param carne Objeto do tipo Carne, representando a quantidade de carne disponível no zoológico.
     * @param palha Objeto do tipo Palha, representando a quantidade de palha disponível no zoológico.
     * @param peixe Objeto do tipo Peixe, representando a quantidade de peixe disponível no zoológico.
     */
    public void printZoo(Carne carne, Palha palha, Peixe peixe) {
        System.out.println();
        printLeoes();
        printElefantes();
        printGirafas();
        printPinguins();
        printTratadores();
        printAdmins();
        printGuias();
        printVisitantes();
        System.out.println(carne.toString());
        System.out.println(palha.toString());
        System.out.println(peixe.toString());
    }

    /**
     * Imprime informações sobre todos os leões presentes no zoológico.
     */
    public void printLeoes() {
        for (Leao x : leoes) System.out.println(x.toString());
    }

    /**
     * Imprime informações sobre todos os elefantes presentes no zoológico.
     */
    public void printElefantes() {
        for (Elefante x : elefantes) System.out.println(x.toString());
    }

    /**
     * Imprime informações sobre todas as girafas presentes no zoológico.
     */
    public void printGirafas() {
        for (Girafa x : girafas) System.out.println(x.toString());
    }

    /**
     * Imprime informações sobre todos os pinguins presentes no zoológico.
     */
    public void printPinguins() {
        for (Pinguim x : pinguins) System.out.println(x.toString());
    }

    /**
     * Imprime informações sobre todos os tratadores presentes no zoológico, incluindo os animais associados a eles.
     */
    public void printTratadores() {
        for (Tratador x : tratadores) {
            System.out.println(x.toString());
            x.AnimaisAssociadosToString();
        }
    }

    /**
     * Imprime informações sobre todos os administradores presentes no zoológico.
     */
    public void printAdmins() {
        for (Administrador x : admins) System.out.println(x.toString());
    }

    /**
     * Imprime informações sobre todos os guias presentes no zoológico.
     */
    public void printGuias() {
        for (Guia x : guias) System.out.println(x.toString());
    }

    /**
     * Imprime informações sobre todos os visitantes presentes no zoológico.
     */
    public void printVisitantes() {
        for (Visitante x : visitantes) System.out.println(x.toString());
    }


    //  VALIDATES

    /**
     * Valida se um leão com o nome fornecido existe na lista de leões.
     *
     * @param name Nome do leão a ser verificado.
     * @return true se o leão existir, false caso contrário.
     */
    public boolean validateLeao(String name) {
        for (Leao x : leoes) if (x.getName().equals(name)) return true;
        return false;
    }

    /**
     * Valida se um elefante com o nome fornecido existe na lista de elefantes.
     *
     * @param name Nome do elefante a ser verificado.
     * @return true se o elefante existir, false caso contrário.
     */
    public boolean validateElefante(String name) {
        for (Elefante x : elefantes) if (x.getName().equals(name)) return true;
        return false;
    }

    /**
     * Valida se uma girafa com o nome fornecido existe na lista de girafas.
     *
     * @param name Nome da girafa a ser verificada.
     * @return true se a girafa existir, false caso contrário.
     */
    public boolean validateGirafa(String name) {
        for (Girafa x : girafas) if (x.getName().equals(name)) return true;
        return false;
    }

    /**
     * Valida se um pinguim com o nome fornecido existe na lista de pinguins.
     *
     * @param name Nome do pinguim a ser verificado.
     * @return true se o pinguim existir, false caso contrário.
     */
    public boolean validatePinguim(String name) {
        for (Pinguim x : pinguins) if (x.getName().equals(name)) return true;
        return false;
    }

    /**
     * Valida se um tratador com o ID fornecido existe na lista de tratadores.
     *
     * @param ID Identificação do tratador a ser verificado.
     * @return true se o tratador existir, false caso contrário.
     */
    public boolean validateTratador(int ID) {
        for (Tratador x : tratadores) if (x.getID() == ID) return true;
        return false;
    }

    /**
     * Valida se um administrador com o ID fornecido existe na lista de administradores.
     *
     * @param ID Identificação do administrador a ser verificado.
     * @return true se o administrador existir, false caso contrário.
     */
    public boolean validateAdmin(int ID) {
        for (Administrador x : admins) if (x.getID() == ID) return true;
        return false;
    }

    /**
     * Valida se um guia com o ID fornecido existe na lista de guias.
     *
     * @param ID Identificação do guia a ser verificado.
     * @return true se o guia existir, false caso contrário.
     */
    public boolean validateGuia(int ID) {
        for (Guia x : guias) if (x.getID() == ID) return true;
        return false;
    }

    /**
     * Valida se um visitante com o ID fornecido existe na lista de visitantes.
     *
     * @param ID Identificação do visitante a ser verificado.
     * @return true se o visitante existir, false caso contrário.
     */
    public boolean validateVisitante(int ID) {
        for (Visitante x : visitantes) if (x.getID() == ID) return true;
        return false;
    }

    /**
     * Valida se um tratador com o ID fornecido tem um animal associado com o nome e tipo específicos.
     * O procedimento especifica o tipo de animal a ser verificado (Leão, Elefante, Girafa, ou Pinguim).
     *
     * @param ID        O identificador do tratador a ser verificado.
     * @param name      O nome do animal a ser verificado.
     * @param procedure O procedimento que define o tipo de animal:
     *                  1 para Leão, 2 para Elefante, 3 para Girafa, 4 para Pinguim.
     * @return true se o tratador tiver o animal associado, false caso contrário.
     */
    public boolean validateAnimalInTratador(int ID, String name, int procedure) {
        if (procedure == 1) {
            if (validateTratador(ID) && validateLeao(name)) for (Tratador x : tratadores)
                if (x.getID() == ID) {
                    return x.checkAnimalInTratador(name, 1);
                }
        }
        if (procedure == 2) {
            if (validateTratador(ID) && validateElefante(name)) for (Tratador x : tratadores)
                if (x.getID() == ID) {
                    return x.checkAnimalInTratador(name, 2);
                }
        }
        if (procedure == 3) {
            if (validateTratador(ID) && validateGirafa(name)) for (Tratador x : tratadores)
                if (x.getID() == ID) {
                    return x.checkAnimalInTratador(name, 3);
                }
        }
        if (procedure == 4) {
            if (validateTratador(ID) && validatePinguim(name)) for (Tratador x : tratadores)
                if (x.getID() == ID) {
                    return x.checkAnimalInTratador(name, 4);
                }
        }
        return false;
    }

    /**
     * Retorna uma representação textual do zoológico.
     *
     * @return String representando o zoológico.
     */
    public String toString() {
        return "O Zoo " + this.name + " tem o preço de entrada de " + this.preçario + "$.";
    }
}