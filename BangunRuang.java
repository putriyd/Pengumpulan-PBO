public class BangunRuang {
    private int panjang;
    private int lebar;
    private int tinggi;

    public BangunRuang() {
        panjang = 5;
        lebar = 5;
        tinggi = 5;
    } //end constuctor

    public BangunRuang(int p, int l, int t) {
        panjang = 5;
        lebar = 5;
        tinggi = 5;

    } //end constuctor
    public void setLebar(int l) {
        lebar = l;
    }

    public void setPanjang(int p) {
        panjang = p;
    }

    public void setTinggi(int t) {
        tinggi = t;
    }

    public int getLebar() {
        return lebar;
    }
    public int getPanjang() {
        return panjang;
    }
    public int getTinggi() {
        return tinggi;
    }
}