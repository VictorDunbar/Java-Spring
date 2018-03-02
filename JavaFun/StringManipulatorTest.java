public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    I am    ","     dope    ");
        Integer a = manipulator.getIndexOrNull("Coding", "o");
        
        Integer c = manipulator.getIndexOrNull("Why index", "dex");
        String word = manipulator.concatSubstring("Hello", 1, 2, "World");

        System.out.println(str);
        System.out.println(a);
        
        System.out.println(c);
        System.out.println(word);
    
    }
}