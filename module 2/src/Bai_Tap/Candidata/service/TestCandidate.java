package Bai_Tap.Candidata.service;
import Bai_Tap.Candidata.model.Candidate;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class TestCandidate  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong hocj dinh");
        int n = scanner.nextInt();
        int id, math, literature, english;
        String name, birth;
        Candidate can[] = new Candidate[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap id hoc sinh:");
            id = scanner.nextInt();
            System.out.print("Nhap ten hoc sinh:");
            scanner.nextLine();
            name = scanner.nextLine();
            System.out.print("Nhap ngay sinh hoc sinh:");
            birth = scanner.nextLine();
            System.out.print("Nhap diem toan hoc sinh:");
            math = scanner.nextInt();
            System.out.print("Nhap diem van hoc sinh:");
            literature = scanner.nextInt();
            System.out.print("Nhap diem toan hoc sinh:");
            english = scanner.nextInt();
            can[i] = new Candidate(id, name, birth, math, literature, english);
        }
        for(Candidate c: can) {
            if(c.getsum() > 15) {
                System.out.println(c.toString());
            }
        }



    }

}
