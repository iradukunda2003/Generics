public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Age", 23);

        Pair<Integer, String> pair2 = Pair.create(2002, "Not Found");

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
    }
}