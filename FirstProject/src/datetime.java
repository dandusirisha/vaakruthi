import java.util.Calendar;

public class datetime {

	public static void main(String[] args)
	{
		Calendar c1 = Calendar.getInstance();
		System.out.println("Current Date:");
		int dd = c1.get(Calendar.DATE);
		System.out.println(dd);
        int  mm = c1.get(Calendar.MONTH);
        ++mm;
        System.out.println(mm);
		int yy = c1.get(Calendar.YEAR);
		System.out.println(dd+"-"+mm+"-"+yy);
		System.out.println("Current time:");
		int hr = c1.get(Calendar.HOUR);
		
		int min = c1.get(Calendar.MINUTE);
		System.out.println(hr+":"+min+":");
		
		int am_pm=c1.get(Calendar.AM_PM);
		String ampm;
		if(am_pm == 0)
		{
			ampm = "AM";
		}else {
			ampm = "PM";
		}
		System.out.println("Cuurent Time  :"+hr+":"+min+" "+ampm);

		
		
	}
}


