package Strings;

public class ReplaceAllSpaces {


    static String ModifyString(String s) {
        String ModifiedString = s.replace(" ", "@40");
        return ModifiedString;
    }

    public static void main(String[] args) {
        String str = "Hello my Name is Harsh Sakhuniya";
        String Modified = ModifyString(str);
        System.out.println(Modified);
    }
}
