package lesson62;

public class RAM {
    String name;
    String value;

    public RAM(){}
    public RAM (String name, String value){
        this.name = name;
        this.value = value;
    }
    public String ramInfo (){
        return " \n Модель " + this.name + "\n Обьем " + this.value;
    }

}
