package Singleton;

public class TestSingleton {

    public TestSingleton(){

        DBConnection dbConnection = DBConnection.getInstance();
    }
}
