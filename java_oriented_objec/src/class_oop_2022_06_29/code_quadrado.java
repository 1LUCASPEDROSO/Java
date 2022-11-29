package class_oop_2022_06_29;
public class code_quadrado implements InterfacegeometricForms  {

private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String getnomeFigura() {
       return "quadrado";
    }

    @Override
    public int getArea() {
        int Area =0;
        Area = side*side;
      return Area;
    }

    @Override
    public int getperimetro() {
         int perimetrin =0;
         perimetrin = side*4;
        return perimetrin;
    }    
}//  END class quadrado
