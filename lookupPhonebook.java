import java.util.Scanner;

public class LookupPhonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phonebook phonebook = new Phonebook("Sam Johnson");

        phonebook.addContact(new Contact("Kelly Wong", "(02) 12345678"));
        phonebook.addContact(new Contact("Richard Jackson", "(02) 87654321"));

        phonebook.show();

        System.out.print("\nEnter a contact name: ");
        String searchName = scanner.nextLine();
        Contact found = phonebook.findContactByName(searchName);

        if (found != null) {
            System.out.println("Phone number is " + found.getPhone());
        } else {
            System.out.println(searchName + " not found");
        }
        scanner.close();
    }
}