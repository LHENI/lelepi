import java.util.Scanner;

public class Parallelepiped {

    public Parallelepiped() {}
    public void startParallelepiped() {
        double result =  this.inputData();
        nyomtat(result);
    }
    private void nyomtat(double result) {
        System.out.println(result);
    }
    private double inputData() {
        String AsideStr = Input("A oldal: ");
        String BsideStr = Input("B oldal: ");
        String CsideStr = Input("C oldal: ");
        
        double Aside = Double.parseDouble(AsideStr);
        double Bside = Double.parseDouble(BsideStr);
        double Cside = Double.parseDouble(CsideStr);
        double result = this.VolumeParallelepiped(Aside, Bside, Cside);
        return result;
    }
    private String Input(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
    public double VolumeParallelepiped(double Aside, double Bside, double Cside) {
        double result = Aside*Bside*Cside;
        return result;
    }
    public boolean checkInput(String input) {
        if(input.matches("[0-9.]+")) {
            return true;
        }else {
            return false;
        }        
    }
    
}
