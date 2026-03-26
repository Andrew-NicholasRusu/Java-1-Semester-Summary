package AnimalClass;

public abstract class Animal implements Adoptable {
    protected String name;
    protected int age;

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();
    public abstract String getType();
    public abstract void getInfo();

}
