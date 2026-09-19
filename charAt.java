public class charAt {
    public static void print(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " "); // one char print at a times
        }
        System.out.println();

    }

    public static void main(String[] args) {
        String str = "hello my name is the prasad";
        print(str);
    }

}
