import java.util.Scanner;

/**
 * ClassName: DaireAlan
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/2/2023 9:57 AM
 * @Version 1.0
 */
public class DaireAlan {
    public static void main(String[] args) {
        double r,a,p=3.14,d;
        Scanner input = new Scanner(System.in);
        System.out.print("Yari capi Giriniz : ");
        r = input.nextDouble();
        System.out.print("Merkez Aci Olcusu Giriniz : ");
        a = input.nextDouble();
        d = (p * (r*r) * a)/360;
        System.out.print("Daire Dilminin Alani : " + d);
    }
}
