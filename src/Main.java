public class Main {
    public static void main(String[] args) {

        int[] a = {
                1, 2, 3
        };

        int[] b = {
                2, 3, 4
        };

        int[] c = {
                2, 3, 4, 5, 6, 7
        };
        int[] d = {
                6,7,8,9,5
        };



        int[][] allFields = {a, b, c, d};

        Difference diff = new Difference();
        diff.difference(allFields);
    }
}