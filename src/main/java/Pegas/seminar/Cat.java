package Pegas.seminar;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data()
public class Cat extends BaseCat implements Runner{
    private int maxRun;
    private int maxJump;

    public Cat(String name, int age, int maxRun, int maxJump) {
        super(name, age);
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void setName(String name) {
        if (name.isEmpty() || name.length() < 3) {
            throw new RuntimeException("Empty name");
        }else{
            setName(name);
        }
    }

    @Override
    public void setAge(int age) {
        if (age < 18) {
            throw new RuntimeException("Uncorrected age");
        }else{setAge(age);}
    }

    @Override
    public void printInfo() {
        System.out.println(Human.class.getSimpleName());
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                '}';
    }
}
