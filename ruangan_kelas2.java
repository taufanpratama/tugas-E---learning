public class ruangan_kelas2 { 

String meja;
String kursi;
String whiteboard;
String projector;

public void set(String meja, String kursi, String whiteboard, String projector) {
        this.meja = meja;
        this.kursi = kursi;
        this.whiteboard = whiteboard;
        this.projector = projector;
    }

public void lihat() {
        System.out.println("Fungsi alat belajar di kelas " + " \n");
        System.out.println("meja       : " + meja);
        System.out.println("kursi      : " + kursi);
        System.out.println("whiteboard : " + whiteboard);
        System.out.println("projector  : " + projector);
    }
}

class Fungsi{
    public static void main(String[] args) {
        ruangan_kelas2 ST = new ruangan_kelas2();
        ST.set("tempat menaruh laptop", "tempat duduk", "alat tulis", "alat menampilkan visual dari laptop");
        ST.lihat();
    }
} 