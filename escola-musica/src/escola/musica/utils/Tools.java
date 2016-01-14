package escola.musica.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tools {

	public static Date parseData(String data){
		try{
			Date date = new SimpleDateFormat("dd/MM/yyy").parse(data);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			return calendar.getTime();
		}catch(ParseException e){
			throw new IllegalArgumentException(e);
		}
	}
	
	public static Date getDataAtual() {
		return new Date();
	}
	
}
