package Commands;

import Main.Main;

public class PointerRefrence {

    public void swapIndex(){
        Main.currentPointer = Integer.parseInt(Main.currentCommand.substring(1));
    }

}
