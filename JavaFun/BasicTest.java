import java.util.ArrayList;
import java.util.Arrays;
public class BasicTest{
	public static void main(String[] args){
		Basic basic = new Basic();
		//boolean basic1 = basic.to255();
		//boolean odds = basic.oddsTo255();
		//boolean sum = basic.sumsTo255();
		Integer[] myarr = new Integer[]{1,99,303,100};
		Integer[] somearr = new Integer[]{88, 77, 999};
		Integer[] lastarr = new Integer[]{1, 5, 10, 7, -2};
		boolean arr =  basic.iterateArray(myarr);
		int findmax = basic.findMax(somearr);
		int getavg = basic.getAverage(myarr);
		ArrayList<Integer> arrsux = basic.oddsArray();
		int greaty = basic.greaterThanY(myarr, 98);
		Integer[] squares = basic.squareArray(myarr);
		Integer[] mma = basic.minMaxAvg(somearr);
		Integer[] shift = basic.shiftValues(lastarr);

		System.out.println(Arrays.toString(squares));
		System.out.println(Arrays.toString(mma));
		//System.out.println(Arrays.toString(shift));
	}
}