import java.util.*;
public class FilterEmails {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("xyz@gmail.com","abc@gmail.com","123gmailcom");
        emails.stream()
        .filter(email->email.contains("@") && email.contains(".com"))
        .forEach(System.out::println);
    }
}