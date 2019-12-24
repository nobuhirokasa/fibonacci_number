package Kadai;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private long num1;
    private long num0;
    private long nnum;
    private int numfib;
    private List<Long> list1 = new ArrayList<>();

    Fibonacci() {
    }

    Fibonacci(long num1, long num0, long nnum, int numfib, List<Long> list1) {
        this.num1 = num1;
        this.num0 = num0;
        this.list1 = list1;
    }
    public List<Long> getList1() {
        return list1;
    }
    public void setList1(List<Long> list1) {
        this.list1 = list1;
    }

    public long getNum1() {
        return num1;
    }

    public void setNum1(long num1) {
        this.num1 = num1;
    }

    public long getNum0() {
        return num0;
    }

    public void setNum0(long num0) {
        this.num0 = num0;
    }

    public long getNnum() {
        return nnum;
    }

    public void setNnum(long nnum) {
        this.nnum = nnum;
    }

    public int getNumfib() {
        return numfib;
    }

    public void setNumfib(int numfib) {
        this.numfib = numfib;
    }
    public void result() {

        if (numfib > 0 && numfib <= 70) {
            list1.add(num0);
            if (numfib > 1) {
                list1.add(num1);
            }
            for (int i = 2; i < numfib; i++) {
                nnum = num0 + num1;
                num0 = num1;
                num1 = nnum;
                list1.add(nnum);
            }
        } else {
            System.out.println("1以上70以下の数値で、入力をお願いします。");

        }

    }
}
