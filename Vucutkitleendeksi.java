import java.util.Scanner;
public class Vucutkitleendeksi {
    public static void main(String[] args){

        double boy,kilo,endeks;

        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz:");
        boy=inp.nextDouble();

        Scanner inpu=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu(kg cinsinde) giriniz:");
        kilo=inpu.nextDouble();

        endeks=kilo / boy * boy;
        System.out.print("Vücut kitle endeksiniz:"+endeks);
    }

}
