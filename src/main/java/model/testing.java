package model;

public class testing {
    public static void main(String[] args) {
        Hero h = new Hero(0,10,0,0,HeroType.MARCOS);
        System.out.println(h.effectiveHit(50));
    }
}