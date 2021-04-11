import java.util.Scanner;

public abstract class Zam implements Izam {



    @Override
    public void vergi() {
        System.out.println("vergi artisi yok cunku vergi sifir ");

    }

    public  void zamMiktari(){
     System.out.println("zam miktari ne kadar = ");
     Scanner scan =new Scanner(System.in);
     int zamNeKadar=scan.nextInt();
     System.out.println("hangi kitap turune uygulacaksin ");
     System.out.println("1--cocuk\n "+
                        "2--dini\n"+
                        "3--matematik\n");
     int zamGelecekKitap=scan.nextInt();
     if(zamGelecekKitap==1){
         for(int i=0; i<CocukKitap.cocukKitabiListesi.size();i++){
             CocukKitap.cocukKitabiListesi.get(i).fiyati=CocukKitap.cocukKitabiListesi.get(i).fiyati+zamNeKadar;
         }
     }
     if(zamGelecekKitap==2){
         for(int i=0; i<DiniKitap.diniKitapList.size();i++){
             DiniKitap.diniKitapList.get(i).fiyati=DiniKitap.diniKitapList.get(i).fiyati+zamNeKadar;
         }
     }
     if(zamGelecekKitap==3){
         for(int i=0; i<MatematikKitap.matematikKitapList.size();i++){
             MatematikKitap.matematikKitapList.get(i).fiyati=MatematikKitap.matematikKitapList.get(i).fiyati+zamNeKadar;
         }
     }
 }

    public  void indirimMiktari(){
        System.out.println("indirim miktari ne kadar = ");
        Scanner scan =new Scanner(System.in);
        int indirimNeKadar=scan.nextInt();
        System.out.println("hangi kitap turune uygulacaksin ");
        System.out.println("1--cocuk\n "+
                "2--dini\n"+
                "3--matematik\n");
        int indirimGelecekKitap=scan.nextInt();
        if(indirimGelecekKitap==1){
            for(int i=0; i<CocukKitap.cocukKitabiListesi.size();i++){
                CocukKitap.cocukKitabiListesi.get(i).fiyati=CocukKitap.cocukKitabiListesi.get(i).fiyati-indirimNeKadar;
            }
        }
        if(indirimGelecekKitap==2){
            for(int i=0; i<DiniKitap.diniKitapList.size();i++){
                DiniKitap.diniKitapList.get(i).fiyati=DiniKitap.diniKitapList.get(i).fiyati-indirimNeKadar;
            }
        }
        if(indirimGelecekKitap==3){
            for(int i=0; i<MatematikKitap.matematikKitapList.size();i++){
                MatematikKitap.matematikKitapList.get(i).fiyati=MatematikKitap.matematikKitapList.get(i).fiyati-indirimNeKadar;
            }
        }
    }

}
