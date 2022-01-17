import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Faktoriyel sayisi : ");
        int a=sc.nextInt();
        int total=1;

        for (int i=1;i<=a;i++){
            total=total*i;

        }
        System.out.println(a+ ". Faktoriyel : " +total);
        System.out.println("-----------------------------");


    /* N elemanlı bir kümenin elemanları ile
    oluşturulacak r elemanlı farklı grupların sayısı n’in
    r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu
    C(n,r) şeklinde gösterilir.
    Formul
    C(n,r) = n! / (r! * (n-r)!) */

         Scanner input=new Scanner(System.in);
         int n,r,k;
         int totaln=1;
         int totalr=1;
         int totalk=1;
        System.out.print("n'in degeri : ");
        n=input.nextInt();

        for (int x=1;x<=n;x++){
            totaln=totaln*x;
        }

        System.out.print("r'nin degeri : ");
        r=input.nextInt();

        for (int y=1;y<=r;y++){
            totalr=totalr*y;
        }
        k=n-r;
        for (int z=1;z<=k;z++){
            totalk=totalk*z;
        }
        int result=(totaln/(totalr*totalk));
        System.out.println(n + ". faktoriyel :" +totaln);
        System.out.println(r + ". faktoriyel :" +totalr);
        System.out.println(k + ". faktoriyel :" +totalk);
        System.out.println("Islemin sonucu : " +result);






    }

}
