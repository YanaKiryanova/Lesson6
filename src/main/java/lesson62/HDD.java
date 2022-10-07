package lesson62;

public class HDD {
    String name;
    String value;
    String type;

    public HDD (){}
    public HDD (String name, String value, String type){
        this.name = name;
        this.value = value;
        this.type = type;
    }
    public String hddInfo (){
        return " \n Модель " + this.name + "\n Обьем " + this.value  + "\n Тип " + type;
    }

}
