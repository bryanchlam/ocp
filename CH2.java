public class CH2 {
    public CH2() {
        number = 5;
    }
    public static void main(String[] args) {
        CH2 ch2 = new CH2();
        System.out.println(ch2.number);
    }
    private int number = 3;
    { number = 4;}
}