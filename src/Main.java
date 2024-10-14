class Demo {
    public static void main() {
        float a = 100.25f;
        long b = (long)a;
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
        int c = (int)b;
        System.out.println("value of c: " + c);
        byte d = (byte)c;
        System.out.println("value of d: " + d);
    }
}


public class Main {
    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";

//        System.out.println(yes == no || grade > amount);
//        amount == 40.0 || 50.0
//        hiVal != loVal || loVal < 0
//        true || hello.length() > 0
//        hello.isEmpty() && yes
//        grade <= 100 && !false
//        !yes || no
//        grade > 75 > amount
//        amount <= hiVal && amount >= loVal
//        no && !no || yes && !yes)
        System.out.println(yes == no || grade > amount);  // true
        System.out.println(amount == 40.0 || amount == 50.0);  // true
        System.out.println(hiVal != loVal || loVal < 0);  // true
        System.out.println(true || hello.length() > 0);  // true
        System.out.println(hello.isEmpty() && yes);  // false
        System.out.println(grade <= 100 && !false);  // true
        System.out.println(!yes || no);  // false
        System.out.println(grade > 75 && 75 > amount);  // true
        System.out.println(amount <= hiVal && amount >= loVal);  // true
        System.out.println(no && !no || yes && !yes);

        Demo.main();

        int a = 5;
        System.out.println(a + -a - a++ % 10);
        System.out.println(a - a + --a / 10);
        for (int i = 2; i < 5;) {
            i++;
            a += a;
        }
        System.out.println("a = " + a);

    }

}

