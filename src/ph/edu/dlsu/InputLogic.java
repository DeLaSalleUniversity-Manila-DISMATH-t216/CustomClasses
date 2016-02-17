package ph.edu.dlsu;

public class InputLogic {

    public static String getOption() {
        System.out.println("LOGIC CALCULATOR MENU:");
        System.out.println("[1] AND");
        System.out.println("[2] OR");
        System.out.println("[3] XOR");
        System.out.println("[4] NAND");
        System.out.println("[5] NOR");
        System.out.println("[6] XNOR");
        System.out.println("[7] IMPLICATION");
        System.out.println("[8] QUIT PROGRAM");

        return InputHelper.getInput("Your choice here [1/2/3/4/5/6/7/8]: ");
    }

}
