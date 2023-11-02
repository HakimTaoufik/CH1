package CH1;
public class Newton {
    public static void main(String[] args) {
        double a = 2.0, x, xold, eps;

        x = a;
        eps = 1e-100;
        do {
            // copie de l'ancienne valeur
            xold = x;

            // calcul de la nouvelle valeur (méthode de Newton)
            x = (xold + a/xold) / 2;
            System.out.println(x);
        } while (Math.abs(x - xold) > eps);
        System.out.println("Sqrt(a) = ");
        System.out.println(x);
        return;
    }
}