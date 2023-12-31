package com.activity.activity;

public class PertemuanTiga {
    public static void main(String[] args) {

        // variable
        System.out.println("Variable");
        String name;
        name = "Affan Nabil Ramadhan";

        // kata kunci var
        int age = 22;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // kata kunci final
        System.out.println("\n");
        System.out.println("Final");
        final String name1 = "Affan Nabil Ramadhan";
        int age1 = 22;
        String address1 = "Indonesia";

        // name1 = "diubah"; karena final
        System.out.println(name1);
        System.out.println(age1);
        System.out.println(address1);

        // Tipe data bukan primitif
        System.out.println("\n");
        System.out.println("Array");
        String[] arrayString;
        arrayString = new String[3];

        // Tipe data array
        arrayString[0] = "Farhan";
        arrayString[0] = "Taufiqul";
        arrayString[0] = "Ihsan";

        int[] arrayInt = new int[] {
                        10, 90, 80, 67, 29
        };

        long[] arraylong = {
                        10, 90, 80, 67, 29
        };

        arraylong[0] = 100;

        // Operasi di array
        System.out.println(arraylong[0]);
        System.out.println(arraylong[1]);
        System.out.println(arraylong.length);

        String[][] members = {
                        { "Affan", "Nabil", "Ramadhan" },
                        { "Jojo", "Didin" },
                        { "Iwan", "Fahmi" }
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

        // Operasi Matematika
        System.out.println("\n");
        System.out.println("Operasi Matematika");
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        System.out.println("\n");
        System.out.println("Augmented Assignment");
        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        // Unary Operator
        System.out.println("\n");
        System.out.println("Unary Operator");
        int d = +100;
        int e = -10;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);

}
}
