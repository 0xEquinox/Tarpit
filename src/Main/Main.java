package Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {


    public static String[] code;
    public static String currentCommand = "";
    public static HashMap<Integer, Integer> cell = new HashMap<Integer, Integer>();
    public static int currentPointer = 0;

    public static void main(String [] args){
        String path = "src//Main//test.txt";
        try {
            // default StandardCharsets.UTF_8
            String content = Files.readString(Paths.get(path));
            code = content.split("\\|");

            for(int i = 0; i < code.length; i++){
                currentCommand = code[i];
                Objects.finder.finder();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
