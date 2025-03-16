import org.w3c.dom.ls.LSOutput;
//Ex13
//Clasa de baza-aplica Incapsularea
abstract class Vehicul {
    private String marca;
    private String model;
    private int an;

    public Vehicul(String marca, String model, int an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    //Metoda abstracta ce va fi suprascrisa(Polimorfism)
    public abstract void pornesteMotorul();
    public void afiseazaDetalii () {
        System.out.println("Marca:" + marca + " Model: " + model + " An: " + an);
    }
}

//Clasa derivata Masina - aplica Mostenirea si Polimorfismul
class Masina extends Vehicul {
    private int numarUsi ;

    public Masina(String marca, String model, int an, int numarUsi) {
        super(marca, model, an);
        this.numarUsi = numarUsi;
    }

    @Override
    public void pornesteMotorul() {
        System.out.println("Masina porneste motorul cu cheia sau buton.");
    }

    public void afiseazaDetalii() {
        super.afiseazaDetalii();
        System.out.println("Numar de usi: " + numarUsi);
    }
}

//Clasa derivata Motocicleta - aplica Mostenirea si Polimorfismul
class Motocicleta extends Vehicul {
    private boolean areSidecar;

    public Motocicleta(String marca, String model, int an, boolean areSidecar) {
        super(marca, model, an);
        this.areSidecar = areSidecar;
    }

    @Override
    public void pornesteMotorul() {
        System.out.println("Motocicleta porneste motorul cu buton sau kickstart.");
    }

    public void afiseazaDetalii() {
        super.afiseazaDetalii();
        System.out.println("Are sidecar: " + (areSidecar ? "Da" : "Nu"));
    }
}

//Clasa principala
public class GestoonareVehicole {
    public static void main(String[] args) {

    }

    //Polimorfism: putem trata Masina si Motocicleta ca Vehicul
    Vehicul masina = new Masina("Toyota", "Corola", 2022, 4);
    Vehicul motocicleta = new Motocicleta("Honda", "CBS500X", 2023, false);

    //Apelam metodele suprascrise
    //masina.pornesteMotorul();
    //masina.afiseazaDetalii();

    //System.out.println();

    //motocicleta.pornesteMotorul();
    //motocicleta.afiseazaDetalii();

}
