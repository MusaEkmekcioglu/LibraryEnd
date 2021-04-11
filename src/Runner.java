import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Runner {

     static int index1=0;
    static int index2=0;
    static int index3=0;

    public void giris(){
        String islemler="=====KITAP PROGRAMI======\n"
                + "1: kitap ekleme\n"
                + "2: numara ile kitap sil\n"
                + "3: numara ile kitap ara\n"
                + "4: tumunu listele\n"
                + "5: cikis\n"
                + "6: Yonetici girisi ";
        System.out.println(islemler);
    }

    public static void uygulama(){
        Runner runner =new Runner();
        Kitap kitap=new Kitap();
        runner.giris();
        Scanner scan=new Scanner(System.in);
        switch (scan.nextInt()){
            case 1:
                kitapTuru();
            case 2:
                kitapSil();
            case 3:
                kitapBul();
            case 4:
               kitapListele();
            case 5:
                System.out.println("gule gule");
                System.exit(0);
            case 6:
                System.out.println("*******yonetici secenekleri********");
                Login.loginRunnerYonetici();
                yoneticiSecenek();





        }



    }

    public static void kitapTuru(){
        String a="=====KITAP turleri======\n"
                + "1:cocuk kitabi\n"
                + "2:dini kitap\n"
                + "3:matematik kitabi\n"
                + "4:GERI DON\n";
        System.out.println(a);
        Kitap kitap1=new Kitap();
        Scanner scan=new Scanner(System.in);
        int result;
        result=scan.nextInt();
        switch (result){
            case 1:
                CocukKitap cocukKitap=new CocukKitap();
                CocukKitap cocukKitap1=new CocukKitap(kitap1.name, kitap1.yazari, kitap1.fiyati, kitap1.numarasi, cocukKitap.sayfaSayisi, cocukKitap.uygunMu);
                Kitap.kitapList.add(((Kitap.sayac+3)-1001),cocukKitap1);
                CocukKitap.cocukKitabiListesi.add(index1,cocukKitap1 );
                index1++;
                Scanner scan1=new Scanner(System.in);
                System.out.println("kitabin adi nedir");
                cocukKitap1.name=scan1.nextLine();
                System.out.println("kitabin yazari =");
                cocukKitap1.yazari=scan1.nextLine();
                System.out.println("kitabin fiyati=");
                cocukKitap1.fiyati=scan1.nextInt();
                scan1.nextLine();
                System.out.println("kitabin sayfa sayisi");
                cocukKitap1.sayfaSayisi=scan1.nextLine();
                System.out.println("cocuklara ugun kontrolu var mi e/h ");
                if(scan1.nextLine().equals("e")){
                    cocukKitap1.uygunMu=true;
                    Kitap.sayac++;
                }else{
                    cocukKitap1.uygunMu=false;
                    System.out.println("buraya eklemeniz uygun degil");
                    return;
                }

                System.out.println("kitabin numrasi " + ((Kitap.sayac)+2) + " olarak atanmistir.");
                cocukKitap1.numarasi=(Kitap.sayac)+2;
                break;


            case 2:
                DiniKitap diniKitap=new DiniKitap();
                DiniKitap diniKitap1=new DiniKitap(kitap1.name, kitap1.yazari, kitap1.fiyati, kitap1.numarasi, diniKitap.renk);
                Kitap.kitapList.add(((Kitap.sayac+3)-1001),diniKitap1);
                DiniKitap.diniKitapList.add(index2,diniKitap1); index2++;
                Scanner scan2=new Scanner(System.in);
                System.out.println("kitabin adi nedir");
                diniKitap1.name=scan2.nextLine();
                System.out.println("kitabin yazari =");
                diniKitap1.yazari=scan2.nextLine();
                System.out.println("kitabin fiyati=");
                diniKitap1.fiyati=scan2.nextInt();
                scan2.nextLine();
                System.out.println("kitabin rengi");
                diniKitap1.renk=scan2.nextLine();
                Kitap.sayac++;
                System.out.println("kitabin numrasi " + ((Kitap.sayac)+2) + " olarak atanmistir.");
                diniKitap1.numarasi=(Kitap.sayac)+2;
                break;


            case 3:
                MatematikKitap matematikKitap=new MatematikKitap();
                MatematikKitap matematikKitap1=new MatematikKitap(kitap1.name, kitap1.yazari, kitap1.fiyati, kitap1.numarasi, matematikKitap.turu);
                Kitap.kitapList.add(((Kitap.sayac+3)-1001),matematikKitap1);
                MatematikKitap.matematikKitapList.add(index3,matematikKitap1); index3++;
                Scanner scan3=new Scanner(System.in);
                System.out.println("kitabin adi nedir");
                matematikKitap1.name=scan3.nextLine();
                System.out.println("kitabin yazari =");
                matematikKitap1.yazari=scan3.nextLine();
                System.out.println("kitabin fiyati=");
                matematikKitap1.fiyati=scan3.nextInt();
                scan3.nextLine();
                System.out.println("kitabin rengi");
                matematikKitap1.turu=scan3.nextLine();
                Kitap.sayac++;
                System.out.println("kitabin numrasi " + ((Kitap.sayac)+2) + " olarak atanmistir.");
                matematikKitap1.numarasi=(Kitap.sayac)+2;
                break;



            case 4:
                break;

        } uygulama();


    }
    public static void kitapSil(){
        System.out.println(" Lutfen ilmek istediginiz kitabin  numarasini girin = ");
        Scanner scan =new Scanner(System.in);
        int result=scan.nextInt();
        System.out.println(Kitap.kitapList.get(result-1001).toString());
        System.out.println("bu kitabi silmek istediginize emin misiniz...e/h");
        scan.nextLine();
        String result2= scan.nextLine();
        if(result2.equals("e")){
            Kitap.kitapList.remove(result-1001);
          //  System.out.println(Kitap.kitapList.get(result-1001).numarasi+ "  kitab silindi");
           // Kitap.sayac--;
        }else{
            return;
        }
      uygulama();
    }
    public static void kitapBul(){
        System.out.println("kitabin numarasini giriniz ");
        Scanner scan3=new Scanner(System.in);
        int result=scan3.nextInt();
        System.out.println("kitap numarasi==  " +Kitap.kitapList.get(result-1001).numarasi);
        System.out.println("kitap ismi==  " +Kitap.kitapList.get(result-1001).name);
        System.out.println("kitap yazari==  " +Kitap.kitapList.get(result-1001).yazari);
        System.out.println("kitap fiyati==  " +Kitap.kitapList.get(result-1001).fiyati);
        uygulama();
    }
    public static void kitapListele(){
        System.out.println("....tum kitaplar....");
        for(int i=0;i<Kitap.kitapList.size();i++){
            System.out.println(Kitap.kitapList.get(i));
        }
           if(CocukKitap.cocukKitabiListesi.size()>0) {
               System.out.println("========cocuk kitaplari===========");
               for(int i=0;i<CocukKitap.cocukKitabiListesi.size();i++){
                   System.out.println(CocukKitap.cocukKitabiListesi.get(i));
               }
           }
           if(DiniKitap.diniKitapList.size()>0){
               System.out.println("========dini kitaplari===========");
               for (int i=0;DiniKitap.diniKitapList.size()>i;i++){
                   System.out.println(DiniKitap.diniKitapList.get(i));
               }
           }
           if(MatematikKitap.matematikKitapList.size()>0){
               System.out.println("========matematik kitaplari===========");
               for(int i=0; MatematikKitap.matematikKitapList.size()>i;i++){
                   System.out.println(MatematikKitap.matematikKitapList.get(i));
               }
           }


        uygulama();
    }
    public static void yoneticiSecenek(){
        String a= " 1= zam yapin \n"
                  + "2= indirim yapin \n"
                  +  "3= geri don ";
        System.out.println(a);
        Kitap kitap=new Kitap();
        Scanner scan =new Scanner(System.in);
        int yresult=scan.nextInt();
        if(yresult==1){
            kitap.zamYap();
            kitap.vergi();
        }
        if(yresult==2){
            kitap.indirimYap();
            kitap.vergi();
        }
        if(yresult==3){
            uygulama();
        }
        uygulama();
    }


}
