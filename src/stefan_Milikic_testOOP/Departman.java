package stefan_Milikic_testOOP;

import java.util.ArrayList;

public abstract class Departman {
    //-(List<Student>) Listu studenata
    private ArrayList<Student> listaStudenata;
    private String nazivDepartmana;

    public Departman(ArrayList<Student> listaStudenata, String nazivDepartmana) {
        this.listaStudenata = listaStudenata;
        this.nazivDepartmana = nazivDepartmana;
    }

    public Departman() {
        this.listaStudenata = new ArrayList<>();
        this.nazivDepartmana = "";
    }


    //Kreirati metode:
    //List<Student> vredni(int prosek) - Metoda koja vraca listu Studenata koji imaju veci prosek od prosledjenog.
    public ArrayList<Student> vredni(double prosek) {
        ArrayList<Student> vredni = new ArrayList<>();
        for (Student s : listaStudenata
        ) {
            if (prosek < s.prosek()) {
                vredni.add(s);
            }
        }
        return vredni;
    }

    public ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public String getNazivDepartmana() {
        return nazivDepartmana;
    }

    public void setNazivDepartmana(String nazivDepartmana) {
        this.nazivDepartmana = nazivDepartmana;
    }

    //double prosekSvih() - Metoda koja vraca prosek svih Studenata sa Departmana.
    public double prosekSvih() {
        double suma = 0;
        for (Student s : listaStudenata
        ) {
            suma += s.prosek();
        }
        return suma / listaStudenata.size();
    }
    //double finansije() - Ova metoda je abstraktna.

    public abstract double finansije();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sledeci studenti studiraju: ").append("\n");
        for (int i = 0; i < listaStudenata.size(); i++) {
            sb.append(listaStudenata.get(i));
            if (i != listaStudenata.size() - 1) {
                sb.append(", ");

            }
        }
        return sb.toString();
    }
}

