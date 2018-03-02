import java.util.ArrayList;
public class Basic {
    //Print 1to255
    boolean To255() {
        for(int i = 0; i < 256; i++) {
            System.out.println(i);
        }
        return true;
    }

    //Print odd numbers to 255
    boolean oddsTo255() {
        for(int i = 0; i < 256; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
        return true;
    }

    //Print sums up to 255
    boolean sumsTo255() {
        int sum = 0;
        for(int i = 0; i < 256; i++) {
            sum = sum + i;
            String msg = String.format("New number: %d sum: %d", i, sum);
            System.out.println(msg);
        }
        return true;
    }

    //Iterate through an array
    boolean iterateArray(Integer[] x) {
        for(int i = 0; i < x.length; i ++) {
            System.out.println(x[i]);
        }
        return true;
    }

    //Find the Max value
    int findMax(Integer[] x) {
        int max = x[0];
        for(int i = 0; i < x.length; i ++) {
            if(x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
    //Get average
    int getAverage(Integer[] x) {
        int len = x.length;
        int sum = 0;
        for(int i = 0; i < x.length; i ++) {
            sum += x[i];
        }
        return(sum / len);
    }
    //Array with odd numbers
    ArrayList<Integer> oddsArray(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 256; i++){
            if(i % 2 != 0) {
                arr.add(i);
            }
        }
        return arr;
    }
    //Greater than Y
    int greaterThanY(Integer[] x, int y) {
        int count = 0;
        for(int i = 0; i < x.length; i ++) {
            if(x[i] > y){
                count += 1;
            }
        }
        return count;
    }
    //Square The values in an Array
    Integer[] squareArray(Integer[] x) {
        for(int i = 0; i < x.length; i++) {
            x[i] = x[i] * x[i];
        }
        return x;
    }
    //Remove Negatives
    Integer[] removeNegatives(Integer[] x) {
        for(int i = 0; i < x.length; i++) {
            if(x[i] < 0) {
                x[i] = 0;
            }
            
        }
        return x;
        
    }
    //MinMaxAvg
    Integer[] minMaxAvg(Integer[] x){
        int max = x[0];
        int min = x[0];
        int sum = 0;
        for(int i = 0; i < x.length; i++) {
            sum += x[i];
            if(x[i] > max) {
                max = x[i];
            }
            if(x[i] > min) {
                min = x[i];
            }
        }
        Integer[] result = {min, max, (sum / x.length)};
        return result;
    }
    //Shift Values in an Array
    Integer[] shiftValues(Integer[] x) {
        for(int i = 0; i < x.length - 1; i ++) {
            x[i] = x[i+1];
        }
        x[x.length - 1] = 0;
        return x;
    }

    
}