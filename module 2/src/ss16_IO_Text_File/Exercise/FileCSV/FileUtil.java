package ss16_IO_Text_File.Exercise.FileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        List<Nation> nationList = readCSV();
        for (Nation nation : nationList){
            System.out.println(nation);
        }
    }
}
