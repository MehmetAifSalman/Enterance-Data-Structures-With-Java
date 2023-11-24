package PKT_1;

public class Node {

    String ad,soyad,dogumTarihi,telNo;


    public Node(String ad,String soyad,String dogumTarihi,String telNo){

        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
        this.telNo = telNo;

    }

    @Override
    public String toString() {
        return "Eleman [ad=" + ad + ", soyad=" + soyad + ", dogumTarihi=" + dogumTarihi + ", telNo=" + telNo + "]";
    }

}
