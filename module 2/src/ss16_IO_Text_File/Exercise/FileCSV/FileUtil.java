package ss16_IO_Text_File.Exercise.FileCSV;

import ss22_Structural_Design_Pattern.Practice.FileWorker.Client;
import ss22_Structural_Design_Pattern.Practice.FileWorker.FileCalculator;
import ss22_Structural_Design_Pattern.Practice.FileWorker.FileCalculatorAdapter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {

    public static final String FILE_NATION = "/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/ss16_IO_Text_File/Exercise/FileCSV/file.txt";
    public static final String FILE_NATION_CSV = FILE_NATION;

    public static  List<Nation> readCSV(){
        List<Nation> nationList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_NATION_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Nation nation;

            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                nation = new Nation(Integer.parseInt(temp[0]), temp[1], temp[2]);
                nationList.add(nation);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nationList;
    }
    public static void writeCSV(Nation nation){
        try {
            FileWriter fileWriter = new FileWriter(FILE_NATION_CSV,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(nation.getId()+ ", " + nation.getCode()+ "," +nation.getName());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <canner> void main(String[] args) {
        canner scanner = (canner) new Scanner(System.in);
        System.out.println("Enter file or folder path: ");
        String path = ((Scanner) scanner).nextLine();
        FileCalculator fileCalculator = new FileCalculatorAdapter();
        Client client = new Client(fileCalculator);
        client.printFileSize(path);
    }


}
