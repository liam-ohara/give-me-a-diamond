package liamohara;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String makeDiamond(int diamondSize) {

        if (diamondSize <= 0 || diamondSize % 2 == 0) {
            return "You must provide diamond size as a positive odd integer.";

        }
        return "";
    }
}