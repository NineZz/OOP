
public class Owner {

    protected final String name;
    protected Animal animal;

    public Owner() {
        name = "";
        animal = null;
    }

    public Owner(String name) {
        this.name = name;
        animal = null;
    }

    public Owner(Animal animal) {
        this.animal = animal;
        name = "";
    }

    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void feedFood(Food f) {
        animal.setPower(animal.getPower() + f.getPower());
    }

    public String toString() {
        return "Owner : name = " + name + ", Animal : name = " + animal.getName() + ", power = " + animal.getPower() + ", age = " + animal.getAge();
    }

    public void protectOwnerFrom(Animal a) {
        if (getAnimal() instanceof Dog)){
            ((Dog)getAnimal()).kick(a);
        }
        else {
            ((Pigeous)getAnimal()).wingAttack(a);
        }
    }
}
