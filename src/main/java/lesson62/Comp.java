package lesson62;

public class Comp {
    Integer price;
    String model;
    RAM ram;
    HDD hdd;

    public Comp(){}
    public Comp(int price, String model){
        HDD hdd = new HDD();
        RAM ram = new RAM();
        this.price = price;
        this.model = model;
    }
    public Comp(int price, String model, RAM RAM, HDD HDD){
        this.price = price;
        this.model = model;
        this.ram = RAM;
        this.hdd = HDD;
    }
    public void compInfo(){
        String res =  null;
        if (ram == null && hdd == null){
            res = "Иформация о компьютере:\n" + " Модель "+ this.model + "\n Цена " + this.price +
                    "\n" + "Оперативная память : Информация отсутствует"  + "\n" + "Жесткий диск: Информация отсутствует";
        }else {
            res = "Иформация о компьютере:\n" + " Модель "+ this.model + "\n Цена " + this.price +
                    "\n" + "Оперативная память : " + ram.ramInfo() + "\n" + "Жесткий диск: " + hdd.hddInfo();
        }
        System.out.println(res);
    }




}
