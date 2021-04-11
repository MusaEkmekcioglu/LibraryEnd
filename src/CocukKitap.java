import java.util.ArrayList;
import java.util.Scanner;

public class CocukKitap extends Kitap  {





    public String sayfaSayisi;
    public Boolean uygunMu;
    static ArrayList<Kitap> cocukKitabiListesi=new ArrayList();

    public CocukKitap(){

    }

   public CocukKitap(String name,String yazari,int fiyati,int numarasi,String sayfaSayisi,Boolean uygunMu){
        super(name, yazari, fiyati, numarasi);
        this.sayfaSayisi=sayfaSayisi;
        this.uygunMu=uygunMu;

    }



}
