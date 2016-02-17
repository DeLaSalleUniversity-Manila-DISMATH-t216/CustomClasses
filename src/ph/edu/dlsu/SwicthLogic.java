package ph.edu.dlsu;

public class SwicthLogic {

    public static void switchOption(int intOption, boolean x, boolean y) {
        switch(intOption) {
            case 1:
                LogicSolver.andTable(x, y);
                break;
            case 2:
                LogicSolver.orTable(x, y);
                break;
            case 3:
                LogicSolver.xorTable(x, y);
                break;
            case 4:
                LogicSolver.nandTable(x, y);
                break;
            case 5:
                LogicSolver.norTable(x, y);
                break;
            case 6:
                LogicSolver.xnorTable(x, y);
                break;
            case 7:
                LogicSolver.impliTable(x, y);
                break;
            case 8:
                System.out.println("Program Terminated.");
                break;
            default:
                System.out.println("Input cannot be recognized.");
                break;
        }
    }

}
