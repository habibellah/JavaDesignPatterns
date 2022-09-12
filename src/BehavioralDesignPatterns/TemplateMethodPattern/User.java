package BehavioralDesignPatterns.TemplateMethodPattern;
/*
this program is reading different formats of a file(doc ,pdf ,csv) we implement template method
because there are many similar code in these program
 */
public class User {
    public static void main(String[] args) {
        PDF pdf = new PDF();
        pdf.openFile(34);
        CSV csv = new CSV();
        csv.openFile(40);
    }
}
