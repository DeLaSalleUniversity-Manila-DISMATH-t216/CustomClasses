package ph.edu.dlsu;

public class BinaryConverter {

    public static String convertSecondBinaryInput(String q) {
        if (q.equals("1"))
            q = "true";

        if (q.equals("0"))
            q = "false";

        return q;
    }

    public static String convertFirstBinaryInput(String p) {
        if (p.equals("0"))
            p = "false";

        if (p.equals("1"))
            p = "true";

        return p;
    }

}
