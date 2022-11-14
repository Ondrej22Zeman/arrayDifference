import java.util.ArrayList;

public class Difference {
    public void difference(int[][] arrays) {

        ArrayList<Integer> differentNumbers = new ArrayList<Integer>();
        ArrayList<Integer> multipleNumbers = new ArrayList<Integer>();

        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                if (differentNumbers.contains(array[i])){
                    differentNumbers.remove(differentNumbers.indexOf(array[i]));
                    multipleNumbers.add(array[i]);
                }else{
                    if (!multipleNumbers.contains(array[i])){
                        differentNumbers.add(array[i]);
                    }
                }
            }
        }
        for (int x :
                differentNumbers) {
            System.out.println(x);
        }
    }
}
