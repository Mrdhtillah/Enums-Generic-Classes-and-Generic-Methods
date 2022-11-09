
package generic;

public class Generic {

    public static void main(String[] args) {

        All<String> nama = new All<>();
        nama.setPerson("Mardha");
        System.out.println("Nama Saya: " + nama.getPerson());

        All<Integer> umur = new All<>();
        umur.setPerson(18);
        System.out.println("Umur Saya: " + umur.getPerson() + " Tahun");

        All<String> Karakter = new All<>();
        Karakter.setPerson("G");
        System.out.println("Huruf Awalan Nama Saya Adalah: " + Karakter.getPerson());
    }
}
