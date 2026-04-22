public class PolymorphicCatch {
    public static void main(String[] args) {
        try {
            String str = "Andrew";
            int number = Integer.parseInt(str); // throws NumberFormatException     
        } catch (Exception e) {
            // TODO: Handle exception
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Type: " + e.getClass().getName());
        }

        String[] cases = {"123", "abc", null};
        for (String str : cases) {
            try {
                int val = Integer.parseInt(str);
                System.out.println("Parsed Value: " + val);
            } catch (Exception e) {
                System.out.println("Failed on " + str + " : " + e.getMessage());
            }
        }
    }
}
