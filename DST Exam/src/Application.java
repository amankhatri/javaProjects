import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Application {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String logInTime = "07:00AM";
		String logOutTime = "06:35PM";
		String pattern = "hh:mma";
		double time1 = 0.0;
		double time2 = 0.0;
		double difference = 0.0;
		double usedTime = 0.0;
		int mins = 0;
		int hours = 0;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		    time1 = sdf.parse(logInTime).getTime();
			time2 = sdf.parse(logOutTime).getTime();				
		}
	 catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DecimalFormat df = new DecimalFormat("##.##");
		difference = Double.valueOf(df.format(Math.abs((time2-time1)/3600000)));
		usedTime = difference;
		hours = (int) Math.floor(usedTime);
		if((difference%1)!=0){
			mins = (int)Math.ceil((usedTime - Math.floor(usedTime))*60) ;
		}
	   if(usedTime<12){
		   System.out.println("You still " + (12-usedTime) + "hours left");
	   }
	   else {
		   System.out.println("Please Logout");
	   }
		
	}

}
