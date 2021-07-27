package Main;

import java.util.Locale;

public class FindCommand {

    public void finder(){
        if(isAt())
            Objects.pointer.swapIndex();
        else if(isMath())
            Objects.math.checkOpperator();
        else if(isLoop())
            Objects.loops.main();
        else if(isOut())
            Objects.output.findOutType();
        else if(isIn())
            Objects.input.main();
    }

    public boolean isAt(){
        if(Main.currentCommand.contains("@")){
            return true;
        }return false;
    }

    public boolean isMath(){
        if(Main.currentCommand.contains("+") || Main.currentCommand.contains("-")){
            return true;
        }return false;
    }

    public boolean isLoop(){
        if(Main.currentCommand.contains("[")){
            return true;
        }return false;
    }

    public boolean isOut(){
        if(Main.currentCommand.contains(">")){
            return true;
        }return false;
    }

    public boolean isIn(){
        if(Main.currentCommand.contains("<")){
            return true;
        }return false;
    }


}
