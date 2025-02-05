package ObjectPoolPattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    private List<DBConection> freeConnectionInPool = new ArrayList<>();
    private List<DBConection> connectionsCuurentlyInUse = new ArrayList<>();
    private static final int INITIAL_POOL_SIZE = 3;
    private static final int MAX_POOL_SIZE = 6;
    private static DBConnectionPoolManager dbConnectionPoolManagerInstace = null;

    private DBConnectionPoolManager(){
        for(int i=0;i < INITIAL_POOL_SIZE; i++){
            freeConnectionInPool.add(new DBConection());
        }
    }

    public static DBConnectionPoolManager getInstance(){
        if(dbConnectionPoolManagerInstace == null){
            synchronized (DBConnectionPoolManager.class){
                if (dbConnectionPoolManagerInstace == null) {
                    dbConnectionPoolManagerInstace = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManagerInstace;
    }

    public synchronized DBConection getDBConection(){
        if(freeConnectionInPool.isEmpty() && connectionsCuurentlyInUse.size() < MAX_POOL_SIZE){
            freeConnectionInPool.add(new DBConection());
        } else if (freeConnectionInPool.isEmpty() && connectionsCuurentlyInUse.size() >= MAX_POOL_SIZE) {
            System.out.println("DB connection exceeded the limit");
            return null;
        }
        DBConection dbConection = freeConnectionInPool.remove(freeConnectionInPool.size()-1);
        connectionsCuurentlyInUse.add(dbConection);
        System.out.println("Adding a db conection in the use pool, size: "+connectionsCuurentlyInUse.size());
        return dbConection;
    }

    public synchronized void  releaseDBConnection(DBConection dbConection){
        if(dbConection != null){
            connectionsCuurentlyInUse.remove(dbConection);
            freeConnectionInPool.add(dbConection);
        }
    }
}
