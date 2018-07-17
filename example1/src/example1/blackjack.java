package example1;

public class blackjack {
	static int bj(int a, int b) {
		if ((21-a)>(21-b)) {
			return b;
		}
		else if ((21-a)<(21-b)) {
			return a;
		}
		else if (((21-a)<0) && ((21-b)>0)) {
			return b;
		}
		else if (((21-a)>0) && ((21-b)<0)) {
			return a;
		}
		
		else { 
			return 0;
		}
	}

}
