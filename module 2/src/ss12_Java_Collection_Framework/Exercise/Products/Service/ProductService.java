package ss12_Java_Collection_Framework.Exercise.Products.Service;

import ss12_Java_Collection_Framework.Exercise.Products.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductService implements IProduct {
    ArrayList<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNewProduct() {
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham");
        double prices = Double.parseDouble(scanner.nextLine());

        Product product = new Product( name, prices);
        productList.add(product);
    }

    @Override
    public void editProduct() {
        System.out.println("nhap vao id muon sua");
        int idedit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idedit) {
                System.out.println("nhap ten muon sua");
                String editNameProduct = scanner.nextLine();
                productList.get(i).setName(editNameProduct);
                System.out.println("nhap gia muon sua");
                double editPriceProduct = Double.parseDouble(scanner.nextLine());
                productList.get(i).setPrice(editPriceProduct);
            } else {
                System.out.println("khong co san pham nay");
            }
        }
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    @Override
    public void removeProduct() {
        System.out.println("nhap id san pham muon xoa");
        int idRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idRemove) {
                productList.remove(productList.get(i));
            } else {
                System.out.println("khong co id can xoa");
            }
        }
        for (Product product : productList) {
            System.out.println(product);

        }


    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    @Override
    public void searchProduct() {
        System.out.println("nhap san pham can tim");
        String strProduct = scanner.nextLine();
        boolean check = false;
        ArrayList<Product> arrayList = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            check = false;
            if (productList.get(i).getName().contains(strProduct)) {
                check = true;
                arrayList.add(productList.get(i));
                index = i;
            }
        }
        if (check ) {
            for (Product product : arrayList){
                    System.out.println(product);
            }
        }else{
                System.out.println("hong co san pham nay trong danh sach");
        }

    }

    @Override
    public void increase() {
        Collections.sort(productList);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void decrease() {
        Product newProduct = new Product();
        Collections.sort(productList, newProduct);
        for (Product product : productList) {
            System.out.println(product);
        }
    }


}

