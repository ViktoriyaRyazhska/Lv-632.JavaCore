import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Task03 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void execute3() {
		try {
			System.out.println("Enter dollar rate: ");
			double rate = Double.parseDouble(br.readLine());
			System.out.println("How much hryvnia do you have?");
			double uan = Double.parseDouble(br.readLine());
			double dollars=uan/rate;
			DecimalFormat formatUkr = new DecimalFormat("###,###,###.00 UAN");
			NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);
			String dollarsFormat = formatUS.format(dollars);
			String grnFormat= formatUkr.format(uan);
			System.out.printf("For %s you can buy %s\n",grnFormat,dollarsFormat);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
	}

}
