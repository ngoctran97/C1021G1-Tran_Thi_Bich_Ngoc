package ss17_IO_BinaryFile_Serialization.Exercise.ProductManagement.service;

import ss17_IO_BinaryFile_Serialization.Exercise.ProductManagement.modell.Product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProduct {
    static final String Output = "/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/ss17_IO_BinaryFile_Serialization/" +
            "Exercise/ProductManagement/modell/output.txt";
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addnewproduct() {
        System.out.println("input id");
        int msp = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input manufacturer");
        String manufacturer = scanner.nextLine();
        System.out.println("Input price");
        double price = scanner.nextInt();
        System.out.println("Input otherDescriptions");
        String otherDescriptions = scanner.nextLine();
        Product product = new Product(msp, name, manufacturer, price, otherDescriptions);
        productList.add(product);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Output);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("input id search");
        int intProduct = scanner.nextInt();
        List<Product> list = new ArrayList<>();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == intProduct) {
                System.out.println(productList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("No product");

        }

    }

}
