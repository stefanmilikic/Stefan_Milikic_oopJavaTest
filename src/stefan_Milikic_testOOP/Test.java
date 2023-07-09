package stefan_Milikic_testOOP;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


        ArrayList<Integer> mojeOcene = new ArrayList<>();
        mojeOcene.add(7);
        mojeOcene.add(7);
        mojeOcene.add(7);
        mojeOcene.add(7);
        mojeOcene.add(7);
        Student s = new Student("s", mojeOcene ,4 );
        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(s);
        Departman departman = new Biologija();
        departman.getListaStudenata().add(s);
        ArrayList<Departman> listaFak = new ArrayList<>();
        listaFak.add(departman);
        Student b = new Student("b", mojeOcene, 4);
        Student c = new Student("c", mojeOcene, 4);
        Fakultet fakultet = new Fakultet();
        fakultet.dodajStudenta(departman, s);
        fakultet.dodajStudenta(departman, b);
        fakultet.dodajStudenta(departman, c);
        System.out.println(fakultet.najvecaZarada());




    }
}
