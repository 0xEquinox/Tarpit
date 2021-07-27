package Commands;

import Main.Main;
import Main.Objects;

public class Loops {

    String[] commands;
    int repNum;


    public void main(){
        split();
        findRepetitionNum();
        //commandLoop();
    }

    public void split(){
        commands = Main.currentCommand.split(",");
        commands[0] = commands[0].substring(1);
        System.out.println(commands[0]);
        commands[commands.length] = commands[commands.length].substring(0, commands[commands.length].length());
        System.out.println(commands[commands.length]);
        System.out.println("Commands Split");
    }

    public void findRepetitionNum(){
        repNum = Integer.parseInt(commands[0].substring(2));
        System.out.println("Looping " + repNum + "Times");
    }

    public void commandLoop(){
        for(;repNum > 0;repNum--){
            for(int i = 1; i < commands.length; i++) {
                Main.currentCommand = commands[i];
                Objects.finder.finder();
            }
        }
    }

}
