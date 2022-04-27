package HOMEWORK.creational.task1;

public class Connection {
    private static Connection conn = new Connection();
    private Connection(){}

    public Connection getInstance(){
    return conn;
    }
}
