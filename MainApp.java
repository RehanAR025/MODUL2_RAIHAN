public class MainApp {
    public static void main(String[] args){

        System.out.println("\nClass TransportasiAir");
        
        TransportasiAir transAir = new TransportasiAir(6, 20000);
        transAir.informasi();
        transAir.berlayar();
        transAir.berlabuh();

        System.out.println("\nClass Sampan");

        Sampan sampan = new Sampan(25, 54000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(1);

        System.out.println("\nClass Kapal");

        Kapal kapal = new Kapal(120, 225000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(45);
        kapal.berlabuh();
    }
}