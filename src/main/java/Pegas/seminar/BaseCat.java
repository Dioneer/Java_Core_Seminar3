package Pegas.seminar;

import lombok.*;

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseCat {
    private String name;
    private int age;

    public abstract void setName(String name);

    public abstract void setAge(int age);

    public abstract void printInfo();
}
