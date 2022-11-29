package class_oop_2022_06_22;

public class code_aluno extends code_people {

    public code_aluno(String name, String level_mm, String level_gc) {
        super(name, level_mm, level_gc);
    }

     @Override
   public void caculator_cs_mm (){
    if (level_mm.equals(level_1)){System.out.println("====> your rank in CS is silver one");} 
    else if (level_mm.equals(level_2)){System.out.println("====> your rank in CS is Silver TWO :(");}
    else if (level_mm.equals(level_3)){System.out.println("====> your rank in CS is silver three");}
    } 
         
}
