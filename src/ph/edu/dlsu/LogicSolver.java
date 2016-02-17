package ph.edu.dlsu;

public class LogicSolver {

    public static void impliTable(boolean x, boolean y) {
        System.out.println("|\t" + x + "\t|\t" + y + "\t|\t" + !(x && !y) + "\t|");
    }

    public static void xnorTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +!(x ^ y)+ "\t|");
    }

    public static void norTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +!(x || y)+ "\t|");
    }

    public static void nandTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +!(x && y)+ "\t|");
    }

    public static void xorTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +(x ^ y)+ "\t|");
    }

    public static void orTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +(x || y)+ "\t|");
    }

    public static void andTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +(x && y)+ "\t|");
    }

}
