package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for( int[] arr : matrise) {
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String result = "";
		
		for(int[] arr : matrise) {
			for(int val : arr) {
				result+=val+" ";
			}
			result+="\n";
		}
		
		return result;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] newMatrix = new int[matrise.length][matrise[0].length];
		
		for(int i=0; i<matrise.length; i++) {
			for(int j=0; j<matrise[i].length; j++) {
				newMatrix[i][j] = matrise[i][j] * tall;
			}
		}
		
		return newMatrix;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int aLength = a.length;
		int bLength = b.length;
		
		if(aLength == bLength) {
			for(int i=0; i<aLength; i++) {
				if(a[i].length == b[i].length) {
					//arrays inside teh two matrices must have the same length in order to execute the foor loop
					for(int j=0; j<a[i].length; j++) {
						if(a[i][j] != b[i][j]) {
							return false;
						}
					}					
				} else {
					//the arrays inside the two matrices have different lengths
					return false;
				}
			}
			return true;
		} else {
			// the two matrices have different lengths, exiting without having to do the for loop
			return false;
		}

	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] newMatrix = new int[matrise.length][matrise[0].length];
		
		for(int i=0; i<matrise.length; i++) {
			for(int j=0; j<matrise[i].length; j++) {
				newMatrix[i][j] = matrise[j][i];
			}
		}
		
		return newMatrix;		
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] newMatrix = new int[a.length][a[0].length];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				for(int k=0; k<a.length; k++) {					
					newMatrix[i][k] += a[i][j] * b[j][k];
				}
			}
		}
		
		return newMatrix;
	
	}
}
