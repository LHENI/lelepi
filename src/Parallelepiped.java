/*
* File: Parallelepiped.java
* Author: Laczkó Henrietta
* Copyright: 2023, Laczkó Henrietta
* Group: Szoft I-I-N
* Date: 2023-04-27
* Github: https://github.com/LHENI/lelepi.git
* Licenc: GNU GPL
*/
import java.util.Scanner;

public class Parallelepiped {

    public Parallelepiped() {}
    public void startParallelepiped() {
        this.about();
        double result =  this.inputData();
        priiint(result);
    }
    public void about(){
        System.out.println("Laczkó Henrietta");
        System.out.println("Szoft I/1/N");
        System.out.println("2023-04-27");
    }
    
    private void priiint(double result) {
        System.out.println(result);
    }
    private double inputData() {
        String AsideStr = Input("A oldal: ");
        if (!this.checkInput(AsideStr)) {
            System.out.println("HIBAAA!Csak számot lehet beírni!");
            throw new NumberFormatException("Csaaaak számot lehet írni!!");
        }
        String BsideStr = Input("B oldal: ");
        if (!this.checkInput(BsideStr)) {
            System.out.println("HIBAAA!Csak számot lehet beírni!");
            throw new NumberFormatException("Csaaaak számot lehet írni!!");
        }
        String CsideStr = Input("C oldal: ");
        if (!this.checkInput(CsideStr)) {
            System.out.println("HIBAAA!Csak számot lehet beírni!");
            throw new NumberFormatException("Csaaaak számot lehet írni!!");
        }

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
