package Commands;
import Main.Main;

import java.util.HashMap;

public class Output {

    public void findOutType(){
        if(Main.currentCommand.charAt(0) == '#')
            decimalPrint();
        else if(Main.currentCommand.charAt(0) == '$')
            asciiPrint();
    }

    public void decimalPrint(){
        System.out.println(Main.cell.get(Main.currentPointer));
    }

    public void asciiPrint(){

        HashMap<Integer, String> ASCII = new HashMap<>();
        ASCII.put(32, " ");
        ASCII.put(33, "!");
        ASCII.put(34, "\"");
        ASCII.put(35, "#");
        ASCII.put(36, "$");
        ASCII.put(37, "%");
        ASCII.put(38, "&");
        ASCII.put(39, "'");
        ASCII.put(40, "(");
        ASCII.put(41, ")");
        ASCII.put(42, "*");
        ASCII.put(43, "+");
        ASCII.put(44, ",");
        ASCII.put(45, "-");
        ASCII.put(46, ".");
        ASCII.put(47, "/");
        ASCII.put(48, "0");
        ASCII.put(49, "1");
        ASCII.put(50, "2");
        ASCII.put(51, "3");
        ASCII.put(52, "4");
        ASCII.put(53, "5");
        ASCII.put(54, "6");
        ASCII.put(55, "7");
        ASCII.put(56, "8");
        ASCII.put(57, "9");
        ASCII.put(58, ":");
        ASCII.put(59, ";");
        ASCII.put(60, "<");
        ASCII.put(61, "=");
        ASCII.put(62, ">");
        ASCII.put(63, "?");
        ASCII.put(64, "@");
        ASCII.put(65, "A");
        ASCII.put(66, "B");
        ASCII.put(67, "C");
        ASCII.put(68, "D");
        ASCII.put(69, "E");
        ASCII.put(70, "F");
        ASCII.put(71, "G");
        ASCII.put(72, "H");
        ASCII.put(73, "I");
        ASCII.put(74, "J");
        ASCII.put(75, "K");
        ASCII.put(76, "L");
        ASCII.put(77, "M");
        ASCII.put(78, "N");
        ASCII.put(79, "O");
        ASCII.put(80, "P");
        ASCII.put(81, "Q");
        ASCII.put(82, "R");
        ASCII.put(83, "S");
        ASCII.put(84, "T");
        ASCII.put(85, "U");
        ASCII.put(86, "V");
        ASCII.put(87, "W");
        ASCII.put(88, "X");
        ASCII.put(89, "Y");
        ASCII.put(90, "Z");
        ASCII.put(91, "[");
        ASCII.put(92, "\\");
        ASCII.put(93, "]");
        ASCII.put(94, "^");
        ASCII.put(95, "_");
        ASCII.put(96, "'");
        ASCII.put(97, "a");
        ASCII.put(98, "b");
        ASCII.put(99, "c");
        ASCII.put(100, "d");
        ASCII.put(101, "e");
        ASCII.put(102, "f");
        ASCII.put(103, "g");
        ASCII.put(104, "h");
        ASCII.put(105, "i");
        ASCII.put(106, "j");
        ASCII.put(107, "k");
        ASCII.put(108, "l");
        ASCII.put(109, "m");
        ASCII.put(110, "n");
        ASCII.put(111, "o");
        ASCII.put(112, "p");
        ASCII.put(113, "q");
        ASCII.put(114, "r");
        ASCII.put(115, "s");
        ASCII.put(116, "t");
        ASCII.put(117, "u");
        ASCII.put(118, "v");
        ASCII.put(119, "w");
        ASCII.put(120, "x");
        ASCII.put(121, "y");
        ASCII.put(122, "z");
        ASCII.put(123, "{");
        ASCII.put(124, "|");
        ASCII.put(125, "}");
        ASCII.put(126, "~");

        System.out.print(ASCII.get(Main.cell.get(Main.currentPointer)));
    }

}
