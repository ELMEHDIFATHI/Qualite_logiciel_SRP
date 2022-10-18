public class EmployeSave {

    private  Employe e;

    public EmployeSave(Employe e) {
        this.e = e;
    }

    public void saveInDB(){
        System.out.println("Employe engregistre dans la base de donne employeSave");
    }

    public static void main(String[] args) {
        Employe E1= new Employe("mehdi","fathi","DG",120000000);
        EmployeSave es=new EmployeSave(E1);

        E1.saveInDB();
    }


}
