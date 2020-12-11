
package projet;

public class MedPatient {
    private int id_p;
    private int id_m;

    public MedPatient(int id_p, int id_m) {
        this.id_p = id_p;
        this.id_m = id_m;
    }

    
    public MedPatient() {
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public int getId_m() {
        return id_m;
    }

    public void setId_m(int id_m) {
        this.id_m = id_m;
    }
    
    
}
