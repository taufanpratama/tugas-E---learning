public class ruangan_kelas { 

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
        System.out.println("Ciri - ciri alat belajar dikelas " + " \n");
        System.out.println("meja       : " + meja);
        System.out.println("kursi      : " + kursi);
        System.out.println("whiteboard : " + whiteboard);
        System.out.println("projector  : " + projector);
    }
}

class ciri {
    public static void main(String[] args) {
        ruangan_kelas ST = new ruangan_kelas();
        ST.set("persegi", "berkaki empat", "berwarna putih mengkilat", "berwarna hitam");
        ST.lihat();
    }
} 