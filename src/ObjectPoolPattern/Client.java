package ObjectPoolPattern;

public class Client {
    public static void main(String[] args) {
        DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getInstance();
        DBConection dbConection1 = dbConnectionPoolManager.getDBConection();
        DBConection dbConection2 = dbConnectionPoolManager.getDBConection();
        DBConection dbConection3 = dbConnectionPoolManager.getDBConection();
        DBConection dbConection4 = dbConnectionPoolManager.getDBConection();
        DBConection dbConection5 = dbConnectionPoolManager.getDBConection();
        DBConection dbConection6 = dbConnectionPoolManager.getDBConection();
        DBConection dbConection7 = dbConnectionPoolManager.getDBConection();
        DBConection dbConection8 = dbConnectionPoolManager.getDBConection();

    }
}
