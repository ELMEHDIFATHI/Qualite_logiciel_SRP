public class Employe {
    private String firstName;
    private String lastName;
    private String funtion;
    private int chiffreAffaireRealise;

    public Employe(String firstName, String lastName, String funtion, int chiffreAffaireRealise) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.funtion = funtion;
        this.chiffreAffaireRealise = chiffreAffaireRealise;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFuntion() {
        return funtion;
    }

    public void setFuntion(String funtion) {
        this.funtion = funtion;
    }

    public int getChiffreAffaireRealise() {
        return chiffreAffaireRealise;
    }

    public void setChiffreAffaireRealise(int chiffreAffaireRealise) {
        this.chiffreAffaireRealise = chiffreAffaireRealise;
    }
    public double calculatePay(){
        return 1000+0.03*chiffreAffaireRealise;
    }
    public String Report(){
        return "bon rapport de travailler";
    }
    public void saveInDB(){
        System.out.println("Employe engregistre dans la base de donne");
    }

    public static void main(String[] args) {
        Employe E1= new Employe("mehdi","fathi","DG",120000000);
        System.out.println(E1.calculatePay());
        System.out.println(E1.Report());
        E1.saveInDB();
    }
}
