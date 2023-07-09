package stefan_Milikic_testOOP;

import java.util.ArrayList;

public class Informatika extends Departman {
    @Override
    public double finansije() {
        int lista = getListaStudenata().size();
        return (lista / 2) * 5000;
    }

    public Informatika(ArrayList<Student> listaStudenata, String nazivDepartmana) {
        super(listaStudenata, nazivDepartmana);
    }

    public Informatika() {
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Ovaj departman zaradjuje: ").append("\n");
        sb.append(finansije());
        return sb.toString();
    }
}
