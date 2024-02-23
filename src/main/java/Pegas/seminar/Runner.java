package Pegas.seminar;

public interface Runner {
    int getMaxJump();
    String getName();
    int getMaxRun();
    default public boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s jump over the wall %d ink\n",getName(), height);
            return true;
        }else{
            System.out.printf("%s can't jump over the wall %d ink\n",name, height);
            return false;
        }
    }

    default public boolean run(int length) {
        if (length <= getMaxRun()) {
            System.out.printf("%s jump over the wall %d ink\n",getName(), length);
            return true;
        }else{
            System.out.printf("%s can't jump over the wall %d ink\n",getName(), length);
            return false;
        }
    }
}
