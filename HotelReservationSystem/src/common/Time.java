package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {
	
	public static String getCurrentTime(){
		return (new SimpleDateFormat("yyyy/MM/dd")).format(new Date());
	}
	
	public static ResultMessage valFormat(String time){
		DateFormat dd=new SimpleDateFormat("yyyy/MM/dd");
		try {
			dd.parse(time);
		} catch (ParseException e) {
			return ResultMessage.UnkownFormat;
		}
		return ResultMessage.SUCCESS;
	}
	
	private static Date toDate(String time){
		DateFormat dd=new SimpleDateFormat("yyyy/MM/dd");
		Date date=null;
		try {
			date = dd.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static ResultMessage isBtw(String current,String start,String end){
		if(valFormat(current)==ResultMessage.SUCCESS&&valFormat(start)==ResultMessage.SUCCESS&&valFormat(end)==ResultMessage.SUCCESS){
			Calendar now=Calendar.getInstance();
			now.setTime(toDate(current));
			
			Calendar d1=Calendar.getInstance();
			now.setTime(toDate(start));
			
			Calendar d2=Calendar.getInstance();
			now.setTime(toDate(end));
			
			if(now.getTimeInMillis()<=d2.getTimeInMillis()&&now.getTimeInMillis()>=d1.getTimeInMillis())
				return ResultMessage.SUCCESS;
			
			return ResultMessage.FAIL;
		}
		else{
			return ResultMessage.UnkownFormat;
		}
	}
}
