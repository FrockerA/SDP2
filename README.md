# SDP2
Explanation:
1) The constructor is private to ensure that no other class can instantiate the DatabaseConnection directly.
2) Ensures that the singleton instance is created only when needed (lazy initialization) and the synchronization block is only entered when the instance is null, improving performance.
3) Ensures that changes to instance are visible to all threads and prevents unexpected behaviors due to compiler optimizations.
Explanation of Test:
1) This class demonstrates the use of the DatabaseConnection singleton.
2) We use DatabaseConnection.getInstance() twice, but it should return the same instance both times.
3) The equality check (db1 == db2) verifies that both db1 and db2 point to the same instance, confirming the Singleton pattern works.
4) The methods connect() and disconnect() simulate database operations.
