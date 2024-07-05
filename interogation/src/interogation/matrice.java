package interogation;

public class matrice {
	public static void remplir_mat(char a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;j++) {
				a[i][j]='*';
			}
		}
	}
	
	public static void afficherMat(char a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+"   ");
			}
			System.out.println("");
		}
	}
}
