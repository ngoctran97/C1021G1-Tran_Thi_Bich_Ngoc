package ss1_IntroductionToJava.Bai_tap;

import java.util.Scanner;

public class Number_To_Letter {
    public String doc1chuso(int so) {
        switch (so) {
            case 0: return "khong";
            case 1: return "mot";
            case 2: return "hai";
            case 3: return "ba";
            case 4: return "bon";
            case 5: return "nam";
            case 6: return "sau";
            case 7: return "bay";
            case 8: return "tam";
            case 9: return "chin";
            default:
                return "";
        }
    }
    public String doc3chuso(int so) {
        if(so < 0 || so > 999) return "khong the doc";
        //tach so
        int dvi = so % 10;
        so = so / 10;
        int chuc = so % 10;
        int tram =  so / 10;
        String ketqua = "";
        if(dvi != 0) {
            ketqua = doc1chuso(dvi);
        } else {
            if( chuc == 0 && tram == 0 ) {
                ketqua = "khong";
            }
        }
        if( chuc != 0 || tram != 0 ) {
            if(chuc == 0) {
                if(dvi != 0) {
                    ketqua = "le " + ketqua;
                }
            }
            else if(chuc == 1) {
                ketqua = "muoi " + ketqua;
            }
            else {
                ketqua = doc1chuso(chuc) + " muoi " + ketqua;
            }

            if(tram != 0) {
                ketqua = doc1chuso(tram) + " tram " + ketqua;
            }
        }
        return ketqua;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int so = scanner.nextInt();
        Number_To_Letter ntl = new Number_To_Letter();
        System.out.println(ntl.doc3chuso(so));
    }


}
