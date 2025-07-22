package selftest1;

 class Hobbit {
    int countGold(int x,int y) {return x+y; }
}
public class Frido extends Hobbit {
    public static void main(String[] args) {
        Hobbit obj = new Hobbit();
        int myGold = 7;
        System.out.println(obj.countGold(myGold,6));
    }
 }
