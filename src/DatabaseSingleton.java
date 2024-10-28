public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private Connection connection;

    private DatabaseSingleton() {
        // Initialize the database connection here
    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            synchronized (DatabaseSingleton.class) {
                if (instance == null) instance = new DatabaseSingleton();
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
