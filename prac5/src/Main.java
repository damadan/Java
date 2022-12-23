import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void FirstTask(int n){
        if(n!=1) {
            for(int i=0; i<n; i++){
                System.out.println(n);
            }
            n--;
            FirstTask(n);
        }
        else{
            System.out.println(n);
            return;
        }
    }
    public static void SecondTask(int n) {
        System.out.println(n);
        n--;
        if(n<1)
            return;
        SecondTask(n);
    }
    public static void ThirdTask(int A, int B) {
        if(A<=B) {
            System.out.println(A);
            A++;
            if(A>B)
                System.exit(0);
            ThirdTask(A, B);
        }
        if(A>=B) {
            System.out.println(A);
            A--;
            if(A<B)
                System.exit(0);
            ThirdTask(A, B);
        }
    }
    public static int FourthTask(int k, int s, double first, double last, int t, int ti, int tfirst, int counter) {
        if(k<1 || s<1) {
            System.out.println("Натуральные числа > 1");
            return 0;
        }
        for (int i = (int)first; ;) {
            ti=tfirst;
            t+=ti%10;
            ti/=10;
            if(ti!=0){
                FourthTask(k,s,first,last,t,ti,ti,counter);
            }
            else {
                if(t==s){
                    counter++;
                }
                t=0;
                i++;
                tfirst=(int)first+(i-((int)first));
                first++;
                if(i>(int)last)
                    break;
            }
        }
        System.out.println(counter);
        System.exit(0);
        return 0;
    }
    public static void FifthTask(int n, int t) {
       t+=n%10;
       n= n/10;
       if(n!=0) {
           FifthTask(n,t);
       }
       else {
           System.out.println(t);
           return;
       }
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int choice, n;
        System.out.println("Выберите задание:");
        choice = sc1.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Задание 1");
                n = sc1.nextInt();
                if(n<1 || n > 100)
                    System.out.println("Не стоит вводить отрицательные или слишком большие числа");
                FirstTask(n);
                break;
            case 2:
                n = sc1.nextInt();
                System.out.println("Второе задание");
                SecondTask(n);
            case 3:
                System.out.println("Третье задание");
                int A = sc2.nextInt(), B = sc1.nextInt();
                ThirdTask(A, B);
            case 4:
                System.out.println("Четвёртое задание");
                int k = sc1.nextInt(), s = sc2.nextInt(), t=0,ti=0,counter=0;
                double first = Math.pow(10, k-1), last = Math.pow(10,k)-1;
                int tfirst=(int)first;
                FourthTask(k,s,first,last,t,ti,tfirst,counter);
            case 5:
                System.out.println("Пятое задание");
                n = sc1.nextInt();
                t=0;
                FifthTask(n,t);
        }
    }
}