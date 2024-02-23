package Pegas;

import lombok.*;

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Human {
    private String name;
    private int age;

    private void updateAge(int age) {
        if (age < 18) {
            throw new RuntimeException("Uncorrected age");
        }
        this.age = age;
    }

    private void updateName(String name) {
        if (name.isEmpty() || name.length() < 3) {
            throw new RuntimeException("Empty name");
        }
        this.name = name;
    }

    public void setName(String name) {
        updateName(name);
    }

    public void setAge(int age) {
        updateAge(age);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Human;
    }
    public static Human create(String name, int age){
        if (name.isEmpty() || name.length() < 3) {
            throw new RuntimeException("Empty name");
        }
        if (age < 18) {
            throw new RuntimeException("Uncorrected age");
        }
        return new Human(name,age);
    }

}
