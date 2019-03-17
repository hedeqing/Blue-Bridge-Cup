package LeastCommonMultiple;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        int max = getMax(a);
        for (int j = max; ; j++) {
            boolean b = true;
            for (int i = 0; i < 3; i++) {
                if (max % a[i] != 0) {
                    b = false;
                }
            }
            max++;
            if (b) {
                System.out.println(j);
                break;
            }

        }


    }


    public static int getMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < 3; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}

//    public static void judge() {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int a[] = new int[n];
//            int max = 0;
//            for (int i = 0; i < n; i++) {
//                a[i] = sc.nextInt();
//                if (max < a[i]) {
//                    max = a[i];   //先找出这n个数的那个最大的数
//                }
//            }
//            for (int i = max; ; i++) {
//                boolean b = true; //设置标记
//                for (int j = 0; j < n; j++) {
//                    if (max % a[j] != 0) {
//                        b = false;
//                        //只要有一个数不能整除max则令标记为false
//                    }
//                }
//                max++;
//                if (b) {  //如果标记为true说明该max可以整除这n个数
//                    //则max为最小公倍数
//                    System.out.println(i);
//                    break;  //跳出循环
//                }
//            }
//        }
//    }

