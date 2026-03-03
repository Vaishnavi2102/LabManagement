import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStock {

    public static void update(Connection conn, int id, int newQty) {
        try {
            String query = "UPDATE lab_items SET quantity = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, newQty);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Stock updated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
