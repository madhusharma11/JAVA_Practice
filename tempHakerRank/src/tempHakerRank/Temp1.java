package tempHakerRank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class Temp1 {

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		System.out.println("size:" + arr.size());
		for (int k : arr) {
			if (k > 0) {
				cnt1++;
			} else if (k < 0)
				cnt2++;
			else
				cnt3++;
		}
		
		DecimalFormat df=new DecimalFormat("#.######");
		String a=df.format(Double.valueOf(cnt1));
		String b=df.format((double)cnt2);
		String c=df.format((double)cnt3);
		String d=df.format(12345.0);
		System.out.println(a );
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
//		System.out.println("\n"+cnt1/6);

//		System.out.println((double)(cnt1%(arr.size())));
//		System.out.println(cnt2 % (arr.size()));
//		System.out.println(cnt3 % (arr.size()));
	}

//-4 3 -9 0 4 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(-4);
		list.add(3);
		list.add(-9);
		list.add(0);
		list.add(4);
		list.add(1);
		Temp1.plusMinus(list);
	}
}



/*
import java.text.DecimalFormat;

public class PrecisionExample {
    public static void main(String[] args) {
        double number = 123.456789;
        
        // Define the pattern to format the number with 2 decimal places
        DecimalFormat df = new DecimalFormat("#.###");
        
        // Format the number using the defined pattern
        String formattedNumber = df.format(number);
        
        // Print the formatted number
        System.out.println("Formatted number: " + formattedNumber);
    }
}
*/

