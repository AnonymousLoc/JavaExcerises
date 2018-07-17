package example1;

public class temperature {
	//isItSummer = true
	String temp(int a, boolean b) {
		
		if (b==false && (a>=60 && a<=90)) {
			return "true";
		}
		
		
		else 	if (b==true && (a>=60 && a<=100)) {
			return "true";
		}
		
		else {
			return "false";
		}
		
	}

}
