package flyweight;

public class Letter {

    private String value;

    public Letter(String value){
        System.out.println("New letter-object created with value: "+value);
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
