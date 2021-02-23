package com.giridhar.util;

public class CenturyFromYear {

	static int centuryFromYear(int year) {
	  
	    String yearInStr = ""+year;
	    String centuryInStr="";
	    int centuryLength = yearInStr.length();
	     if(centuryLength <3){
	        return 1;
	    }
	    else if(centuryLength == 3){
	         centuryInStr = yearInStr.substring(0, 1);
	    }else if(centuryLength == 4){
	         centuryInStr = yearInStr.substring(0, 2);
	    }else{
	        System.out.println("Not a valid Year");
	    }
	    
	    int centuryInInt = Integer.parseInt(centuryInStr);
	    if(year % centuryInInt == 0){
	        return centuryInInt;
	    }else{
	        return centuryInInt + 1;
	    }

	}


	public static void main(String[] args) {

		System.out.println("century result : " + centuryFromYear(1905));
	}

}
