import javafx.scene.control.ListView;

public abstract class Computer {

    final ListView<String> makeComputer() {
        ListView<String> Computer = new ListView<String>();
        if(customerWantsGPU()) {
            Computer.getItems().add(addGPU());
        }

        if(customerWantsCPU()) {
            Computer.getItems().add(addCPU());
        }

        if(customerWantsMotherBoard()) {
            Computer.getItems().add(addMotherBoard());
        }

        if(customerWantsPSU()) {
            Computer.getItems().add(addPSU());
        }

        if(customerWantsSoundCard()) {
            Computer.getItems().add(addSoundCard());
        }

        if(customerWantsOpticalDrive()) {
            Computer.getItems().add(addOpticalDrive());
        }

        return Computer;
    }

    abstract String addGPU();
    abstract String  addCPU();
    abstract String addMotherBoard();
    abstract String addPSU();
    abstract String addSoundCard();
    abstract String addOpticalDrive();

    boolean customerWantsGPU() {return true;}
    boolean customerWantsCPU() {return true;}
    boolean customerWantsMotherBoard() {return true;}
    boolean customerWantsPSU() {return true;}
    boolean customerWantsSoundCard() {return true;}
    boolean customerWantsOpticalDrive() {return true;}

}
