package Commands;

import Main.Main;

public class Math {

    public void checkOpperator(){
        if(Main.currentCommand.charAt(0) == '+')
            Addition();
        else
            Subtraction();
    }

    public void Addition(){
        try {
            Main.cell.put(Main.currentPointer, Main.cell.get(Main.currentPointer) + Integer.parseInt(Main.currentCommand.substring(1)));
        }catch (NullPointerException e){
            Main.cell.put(Main.currentPointer, 0);
            Addition();
        }
    }

    public void Subtraction(){
        try {
            Main.cell.put(Main.currentPointer, Main.cell.get(Main.currentPointer) - Integer.parseInt(Main.currentCommand.substring(1)));
        }catch (NullPointerException e){
            Main.cell.put(Main.currentPointer, 0);
            Subtraction();
        }
    }

}
