package example1;

public class unique {
	 int uniqueSum(int a, int b, int c) {
		if (a==b && a==c && c==b) {
			return 0;
		}
		else if (b==c) {
			return a;
		}
		else if (c==a) {
			return b;
		}
		
		else if (a==b) {
			return c;
		}
				
		else { 
			return a+b+c;
		}
	}

}



