package com.follett.coms.service.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author amahajan
 *
 */
public class AS400CommonUtil {

	/**
	 * This method is used to convert string to date in "MM-dd-yyyy" format.
	 * 
	 * @param str
	 * @return date
	 */
	public static Date convertStringToDate(String str) {
		DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		Date date = null;
		try {
			date = formatter.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
