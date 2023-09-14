public class Multiples {
    public static void main(String[] args) {
        int n = 0;
        int i = 1;
        while(i < 1000){
            if (i % 3 == 0 || i % 5 == 0){
                n++;
            }
            i++;
        }
        System.out.println(n);
    }
}
