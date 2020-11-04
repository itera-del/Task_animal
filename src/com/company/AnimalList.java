package com.company;

/**
 * @author 刘芋池
 * @Description
 * @create 2020/11/4 20:24
 */
public class AnimalList {
    private Animal[] animals;
    private int total =0;//记录动物的数量

    public AnimalList(int capacity){
        animals =new Animal[capacity];
    }
    public boolean addAnimal(Animal animal){
        if(total>= animals.length){
            return  false;//失败
        }
        animals[total++]=animal;
        return true;//成功
    }
    public boolean replaceAnimal(int index,Animal cust){
        if(index<0||index>=total){
            return false;
        }
        animals[index]=cust;
        return true;
    }
    public boolean deleteAnimal(int index){
        if(index<0||index>=total){
            return false;
        }
        for(int i=index;i<total-1;i++){
            animals[i]=animals[i+1];
        }
        animals[total-1]=null;
        total--;
        return true;
    }
    public Animal[] getAllAnimals(){
        Animal[] ani=new Animal[total];
        for(int i=0;i<total;i++){
            ani[i]=animals[i];
        }
        return ani;
    }
    public Animal getAniaml(int index){
        if(index<0||index>=total){
            return null;
        }
        return animals[index];
    }
    public int getTotal(){
        return total;
    }

    public Animal[] getAnimals() {
        return animals;
    }

}

