package Pegas.seminar;

public class Championship {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Barsik", 5,1500, 300),
                new Cat("Vasya", 10,1000, 300),
                new Robot("R2D2", 1000, 9999,0),
                new Robot("C3PO", 100, 3000,10),
                Human.create("Petr", 20, 3000, 450),
                Human.create("Pavel", 25, 8000, 150)
        };
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall(300)
        };
        for(Runner i:runners){
            for(Obstacle j:obstacles){
                if(j instanceof Track){
                    if(!i.run(j.getLength()))break;
                }
                if(j instanceof Wall){
                    if(!i.jump(j.getHeight()))break;
                }
            }
        }
    }
}
