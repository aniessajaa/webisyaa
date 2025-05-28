public class Lagu {
    privte String band;
    privet String judul;
    public void IsiParam (String judul,String band){
        this.judul =judul;
        this.band =band;
        
    }

    public void cetakKelayar(){
        if(judul==null&& band==null)retrun;
    System.out.println("judul:"+judul+"\nbBand:"+pencipta) ;

    }
    {
     public class DemoLagu{
        public static void main (String[]args){
            Lagu song =new Lagu ()
            song.IsiParam("Dance Beside","All American Reject");
            song.cetakKelayar();
        }
     }
    }

}