public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Marc" , 15 , 100, 90,30);
        Fighter f2 = new Fighter("Alex" , 10 , 95, 100,50);
        Match match= new Match(f1 ,f2,80,105);
        match.run();
    }
}
