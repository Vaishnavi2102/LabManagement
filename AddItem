import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddItem {

    public static void add(Connection conn, LabItem item) {
        try {
            String query = "INSERT INTO lab_items (item_name, quantity, expiry_date) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, item.getItemName());
            ps.setInt(2, item.getQuantity());
            ps.setDate(3, item.getExpiryDate());

            ps.executeUpdate();
            System.out.println("Item added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
