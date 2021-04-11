import java.util.ArrayList;

public class MatematikKitap extends Kitap {

    public String turu;
    public static ArrayList<Kitap> matematikKitapList=new ArrayList();

    MatematikKitap(){

    }


    public MatematikKitap(String name, String yazari, int fiyati, int numarasi, String turu) {
        super(name, yazari, fiyati, numarasi);
        this.turu = turu;
    }


}
