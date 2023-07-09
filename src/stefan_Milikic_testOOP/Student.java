package stefan_Milikic_testOOP;

import java.util.ArrayList;

public class Student {
    private String Ime;
    private ArrayList<Integer>  listaOcena;
    private int trenutnaGodinaStudiranja;

    public Student(String ime, ArrayList<Integer> listaOcena, int trenutnaGodinaStudiranja) {
        Ime = ime;
        this.listaOcena = listaOcena;
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }
    public Student() {
        Ime = "";
        this.listaOcena = new ArrayList<>();
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public int getTrenutnaGodinaStudiranja() {
        return trenutnaGodinaStudiranja;
    }

    public void setTrenutnaGodinaStudiranja(int trenutnaGodinaStudiranja) {
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }
    public double prosek(){
        double suma = 0;
        for (int i = 0; i < listaOcena.size() ; i++) {
            suma += listaOcena.get(i);
        } return suma / listaOcena.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append(" studira ").append(getTrenutnaGodinaStudiranja());
        sb.append("I, ima sledece ocene: ").append("\n");
        for (int i = 0; i < listaOcena.size(); i++) {
            sb.append(listaOcena.get(i));
            if (i != listaOcena.size()-1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
