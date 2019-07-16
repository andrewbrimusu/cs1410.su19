
public class FileDemo {
    public static void main(String[] args) {
        //demoFileClass();
        //demoWritingToFile();
        //demoWritingToFile2();
        demoReadingFromFile();
    }

    public static void demoFileClass() {
        java.io.File file = new java.io.File("testme.txt");

        System.out.printf("Does it exist? %b\n", file.exists());
        System.out.printf("The file has %d bytes\n", file.length());
        System.out.printf("Can it be read? %b\n", file.canRead());
        System.out.printf("Can it be written? %b\n", file.canWrite());
        System.out.printf("Is it a directory? %b\n", file.isDirectory());
        System.out.printf("Is it a file? %b\n", file.isFile());
        System.out.printf("Is it absolute? %b\n", file.isAbsolute());
        System.out.printf("Is it hidden? %b\n", file.isHidden());
        System.out.printf("Absolute path is: %s\n", file.getAbsolutePath());
        System.out.printf("Last modified on: %s\n", new java.util.Date(file.lastModified()));
    }

    public static void demoWritingToFile() {
        java.io.File file = new java.io.File("WriteToMe.txt");
        java.io.PrintWriter output = null;

        try {
             output = new java.io.PrintWriter(file);

             output.println("This is an example of writing to a file with println");
             output.printf("This is the %dnd line of the file, using printf\n", 2);
        }
        catch (java.io.IOException ex){
            System.out.println("An error occurred in creating or writing to the file.");
        }
        finally {
            if (file.exists() && output != null) {
                output.close();
            }
        }
    }

    public static void demoWritingToFile2() {
        java.io.File file = new java.io.File("WriteToMe.txt");

        try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
            output.println("This is an example of writing to a file with println");
            output.printf("This is the %dnd line of the file, using printf\n", 2);
        }
        catch (java.io.IOException ex){
            System.out.println("An error occurred in creating or writing to the file.");
        }
    }

    public static void demoReadingFromFile() {
        java.io.File file = new java.io.File("scores.txt");

        try (java.util.Scanner input = new java.util.Scanner(file)) {
            while (input.hasNext()) {
                String name = input.next();
                int score = input.nextInt();

                System.out.printf("%s earned a score of %d\n", name, score);
            }
        }
        catch (java.io.IOException ex) {
            System.out.println("An error occurred in trying to read the scores.txt file");
        }
    }
}
