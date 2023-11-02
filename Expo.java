public class Expo {
    public static int facto(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        return s;
    }

    public static int plus_petit_facto(double eps) {
        // Recherche du plus petit entier N tel que 1/N*N! <= eps
        int N = 1;
        double n = 0.0;
        do {
            n = 1 / ((double) (N * facto(N)));
            N++;
        } while (n > eps);
        return N;
    }

    public static void main(String[] args) {
        double expN = 1.0, eps = 1e-10;
        int N = plus_petit_facto(eps);
        System.out.println(N);
        for (int i = N; i >= 1; i--) {
            expN = 1 + (1/(double) i) * expN; // Somme des 1/n! optimisée
        }
        System.out.println(expN);
        return;
    }
}