package Pegas.seminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Human human = Human.create("Mimo", 25, 25,55);
        human.printInfo();
        Robot robot = new Robot("Mimo", 25, 25,55);
        System.out.println(robot);
        List<Runner> runners = new ArrayList<>(Arrays.asList(human,robot));
    }
}
