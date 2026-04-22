import java.util.HashMap; 

public class HashmapTest_number1 { 

    public static void main(String[] args) { 

        HashMap<String, String> phonebook = new HashMap<>(); 

        // Add data to the hashmap - PUT 
        phonebook.put("Andrew", "123456789"); 
        phonebook.put("Piyush", "674758594"); 
        phonebook.put("Pauline", "123498765"); 
        phonebook.put("Jack", "1357908642"); 
        phonebook.put("Tom", "2468097531"); 

         

        // Accessing values using keys 

        System.out.println(phonebook.get("Jack")); 

        phonebook.put("Tom", "987654321"); 

        System.out.println(phonebook.get("Tom")); 

 

    } 

} 

 

 