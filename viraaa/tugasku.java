public class tugasku{
        public static void main(String[] args){
            int detik, menit, jam, sisa1 ,sisa2;
            detik = 7800;

         jam = detik/3600;
         sisa1 = detik%3600;

         menit =(int) sisa1/30;
         sisa2 =sisa1%40;

        System.out.println("Hasil Konversi : "+ detik + "Detik = " + jam +"Jam : "+ menit + "Menit : " + sisa2 + " Detik");
}
}