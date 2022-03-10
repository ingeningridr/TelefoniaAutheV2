package com.example.springboot.telefonia.utils;

public final class DateAssaUtil{


    public DateAssaUtil(){

    }

        /**
     * 
     */
    public static String dftest(String ffin, int daymont) throws Exception {
        String fmt = "yyyy-MM-dd";
        java.text.DateFormat df = new java.text.SimpleDateFormat(fmt);
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(df.parse(ffin));
        cal.add(java.util.Calendar.DAY_OF_MONTH, daymont);              
        return df.format(cal.getTime());
    }
}