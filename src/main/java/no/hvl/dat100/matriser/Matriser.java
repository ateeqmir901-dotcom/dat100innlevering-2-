package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String resultat = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				resultat += matrise[i][j];
				if (j < matrise[i].length - 1) {
					resultat += " ";
				}
			}
			resultat += "\n";
		}
		return resultat;
	}

	// c) 
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d) 
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e) 
	public static int[][] speile(int[][] matrise) {
		int rader = matrise.length;
		int kolonner = matrise[0].length;
		int[][] nyMatrise = new int[kolonner][rader];
		
		for (int i = 0; i < rader; i++) {
			for (int j = 0; j < kolonner; j++) {
				nyMatrise[j][i] = matrise[i][j];
			}
		}
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] nyMatrise = new int[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					nyMatrise[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return nyMatrise;
	}

	//6a 
	public static int[][] speile(int[][] matrise) {

    int[][] resultat = new int[matrise.length][matrise.length];

    // Kopierer matrisen
    for (int i = 0; i < matrise.length; i++) {
        for (int j = 0; j < matrise.length; j++) {
            resultat[i][j] = matrise[i][j];
        }
    }

    // Speiler matrisen
    for (int i = 0; i < resultat.length; i++) {
        for (int j = 0; j < resultat.length / 2; j++) {

            int temp = resultat[i][j];

            resultat[i][j] = resultat[i][resultat.length - 1 - j];

            resultat[i][resultat.length - 1 - j] = temp;
        }
    }

    return resultat;
   }

   //b 

   public static int[][] multipliser(int[][] a, int[][] b) {

    int[][] resultat = new int[a.length][b[0].length];

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b[0].length; j++) {

            for (int k = 0; k < b.length; k++) {
                resultat[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    return resultat;
    }
}



