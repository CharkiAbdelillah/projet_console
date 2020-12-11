
package projet;

public class Patient {
    
   
    
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private int age;
    private String tel;
    private String GS;
    private double poids;
    private double taill;

    public Patient(int id, String nom, String prenom, String adresse, int age, String tel, String GS, int poids, int taill) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age;
        this.tel = tel;
        this.GS = GS;
        this.poids = poids;
        this.taill = taill;
    }

    public Patient() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public double getTaill() {
        return taill;
    }

    public void setTaill(int taill) {
        this.taill = taill;
    }
    
    
    
}
