package stefan_Milikic_testOOP;

import java.util.ArrayList;

public class Fakultet implements Studije {
    private ArrayList<Departman> listaDepartmana;

    public Fakultet(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    public Fakultet() {
        this.listaDepartmana = new ArrayList<>();
    }

    public ArrayList<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    //void dodajStudenta(Departman d, Student s) - Dodaje odgovarajuceg studenta u listu iz Departmana.
    //-void izbaciStudenta(Departman d, Student s) - Izbacuje studenta iz liste za odredjen Departman
    //-Departman najvecaZarada() - Vraca departman koji donosi najvise para fakultetu -
    // List<Student> sviApsolventi()
    // - Vraca listu studenata koji su cetvrta godina
    @Override
    public void dodajStudenta(Departman d, Student s) {
        listaDepartmana.add(d);
        for (int i = 0; i < listaDepartmana.size(); i++) {
            d.getListaStudenata().add(s);
        }

    }

    @Override
    public void izbaciStudenta(Departman d, Student s) {
        listaDepartmana.remove(d);
        for (int i = listaDepartmana.size() - 1; i >= 0; i--) {
            d.getListaStudenata().remove(s);
        }
    }
//Vraca departman koji donosi najvise para fakultetu
   @Override
  public Departman najvecaZarada() {
        double max = Double.MIN_VALUE;
        double finansije = 0;
        Departman departman = null;
        for (Departman d : listaDepartmana
        ) {
            if (max < d.finansije()) {
                departman = d;
            }
        }
        return departman;
    }

    @Override
    public ArrayList<Student> sviApsolventi() {
        ArrayList<Student> apsolventi = new ArrayList<>();
        for (Departman d : listaDepartmana
        ) {
            for (Student s : d.getListaStudenata()
            ) {
                if (s.getTrenutnaGodinaStudiranja() == 4) {
                    apsolventi.add(s);
                }
            }
        }
        return apsolventi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Na ovom fakultetu imamo sledece departmane: ").append("\n");
        for (int i = 0; i < listaDepartmana.size(); i++) {
            sb.append(listaDepartmana.get(i));
            if (i != listaDepartmana.size()-1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
