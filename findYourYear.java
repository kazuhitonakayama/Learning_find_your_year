import java.util.Scanner;

public class findYourYear{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("調べたい西暦を入力してください");
        int western = scanner.nextInt();
        System.out.println("あなたが入力した西暦年は" + western + "年ですね！それでは計算します。");

        // Convert to Reiwa year
        int reiwa = western - 2018;
        System.out.println("令和年に変換すると、令和" + reiwa + "年です。");

        // Convert to Heisei year
        int heisei = western - 1988;
        System.out.println("平成年に変換すると、平成" + heisei + "年です。");
        int outdatedFromHeisei = heisei - 30;
        if (outdatedFromHeisei > 0) {
        	System.out.println("平成は30年までだったので、平成最後の年から" + outdatedFromHeisei + "年経過しました。");
        }
        
        // Convert to Showa year
        int showa = western - 1925;
        System.out.println("平成年に変換すると、昭和" + showa + "年です。");
        int outdatedFromShowa = showa - 64;
        if (outdatedFromHeisei > 0) {
        	System.out.println("昭和は64年までだったので、昭和最後の年から" + outdatedFromShowa + "年経過しました。");
        }

        scanner.close(); //It will close Scanner and shut the warning.
    }
}