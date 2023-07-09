package stefan_Milikic_testOOP;

import java.util.ArrayList;

public class Biologija extends Departman{
    @Override
    public double finansije() {
        return getListaStudenata().size() * 3000;
    }

    public Biologija(ArrayList<Student> listaStudenata, String nazivDepartmana) {
        super(listaStudenata, nazivDepartmana);
    }

    public Biologija() {
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Ovaj departman zaradjuje: ").append("\n");
        sb.append(finansije());
        return sb.toString();
    }
}
