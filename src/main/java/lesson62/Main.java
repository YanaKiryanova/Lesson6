package lesson62;

public class Main {
    public static void main(String[] args) {

         Comp comp1 = new Comp(100, "S10");
         comp1.compInfo();
        System.out.println("-----------------------------------");

         Comp comp2 = new Comp(1500, "M540",new RAM("GeIL EVO", "8 ГБ"),
                      new HDD("Hitachi Travelstar", "320 Гб", "Внутренний" ));
         comp2.compInfo();

    }
}
