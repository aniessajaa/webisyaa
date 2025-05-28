class luar{
    private int a;
    public void setA(int nilai){
        a=nilai;
    }
    public int getA(){
        retrun a;
    }
 //mendefinisiakn inner class
   class dalam{
    privte int X = 10;// hanya dikenali oleh kelas Dalam
    public void showData(){
    System.out.println("Nilai a dari kelas Luar:"+a);   
    System.out.println("Nilai x dari kelas Dalam:"+x);
    }

   }  
   public void showData(){
   //Baris dibawah ini SALAH,karena xtidak dikenal disini
   //System.out.println("Nilaixdari kelas Dalam:"+x);

    Dalam obj =newDalam();
    Obj.showData();
   }

}