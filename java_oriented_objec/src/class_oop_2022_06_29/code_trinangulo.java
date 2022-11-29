
package class_oop_2022_06_29;


public class code_trinangulo implements InterfacegeometricForms {
    private int base,high,sideA,sideB,sideC;

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public String getnomeFigura() {
        return "triangulo";
    }
    

    @Override
    public int getArea() {
        int area =0;
        area = (base*high)/2;
        return area;
    }

    @Override
    public int getperimetro() {
        int perimetrin =0;
        perimetrin = sideA + sideB + sideC;
        return perimetrin;
    }
    
    
    
}// class tringulo
