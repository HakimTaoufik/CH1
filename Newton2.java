package CH1;
public class Newton2 {
    public static void main(String[] args) {
        double a = 1 / 2.0, x, xold, eps;

        x = a;
        eps = 1e-10;
        do {
            // copie de l'ancienne valeur
            xold = x;

            // calcul de la nouvelle valeur (méthode de Newton)
            x = (xold * (3 - 2 * xold * xold))/2;
            System.out.println(x);
        } while (Math.abs(x - xold) > eps);
        System.out.println("Sqrt(2) = ");
        System.out.println(1/x);
        return;
    }
}