package BehavioralDesignPatterns.TemplateMethodPattern;

public class PDF extends FileReaderTemplate implements File{

    @Override
    public void parseTheFile() {
   System.out.println("the file is parsed as pdf");
    }

    @Override
    void parseFile() {
        parseTheFile();
    }
}
