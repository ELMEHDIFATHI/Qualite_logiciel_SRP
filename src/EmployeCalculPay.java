public class EmployeCalculPay {

    private  Employe e;

    public EmployeCalculPay(Employe e) {
        this.e = e;
    }

    public double calculatePay(){
        return 1000+0.03*e.getChiffreAffaireRealise();
    }


    public static void main(String[] args) {
        Employe E1=new Employe("archid","yassine","dev",12000);
       EmployeCalculPay e1=new EmployeCalculPay(E1);
        System.out.println(E1.getFirstName()+" "+e1.calculatePay());
    }


}
