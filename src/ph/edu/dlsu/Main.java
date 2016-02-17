package ph.edu.dlsu;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int intOption = 0;

        while(intOption!=8) {

            String p = InputHelper.getInput("Input a boolean value for X : ");
            String q = InputHelper.getInput("Input a boolean value for Y : ");

            p = BinaryConverter.convertFirstBinaryInput(p);
            q = BinaryConverter.convertSecondBinaryInput(q);

            boolean X = Boolean.parseBoolean(p);
            boolean Y = Boolean.parseBoolean(q);

            String strOption = InputLogic.getOption();

            intOption = Integer.parseInt(strOption);

            SwicthLogic.switchOption(intOption, X, Y);

        }
    }
}