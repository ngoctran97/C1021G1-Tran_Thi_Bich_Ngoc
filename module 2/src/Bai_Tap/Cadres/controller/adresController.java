package Bai_Tap.Cadres.controller;

import Bai_Tap.Cadres.modell.Cadres;
import Bai_Tap.Cadres.service.CadresService;
import Bai_Tap.Cadres.service.ICadres;

import java.sql.SQLOutput;
import java.util.Scanner;

public class adresController {
    public static void main(String[] args) {
        ICadres iCadres = (ICadres) new CadresService();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("1. Add new 1 Cadres");
            System.out.println("2. List all Caderes");
            System.out.println("4. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    iCadres.addNewCadres();
                    break;
                case 2:
                    iCadres.getAll();
                    break;
            }

        }while (true);
    }


}
