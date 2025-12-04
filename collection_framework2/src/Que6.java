import java.util.HashMap;
import java.util.Map;

public class Que6 {
    private Map<String, Map<String, String>> usersTable = new HashMap<>();

    // insert row
    public void insert(String id, String name, String age) {
        Map<String, String> row = new HashMap<>();
        row.put("name", name);
        row.put("age", age);
        usersTable.put(id, row);
    }

    // read row
    public Map<String, String> get(String id) {
        return usersTable.get(id);
    }

    // update row
    public void update(String id, String name, String age) {
        Map<String, String> row = usersTable.get(id);
        if (row != null) {
            row.put("name", name);
            row.put("age", age);
        }
    }

    // delete row
    public void delete(String id) {
        usersTable.remove(id);
    }

    // print table
    public void showTable() {
        System.out.println(usersTable);
    }

    public static void main(String[] args) {
        Que6 db = new Que6();

        db.insert("1", "Alice", "20");
        db.insert("2", "Bob", "25");

        System.out.println("Row 1: " + db.get("1"));

        db.update("2", "Bob", "26");

        db.showTable();

        db.delete("1");

        db.showTable();
    }
}
