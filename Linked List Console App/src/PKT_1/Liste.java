package PKT_1;
import java.util.LinkedList;
public class Liste {

    private LinkedList<Node> kuyrukListesi = new LinkedList<>();

    public void kuyrugaEkle(Node newElement){
        kuyrukListesi.addLast(newElement);
        System.out.println(newElement.ad + "kuyruğa eklendi.");
    }
    public Node kuyruktanSil(){
        if(kuyrukListesi.isEmpty()){
            System.out.println("kuyruk boş. ");
            return null;
        }
        Node silinenEleman = kuyrukListesi.remove();
        System.out.println(silinenEleman.ad + "kuyruktan silindi. ");
        return silinenEleman;

    }
    public void elemanlarıListele(){
        if(kuyrukListesi.isEmpty()){
            System.out.println("kuyruk boş.");
            return;
        }
        System.out.println("kuyruktaki elemanlar...");
        for(Node eleman : kuyrukListesi){
            System.out.println(eleman);
        }
        System.out.println("kuyruktaki eleman sayısı: " + kuyrukListesi.size());
    }
    public boolean elemanAra(String arananAd) {
        for (Node eleman : kuyrukListesi) {
            if (eleman.ad.equals(arananAd)) {
                System.out.println("Eleman bulundu: " + eleman);
                return true;
            }
        }

        System.out.println("Eleman bulunamadı.");
        return false;
    }

}