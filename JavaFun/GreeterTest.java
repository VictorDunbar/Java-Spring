public class GreeterTest {
    public static void main(String[] args){
        Greeter g = new Greeter();

        String greeting = g.greet();
        String greetingWithName = g.greet("Victor");

        if(greeting.equals("Hello World") || greetingWithName.equals("Hello Victor")){
            System.out.println("Test successful");
        } else{
            System.out.println("Test fail");
        }
    }
}