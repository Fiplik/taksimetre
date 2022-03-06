import java.util.Scanner;
public class km {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("KM: ");
        int km= input.nextInt();
        double kmbasi=2.20;
        double total=(km*kmbasi)+10;
        total= (total<20) ? 20 : total;// şunu unutma artık
        System.out.println("**********************************");
        System.out.print("TAKSİMETRE ÜCRETİ: "+total);

    }
}
