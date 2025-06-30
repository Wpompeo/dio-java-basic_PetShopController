import java.util.Scanner;

public class Main{
     private final static Scanner sc = new Scanner(System.in);
     private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
       
        var option = -1;

        do { 
            System.out.println("=====================================");
            System.out.println("Bem-vindo à máquina de banho de pets!");
            System.out.println("===Esolha uma das opções abaixo===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar nivel de água da maquina");
            System.out.println("5 - Verificar nivel de shampoo da maquina");
            System.out.println("6 - Verificar se há pet na máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Remover pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            System.out.println("=====================================");
            option = sc.nextInt();
            sc.close();

            switch (option){
                case 0 -> System.exit(0);
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                default -> System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }

        } while (option != 0);        
        
    }
    private static void setWater() {
        petMachine.addWater();
        System.out.println("Água adicionada à máquina!");
    }
    private static void setShampoo() {
        petMachine.addShampoo();
        System.out.println("Shampoo adicionado à máquina!");
    }
    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("Quantidade de água disponível na máquina: " + amount);
    }
    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("Quantidade de shampoo disponível na máquina: " + amount);
    }
    private static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Há um pet na máquina!" : "Não há pet na máquina!");
    }
    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet o nome do não pode ficar em branco:");
            name = sc.next();         
          
        }        
        var pet = new Pet(name); 
        petMachine.setPet(pet);
        System.out.println("Pet " + pet.getName() + " adicionado à máquina!");        
    }
    
}