package ss16_IO_Text_File.Exercise.CopyFileText;

import java.io.*;

public class CopyFileText {
    public static final String FileInput = "/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/ss16_IO_Text_File/Exercise/CopyFileText/FileInput";
    public static final String FileOuput = "/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/ss16_IO_Text_File/Exercise/CopyFileText/FileOutput";

    public static void main(String[] args) {
        File file = new File(FileInput);
        File file1 = new File(FileOuput);
        try {
            if (!file.exists() || !file1.exists()) {
                throw new IOException("loi file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter(file1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String code = "";
            while ((code = bufferedReader.readLine()) !=null){
                bufferedWriter.write(code);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}



