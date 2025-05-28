public class Demopewarisan{
    public static void main(String argrs[]){
        PersegiPanjang a=new PersegiPanjang();
        a.setPanjang(5);
        a.setLebar(5);
        System.out.Println("");
        System.out.Println("Superclass PersegiPanjang");
        System.out.Println("Panjang:"+a.getPanjang());
        System.out.Println("Lebar:"+a.getLebar());
        System.out.Println("Luas:"+.Luas());
        System.out.Println("");

        Balok b =new Balok();
        /*kelas balok tinggal memmagil method yang didalam kelas persegi
        */
        b.setPanjang(4);
        b.setLebar(3);
        b.setTinggi(5);
        Systeam.out.println("Subclass Balok");
        Systeam.out.println("Panjang:"+b.getPanjang());
        Systeam.out.println("Lebar:"+b.getLebar());
        Systeam.out.println("Tinggi:"+b.getTinggi());
        Systeam.out.println("Volume:"+b.Volume());
    }

}