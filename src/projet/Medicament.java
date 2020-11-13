
package projet;


public class Medicament {
    
    
    public int id;
    public String nom;
    public String posologie;
    public String code_cure;

    public Medicament(int id, String nom, String posologie, String code_cure) {
        this.id = id;
        this.nom = nom;
        this.posologie = posologie;
        this.code_cure = code_cure;
    }

    public Medicament() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPosologie() {
        return posologie;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }

    public String getCode_cure() {
        return code_cure;
    }

    public void setCode_cure(String code_cure) {
        this.code_cure = code_cure;
    }

    @Override
    public String toString() {
        return "Medicament{" + "id=" + id + ", nom=" + nom + ", posologie=" + posologie + ", code_cure=" + code_cure + '}';
    }


    
    
}
