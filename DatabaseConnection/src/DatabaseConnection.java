public class DatabaseConnection {

    // Step 1: Create a private static instance of the same class. Initially, it is null.
    private static volatile DatabaseConnection instance = null;

    // Step 2: Private constructor to prevent instantiation from outside.
    private DatabaseConnection() {
        // Private constructor prevents instantiation
    }

    // Step 3: Public static method to provide global access to the instance.
    // Implementing the "double-checked locking" pattern to ensure thread safety.
    public static DatabaseConnection getInstance() {
        if (instance == null) {  // First check (no locking)
            synchronized (DatabaseConnection.class) { // Locking
                if (instance == null) {  // Second check after locking
                    instance = new DatabaseConnection(); // Create the instance
                }
            }
        }
        return instance;
    }

    // Step 4: Method to simulate connecting to the database.
    public void connect() {
        System.out.println("Connected to the database.");
    }

    // Step 5: Method to simulate disconnecting from the database.
    public void disconnect() {
        System.out.println("Disconnected from the database.");
    }
}
