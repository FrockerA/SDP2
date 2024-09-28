public class SingletonTest {

    public static void main(String[] args) {

        // Step 1: Get the instance of DatabaseConnection and connect.
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        // Step 2: Attempt to get another instance of DatabaseConnection.
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Step 3: Check if both instances are the same (Singleton behavior).
        if (db1 == db2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different (this shouldn't happen in Singleton).");
        }

        // Step 4: Disconnect from the database.
        db1.disconnect();
    }
}
