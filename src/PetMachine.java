public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;
    

    public void takeAShower(){
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho!");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }
    public void addWater(){
        if (water == 30) {
            System.out.println("A máquina já está cheia de água!");
            return;
        }
        water += 2;
    }
    public void addShampoo(){
        if (shampoo == 10) {
            System.out.println("A máquina já está cheia de shampoo!");
            return;
        }
        shampoo += 2;
    }   
    public int getWater() {
        return water;
    }
    public int getShampoo() {
        return shampoo;
    }
    public boolean hasPet(){
        return pet != null;
    }
    public void setPet(Pet pet) {

        if (!this.clean) {
            System.out.println("A máquina não está limpa! Limpe-a antes de colocar o pet!");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + "está na máquina neste momento!");
            return;
        }
        this.pet = pet;
    }
    public void removePet() {
        if (!hasPet()) {
            System.out.println("Não há pet na máquina!");
            return;
        }
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo e foi removido da máquina!");
        this.pet = null;
    }

    public void washMachine() {
        if (this.pet != null) {
            System.out.println("Remova o pet da máquina antes de lavá-la!");
            return;
        }        
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi lavada e está pronta para uso!");
    }

}
