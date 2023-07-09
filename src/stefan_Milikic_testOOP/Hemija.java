package stefan_Milikic_testOOP;

import java.util.ArrayList;

public class Hemija extends Departman {

    @Override
    public double finansije() {
        int lista = getListaStudenata().size();
        return (lista / 2) * 4000;
    }

    public Hemija(ArrayList<Student> listaStudenata, String nazivDepartmana) {
        super(listaStudenata, nazivDepartmana);
    }

    public Hemija() {
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Ovaj departman zaradjuje: ").append("\n");
        sb.append(finansije());
        return sb.toString();
    }
}
