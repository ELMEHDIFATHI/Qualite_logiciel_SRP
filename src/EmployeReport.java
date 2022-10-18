public class EmployeReport {

    private  Employe e;

    public EmployeReport(Employe e) {
        this.e = e;
    }
    public String Report(){
        return "bon rapport de travailler REport Class";
    }

    public static void main(String[] args) {
        Employe E1= new Employe("mehdi","fathi","DG",120000000);
        EmployeReport e=new EmployeReport(E1);

        System.out.println(e.Report());

    }

}
