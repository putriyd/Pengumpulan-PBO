public class TerterBangunR {

        public static void main(String[] args) {
            BangunRuang Balok = new BangunRuang();

            Balok.setPanjang(5);
            Balok.setLebar(5);
            Balok.setTinggi(5);

            int p = Balok.getLebar();
            int l = Balok.getPanjang();
            int t = Balok.getTinggi();

            System.out.println("volume balok =" + p*l*t);




        }
    }