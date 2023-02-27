package day22overriding;

public class Cat extends Mammal{

    @Override//Override Annotation ==> Checks the overriding rules

    public void eat() {//Overriding method
        System.out.println("Cats eat...");

    }

    @Override
    public Animal create() {

        return new Cat();
    }

    @Override
    public Animal occur() {

        return new Cat();
    }

    @Override
    public Integer number() {
        return 456;
    }

    @Override
    public int num() {
        return 24;
    }
}

