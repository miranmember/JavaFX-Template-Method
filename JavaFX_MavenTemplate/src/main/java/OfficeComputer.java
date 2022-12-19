import java.util.Random;

public class OfficeComputer extends Computer{
    String[] CPU = {"R73700X", "I99900k", "I710700K","R53600X"};
    String[] MotherBoard = {"ASUSB550-F", "ASUSZ390-P"};
    String[] PSU = {"500W","700W"};
    String[] SoundCard = {"BLASTERZ", "ASUSXONAR","USBSOUNDCARD"};
    String[] OpticalDrive = {"ASUS24X", "ASUSDRW-24F1ST"};
    Random random = new Random();
    int rand;

    boolean customerWantsGPU(){return false;}

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

    String addSoundCard() {
        rand = random.nextInt(3);
        return ("SoundCard:" + SoundCard[rand]);
    }

    String addOpticalDrive() {
        rand = random.nextInt(2);
        return ("OpticalDrive:" + OpticalDrive[rand]);
    }

    String addGPU() {return "";}
}
