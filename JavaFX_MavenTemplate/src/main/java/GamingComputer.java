import java.util.Random;

public class GamingComputer extends Computer{
    String[] GPU = {"1050","1080TI","3060","3060TI","1660S","1650","2080"};
    String[] CPU = {"R73700X", "I99900k", "I710700K","R53600X"};
    String[] MotherBoard = {"ASUSB550-F", "ASUSZ390-P"};
    String[] PSU = {"500W","700W"};
    Random random = new Random();
    int rand;

    boolean customerWantsSoundCard() {return false;}
    boolean customerWantsOpticalDrive() {return false;}
    String addGPU() {
        rand = random.nextInt(7);
        return ("GPU:" + GPU[rand]);
    }

    String addCPU() {
        rand = random.nextInt(4);
        return ("CPU:" + CPU[rand]);
    }

    String addMotherBoard() {
        rand = random.nextInt(2);
        return ("MotherBoard:" + MotherBoard[rand]);
    }

    String addPSU() {
        rand = random.nextInt(2);
        return ("PSU:" + PSU[rand]);
    }

    String addSoundCard() {return "";}

    String addOpticalDrive() {return "";}
}
