package ss17_IO_BinaryFile_Serialization.Exercise.ProductManagement.controller;

import ss17_IO_BinaryFile_Serialization.Exercise.ProductManagement.modell.Product;
import ss17_IO_BinaryFile_Serialization.Exercise.ProductManagement.service.ProductService;

import java.util.Scanner;

public class Productcontroller {
    public static void main(String[] args) {displayProductMenu();

    }
    public static void displayProductMenu(){
        ProductService productService = new ProductService();
        boolean check = true;
        while (check){
            System.out.println("---displayProductMenu---");
            System.out.println("1.Add new product");
            System.out.println("2.Display Product");
            System.out.println("3.Search Product");
            System.out.println("4.Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:
                    productService.addnewproduct();
                    break;
                case 2:
                    productService.displayProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }



}
