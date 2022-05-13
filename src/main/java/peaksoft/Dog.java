package peaksoft;

public class Dog implements Animal{
    private String breed;
    private String color;

    public Dog() {
    }

    public Dog( String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void AnimalPlus() {
        System.out.println("Dog is added-init method is working");
    }

    @Override
    public void AnimalMinus() {
        System.out.println("Dog is cancelled-destroy method is working");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                "}\n";
    }
}