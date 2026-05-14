package jsonparser;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("JSONParser Library Test");
        System.out.println("=======================");
        
        String json = "{\"name\":\"Doan\",\"age\":25,\"active\":true}";
        
        try {
            System.out.println("Original JSON: " + json);
            
            var parsed = JSONParser.parse(json);
            System.out.println("Parsed Map: " + parsed);
            
            String converted = JSONParser.toJson(parsed);
            System.out.println("Converted to JSON: " + converted);
            
            System.out.println("JSONParser is working correctly!");
            System.out.println("Application is running. Press Ctrl+C to stop...");
            
            // Infinite loop - keeping the application running indefinitely
            while (true) {
                Thread.sleep(5000);
                System.out.println("Still alive...");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}