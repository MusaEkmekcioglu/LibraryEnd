public class Main {


    public static void main(String[] args) {
        Kitap kitap1=new Kitap("musa1","hakan",11,1001);
        Kitap kitap2=new Kitap("musa2","hakan",22,1002);
        Kitap kitap3=new Kitap("musa3","hakan",13,1003);
        Kitap.kitapList.add(0,kitap1);
        Kitap.kitapList.add(1,kitap2);
        Kitap.kitapList.add(2,kitap3);


        Login login=new Login();
        Login.login();
        Runner runner=new Runner();
        Runner.uygulama();




    }
}
