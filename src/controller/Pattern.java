package controller;

import java.io.PrintWriter;

public class Pattern {
	
	final public static String carNumPattern = "^\\d{2}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\x20]\\d{4}/*$";	
	public static void nullCheck(String txt,String target){
	
		String txt1 = "sample";
		
		if(target == null || target.length() == 0) {
	    	PrintWriter script = response.getWriter();
	    	script.println("<script>alert('"+txt1+"')history.back();</script>");
	    	script.flush();
		
	}
	
	}
}
