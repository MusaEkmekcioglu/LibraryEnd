import java.util.ArrayList;

public class DiniKitap extends Kitap{

    public String renk;
    public static ArrayList<Kitap> diniKitapList=new ArrayList();
    DiniKitap(){

    }

    public DiniKitap(String name, String yazari, int fiyati, int numarasi, String renk) {
        super(name, yazari, fiyati, numarasi);
        this.renk = renk;
    }
}
