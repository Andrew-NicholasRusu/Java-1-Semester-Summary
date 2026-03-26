public class Main {
    public static void main(String[] args) {
        HistoryEngine engine = new HistoryEngine();
        engine.recordAction("Type: Hello");
        engine.recordAction("Format: Bold");
        System.out.println("Recorded 2 initial actions");

        engine.emergencyFix(("Auto-Save: V!"));
        System.out.println("Injected Emergency Fix: Auto-Save: V1");

        String undone = engine.undo();
        System.out.println("Performing Undo... Result: " + undone);

        engine.recordAction("Type: World");
        System.out.println("Recorded new action: Type: World");

        System.out.println("\n--- Final Audit ---"); 
        System.out.println("Final History Count: " + engine.getHistoryCount()); 
    }

}
