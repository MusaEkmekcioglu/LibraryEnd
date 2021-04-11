import java.util.ArrayList;

public class Kitap extends Zam {


    public String name;
    public String yazari;
    public int fiyati;
    public int numarasi;
    public static int sayac=1001;

    static ArrayList<Kitap> kitapList=new ArrayList<>();

    public Kitap(){

    }

    public Kitap(String name,String yazari,int fiyati,int numarasi){
        this.name=name;
        this.yazari=yazari;
        this.fiyati=fiyati;
        this.numarasi=numarasi;
    }


    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", yazari='" + yazari + '\'' +
                ", fiyati=" + fiyati +
                ", numarasi=" + numarasi +
                '}';
    }


    public void zamYap(){
        Zam zam=new Zam() {

        };
        zam.zamMiktari();
    }
    public void indirimYap(){
        Zam zam=new Zam() {

        };
        zam.indirimMiktari();

    }


}
