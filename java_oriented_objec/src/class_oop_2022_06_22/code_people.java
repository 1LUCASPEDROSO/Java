package class_oop_2022_06_22;

public class code_people {
    protected String name,level_mm,level_gc;
    protected String level_1 = "1",level_2 = " 2",level_3 = "3";
    private int Gc_1 = 10,Gc_2 = 15,Gc_3 = 21;

    public code_people(String name, String level_mm, String level_gc) {
        this.name = name;
        this.level_mm = level_mm;
        this.level_gc = level_gc;
    }
    public void caculator_cs_mm (){
    if (level_mm.equals(level_1)){System.out.println("====> your rank in CS is silver one");} 
    else if (level_mm.equals(level_2)){System.out.println("====> your rank in CS is Silver TWO :(");}
    else if (level_mm.equals(level_3)){System.out.println("====> your rank in CS is silver three");}
    } 
    
}// class people 
