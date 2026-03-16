public class IndustrialAreaInfo {

    // Method to print the header
    public static void printHeader() {
        System.out.println("==========================================");
        System.out.println("         Industrial Area - Naini");
        System.out.println("               Prayagraj, UP");
        System.out.println("==========================================");
    }

    // Method to print user info (example)
    public static void printUser(String name, String designation) {
        System.out.println("User Name     : " + name);
        System.out.println("Designation   : " + designation);
        System.out.println("------------------------------------------");
    }

    // Method to print the footer
    public static void printFooter() {
        System.out.println("==========================================");
        System.out.println("      Thank you for visiting our portal");
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
        // Print header
        printHeader();

        // Print some example users
        printUser("Rajesh Kumar", "Manager");
        printUser("Sonia Singh", "Engineer");

        // Print footer
        printFooter();
    }
}