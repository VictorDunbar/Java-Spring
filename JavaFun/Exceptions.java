import java.util.ArrayList;

class ThisException extends Exception{}

public class Exceptions {
	void raiseException() throws ThisException{
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hellow world");
		myList.add(48);
		myList.add("Goodbye World");

		for(int i=0; i < myList.size(); i++){
			try{
				Integer castedValue = (Integer) myList.get(i);
				System.out.println(castedValue);

			}
            catch (ThisException e){
				System.out.println("Error on index #" + i);
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}