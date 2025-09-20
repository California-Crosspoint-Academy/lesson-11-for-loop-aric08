//aric mar

public class Exercises {
    public static void main (String[] args) {
        //1
        int j = 0;
        for (int g = 0; g < 5; g++)
        j++;
        System.out.println(j); //// missing output answer
        //2
        int s = 1;
        for (int p = 3; p >= 0; p--) {
        s = s + p;
        }
        System.out.println(s); //// missing output answer
        //3
        int o = 6;
        int m = 20, i;
        for (i = 1; i < o; i++); // <- semicolon ends the loop here
        {
        m = m + i * i;
        } 
        System.out.println(m); //// missing output answer
        //4
        //wont say anything cuz it cant find j
        //5
        //cannot find b //// missing output answer
        //6
        double d = 100.01;
        int b = 0;
        for (int iMus = 0; iMus < 10; iMus++)
        b = 19 + iMus;
        d++;
        System.out.println(d);
        //7
        for (int num = 3; num <= 24; num *= 2) {
        System.out.println(num);
        }
        //8
        for (int num = 24; num >= 3; num /= 2) {
        System.out.println(num);
        }
        //9
        int k = 0;
        for (int jj = 0; jj <= 10; jj++) {
        if (jj == 5) {
        break;
        } else {
        k++;
        }
        }
        System.out.println(k);
        //10
        //for (initialization; condition; update) {
    // body}
        //11
        int ii, jjj;
        for (ii = 10; ii <= 100; ii = ii + 10)
        jjj = ii / 2;
        //12
        int r, jjjj;
        for (jjjj = 1; jjjj < 10; jjjj = jjjj * 2)
        r = 2 * jjjj;
        //13
        //for (int i = 0; i >= 0; i++) {  // i always >= 0
    //System.out.println("Oops!");  // will never end
//}
        //14
        for (p = 9; p <= 145; p++) {
    // body
}


        















    }
}
