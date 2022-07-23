import java.util.Objects;
import java.util.Scanner;

public class NoweZadanie {
    public static  void main (String[] args) {
        /**
        * 1.chce aby w programie było pytanie o imię i nazwisko oraz wiek
         * 2. chce zeby po zapytaniu o wiek byla petlna sprawdzajaca czy osoba jest pelnoletnia czy nie
         *
         */
        String[] wygrani = new String[]{"Ania", "Wanda", "Ala", "Zosia", "Tofik"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        String imie = scanner.next();
        System.out.println("podaj nazwisko");
        String nazwisko = scanner.next();
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();
        if (wiek>18) {
            System.out.println("zapraszam do klubu");
            for (String wygrany: wygrani){
                if (Objects.equals(imie, wygrany)){
                    System.out.println("Dostajesz szota");
                }
            }
        }
        if (wiek<=18){
            System.out.println("wypad");
        }
        }
}
