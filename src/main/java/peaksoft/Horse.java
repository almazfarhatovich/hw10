package peaksoft;

public class Horse implements Animal{
    private String breed;
    private String color;

    public Horse() {
    }

    public Horse(String breed, String color) {
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
        System.out.println("Horse is added-init method is working");
    }

    @Override
    public void AnimalMinus() {
        System.out.println("Horse is cancelled-destroy method is working");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                "}\n";
    }
}
