package BehavioralDesignPatterns.TemplateMethodPattern;

public class CSV extends FileReaderTemplate implements File{

    @Override
    public void parseTheFile() {
        System.out.println("the file is parsed as csv");
    }

    @Override
    void parseFile() {
        parseTheFile();
    }
}
