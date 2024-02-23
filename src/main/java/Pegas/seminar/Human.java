package Pegas.seminar;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data()
public class Human extends BaseHuman implements Runner{
    private int maxRun;
    private int maxJump;

    private Human(String name, int age,int maxRun,int maxJump) {
        super(name, age);
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public static Human create(String name, int age,int maxRun,int maxJump){
        if (name.isEmpty() || name.length() < 3) {
            throw new RuntimeException("Empty name");
        }
        if (age < 18) {
            throw new RuntimeException("Uncorrected age");
        }
        return new Human(name,age,maxRun,maxJump);
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
        return "Human{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                '}';
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.printf("%s jump over the wall %d ink\n",getName(), height);
            return true;
        }else{
            System.out.printf("%s can't jump over the wall %d ink\n",getName(), height);
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length <= maxRun) {
            System.out.printf("%s jump over the wall %d ink\n",getName(), length);
            return true;
        }else{
            System.out.printf("%s can't jump over the wall %d ink\n",getName(), length);
            return false;
        }
    }
}
