import java.sql.Connection;
import java.sql.PreparedStatement;

public class RecordUsage {

    public static void record(Connection conn, int id, int usedQty) {
        try {
            String query = "UPDATE lab_items SET quantity = quantity - ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, usedQty);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Usage recorded!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
