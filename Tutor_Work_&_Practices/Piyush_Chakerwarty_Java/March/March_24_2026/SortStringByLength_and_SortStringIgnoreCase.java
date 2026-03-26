public class SortStringByLength_and_SortStringIgnoreCase {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Svannah", "New York", "Dallas"};
        java.util.Arrays.sort(cities, new MyComparator());

        for (String s : cities) {
            System.out.println(s + " ");
        }

        // Using StringIgnoreCase
        java.util.List<String> cities2 = java.util.Arrays.asList(
            "Atlanta", "Savannah", "New York", "Dallas"
        );
        cities2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        for (String s: cities2) {
            System.out.println(s + " "); // Atlanta dallas new York Savannah
        }
    }

    public static class MyComparator implements java.util.Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }

    // OUTPUT: Dallas Atlanta Savannah New York
}
