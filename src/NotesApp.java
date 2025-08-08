import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";
    private static List<String> notes = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loadNotes();

        int choice;
        do {
            System.out.println("\n===== Notes App =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Search Notes");
            System.out.println("4. Edit Note");
            System.out.println("5. Delete Note");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid Input. Please Enter a Number.");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addNote();
                case 2 -> viewNotes();
                case 3 -> searchNotes();
                case 4 -> editNote();
                case 5 -> deleteNote();
                case 6 -> {
                    saveNotes();
                    System.out.println("\n Thanks for visiting! Goodbye.");
                    System.out.println("\n Have a GoodDay!");
                }
                default -> System.out.println("Invalid Choice. Try Again.");
            }
        } while (choice != 6);
    }

    private static void loadNotes() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                notes.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error Loading Notes: " + e.getMessage());
        }
    }

    private static void saveNotes() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String note : notes) {
                bw.write(note);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error Saving Notes: " + e.getMessage());
        }
    }

    private static void addNote() {
        System.out.print("Enter Your Note: ");
        String note = sc.nextLine();
        notes.add(note);
        saveNotes();
        System.out.println("Note Added Successfully.");
    }

    private static void viewNotes() {
        if (notes.isEmpty()) {
            System.out.println("No Notes Available.");
            return;
        }
        System.out.println("\n--- All Notes ---");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + 1) + ". " + notes.get(i));
        }
    }

    private static void searchNotes() {
        System.out.print("Enter Keyword to Search: ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).toLowerCase().contains(keyword)) {
                System.out.println((i + 1) + ". " + notes.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Matching Notes Found.");
        }
    }

    private static void editNote() {
        viewNotes();
        if (notes.isEmpty()) return;
        System.out.print("Enter Note Number to Edit: ");
        int num = sc.nextInt();
        sc.nextLine();
        if (num < 1 || num > notes.size()) {
            System.out.println("Invalid Note Number.");
            return;
        }
        System.out.print("Enter New Note: ");
        String newNote = sc.nextLine();
        notes.set(num - 1, newNote);
        saveNotes();
        System.out.println("Note Updated Successfully.");
    }

    private static void deleteNote() {
        viewNotes();
        if (notes.isEmpty()) return;
        System.out.print("Enter Note Number to Delete: ");
        int num = sc.nextInt();
        sc.nextLine();
        if (num < 1 || num > notes.size()) {
            System.out.println("Invalid Note Number.");
            return;
        }
        notes.remove(num - 1);
        saveNotes();
        System.out.println("Note Deleted Successfully.");
    }
}
