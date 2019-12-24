package Kadai;

import java.util.List;
import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("出力させたいフィボナッチ数は何番目ですか?");
            label: if (sc.hasNextInt()) {
                Fibonacci fibo = new Fibonacci();
                fibo.setNum0(0);
                fibo.setNum1(1);

                int Fnumfib = fibo.getNumfib();
                Fnumfib = sc.nextInt();
                fibo.setNumfib(Fnumfib);

                List<Long> Flist1 = fibo.getList1();

                fibo.result();

                if (Fnumfib >= 1 && Fnumfib <= 70) {
                    System.out.println(Fnumfib + "番目のフィボナッチ数:" + Flist1.get(Fnumfib - 1));

                    System.out.println(Fnumfib + "番目までのフィボナッチ数列" + Flist1);

                    Flist1.clear();
                }
            } else if (sc.hasNext()) {
                String str = sc.next();
                if (str.equals("exit") || str.equals("quit")) {
                    System.out.println("入力を終了しました。");
                    break;
                } else {
                    System.out.println("整数の値か、終了させる場合、「exit」又は「quit」と入力して下さい.");
                    break label;
                }
            } else {
                System.out.println("整数の値か、終了させる場合、「exit」又は「quit」と入力して下さい");
            }

        }

        sc.close();
    }
