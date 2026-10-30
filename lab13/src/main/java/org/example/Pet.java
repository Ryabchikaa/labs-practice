package org.example;

public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;
    private String owner;

    public Pet(String name, String species, int age, double weight, String owner) throws InvalidPetDataException {
        if (age < 0) {
            throw new InvalidPetDataException("возраст не может быть отрицательным");
        }
        if (weight <= 0) {
            throw new InvalidPetDataException("вес должен быть больше нуля");
        }
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.owner = owner;
    }

    public void visitVet() throws VetException {
        if (weight < 1.0) {
            throw new VetException("критический дефицит веса у питомца " + name);
        }
        System.out.println("питомец " + name + " успешно осмотрен ветеринаром");
    }

    public void updateWeight(double newWeight) throws InvalidPetDataException {
        if (newWeight <= 0) {
            throw new InvalidPetDataException("новый вес указан неверно");
        }
        this.weight = newWeight;
        System.out.println("вес питомца " + name + " обновлен: " + weight);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}