package frog;

public class Frog {
    private static int frogCount = 0;
    static int getCount(){
        return frogCount;
    }
    public Frog(){
        frogCount++;
    }
}

