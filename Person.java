import java.util.Date;

public class Person<fsd>{
    private String name;
    private Date birthDate;
    private fsd max;

    public Person(String name, Date age){ // Помнит только имя и возраст
        this.name =  name;
        this.birthDate =  age;
    }

    public String getName(){
        return name;
    }
    public Date getBirthDate(){
        return birthDate;
    }



}
