package BehavioralDesignPatterns.TemplateMethodPattern;

abstract public class FileReaderTemplate {

    void openFile(int lines)
    {
        parseFile();
        sendReport();
        sendCountOfLines(lines);
    }

abstract void parseFile();

//there are some similar methods we implement it on the abstract class
void sendReport()
{
    System.out.println("the report is sent");
}

void sendCountOfLines(int lines)
{
    System.out.println("the count of lines is "+ lines);
}
}
