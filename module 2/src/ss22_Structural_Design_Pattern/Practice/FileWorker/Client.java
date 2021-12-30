package ss22_Structural_Design_Pattern.Practice.FileWorker;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path){
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: " + size);
    }
}
