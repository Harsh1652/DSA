package Strings;

public class RemoveAllOcurencesOfSubString {


    public String removeOccurrences(String s, String part) {
        return this.subs(s, part);
    }

    private String subs(String s, String part) {
        int index = s.indexOf(part);
        if (index == -1) {
            return s;
        } else {
            String var10001 = s.substring(0, index);
            return this.subs(var10001 + s.substring(index + part.length()), part);
        }
    }

    public static void main(String[] args) {
        RemoveAllOcurencesOfSubString obj = new RemoveAllOcurencesOfSubString();
        String str = "daabcbaabcbc";
        String modified = obj.removeOccurrences(str, "abc");
        System.out.println(modified);
    }
}
