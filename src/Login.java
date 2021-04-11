import java.util.Scanner;

public class Login {

   static String kullaniciAdi1;
    static int parola1;
    static   int sayac=3;
   static   int sayac2=0;

    public static void login(){
        giris();
        loginRunner();
    }

    public static void giris(){
        System.out.println(" KUTUPHANE SERVISINE HOSGELDINIZ SIGN IN ");

        String giris=
                " *******   kullanici girisi yapmaniz lazim    ************\n"
                +  "*************  3 hakkiniz var ************************";
        System.out.println(giris);

    }

    public static  void loginRunner(){


        while (sayac>0){
           try{
               Scanner scan= new Scanner(System.in);
               System.out.println("Kullanici adinizi girin =");
               kullaniciAdi1=scan.nextLine();
               System.out.println("Lutfen 4 haneli parolanizi girin =");
               parola1=scan.nextInt();
        }catch (Exception e){
               System.out.println("************duzgun gir***********");
               break;
           }
        if(kullaniciAdi1.equals("haluk") && parola1==3434 ){
                System.out.println("giris basarili Hosgeldin haluk");
                sayac=-1;
                break;
            }
            else {
                sayac--;
                System.out.println("giris basarisiz  kalan hakkin= "+ sayac);

            }
            if(sayac==0 ){
                System.out.println("hesabiniz kitlendiii");
                System.exit(0);
            }

        }




    }

    public static  void loginRunnerYonetici(){
        System.out.println("*******yonetici sistem girisi***********");

        while (sayac2<3){
            Scanner scan= new Scanner(System.in);
            System.out.println("Kullanici adinizi girin =");
            kullaniciAdi1=scan.nextLine();
            System.out.println("Lutfen 4 haneli parolanizi girin =");
            parola1=scan.nextInt();
            if(kullaniciAdi1.equals("musa") && parola1==1234 ){
                System.out.println("giris basarili Hosgeldin musa");
                sayac2++;
                break;
            }
            else {
                sayac2++;
                System.out.println("giris basarisiz  kalan hakkin= "+ sayac2);

            }
            if(sayac2==0 ){
                System.out.println("hesabiniz kitlendiii");
                System.exit(0);
            }

        }




    }


}
