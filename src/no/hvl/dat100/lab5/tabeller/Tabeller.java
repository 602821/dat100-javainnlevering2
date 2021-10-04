package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int val : tabell) {
			System.out.println(val);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		int length = tabell.length;
		String result = "[";
		
		for(int i = 0; i<length; i++) {
			result+=tabell[i];
			if(i < length-1) result+=",";
		}		
		result+="]";
		
		return result;
	}

	// c)
	public static int summer(int[] tabell) {
		// summer tallene i tabellen med utvidet for-løkke
		int result = 0;

		for(int val : tabell) {
			result+=val;
		}
		
		return result;
	}
	
	public static int summer1(int[] tabell) {
		// summer tallene i tabellen med vanlig for-løkke
		int result = 0;
		int length = tabell.length;
		
		for(int i=0; i<length; i++) {
			result+=tabell[i];
		}
		
		return result;
	}
	
	public static int summer2(int[] tabell) {
		// summer tallene i tabellen med while-løkke
		int result = 0;
		int length = tabell.length;
		
		int index = 0;
		while(index<length) {
			result+=tabell[index];
			index++;
		}
		
		return result;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean result = false;
		
		for(int val : tabell) {
			if(val == tall) result = true;
		}
		
		return result;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int result = -1;
		
		int i = 0;
		boolean found = false;
		while(i<tabell.length && !found) {
			if(tabell[i] == tall) {
				result = i;
				found = true;
			}
			i++;
		}	
		
		return result;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int length = tabell.length;
		int[] reversed = new int[length];
		int j = 0;
		
		for(int i = length-1; i>-1; i--) {
			reversed[j] = tabell[i];
			j++;
		}
		
		return reversed;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int i = 0;
		boolean isSorted = true;
		while(i<tabell.length-1 && isSorted) {
			if(tabell[i] > tabell[i+1]) {
				isSorted = false;
			}
			i++;
		}	
		
		return isSorted;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int newLength = tabell1.length + tabell2.length;
		int[] newArr = new int[newLength];
		
		for(int i = 0; i<newLength; i++) {
			
			if(i<tabell1.length) {
				newArr[i] = tabell1[i];
			} else {
				newArr[i] = tabell2[i-tabell1.length];
			}
			
		}
		
		return newArr;
	}
}
