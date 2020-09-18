package com.loghelper;

public class StringHelper
{

	public static String trimString(String value)
	{
		return value == null ? "" : value.trim();
	}

	public static boolean isEmpty(String value)
	{
		return value == null || value.trim().equals("");
	}


	public static int convertToInt(String value)
	{
		if (value == null || value.trim().equals(""))
			return 0;

		return Integer.parseInt(value);
	}

	public static double convertToDouble(String value)
	{
		if (value == null || value.trim().equals(""))
			return 0.00;

		return Double.parseDouble(value);
	}

}
