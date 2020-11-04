package com.company;

/**
 * @author 刘芋池
 * @Description
 * @create 2020/11/4 20:19
 */
public class Animal  {
    private String species;
    private String gender;
    public int age;

    public String getSpecies() {
        return species;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Animal(){

    }

    public Animal(String species, String gender, int age) {
        this.species = species;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
