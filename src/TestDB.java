public class TestDB {
    public static void main(String[] args) {
        if (DatabaseConnection.getConnection() != null) {
            System.out.println("✔ Connected successfully!");
        } else {
            System.out.println("❌ Connection failed!");
        }
    }
}
