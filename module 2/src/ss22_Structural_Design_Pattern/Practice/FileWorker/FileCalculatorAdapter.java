package ss22_Structural_Design_Pattern.Practice.FileWorker;

import ss16_IO_Text_File.Exercise.FileCSV.FileUtil;

import java.io.File;


public class FileCalculatorAdapter implements FileCalculator{
    @Override
    public long calculateSize(String path) {
        return 0;
    }

//    @Override
//    public long calculateSize(String path) {
//        FileUtil fileUtil = new FileUtil();
//        File file = new File(path);
//        return fileUtil.calculateSize(file);
//    }
}