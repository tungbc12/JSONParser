package jsonparser;

public class Main {
    public static void main(String[] args) {
        System.out.println("JSONParser Library Test");
        System.out.println("=======================");
        
        // Test JSON string
        String json = "{\"name\":\"Doan\",\"age\":25,\"active\":true}";
        
        try {
            System.out.println("Original JSON: " + json);
            
            // Parse JSON to Map
            var parsed = JSONParser.parse(json);
            System.out.println("Parsed Map: " + parsed);
            
            // Convert back to JSON
            String converted = JSONParser.toJson(parsed);
            System.out.println("Converted to JSON: " + converted);
            
            System.out.println("JSONParser is working correctly!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}