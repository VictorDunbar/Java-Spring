public class StringManipulator {
    public String trimAndConcat(String s1, String s2) {
        return s1.replace("", "").concat(s2.replace("", ""));
    }
    public Integer getIndexOrNull(String s, char c) {
        if(s.indexOf(c) != -1) {
            return s.indexOf(c);
        }
        else {
            return null;
        }
    }
    public Integer getIndexOrNull(String s1, String s2) {
        if(s1.indexOf(s2) != -1) {
            return s1.indexOf(s2);
        }
        else {
            return null;
        }
    }
    public String concatSubstring(String s1, int i1, int i2, String s2) {
        if(i1 >= 0 && i2 < s1.length()) {
            return s1.substring(i1, i2).concat(s2);
        }
        else {
            return null;
        }
    }
}