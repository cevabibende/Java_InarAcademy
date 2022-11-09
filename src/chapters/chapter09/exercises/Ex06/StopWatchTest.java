package chapters.chapter09.exercises.Ex06;


public class StopWatchTest {
    public static void main(String[] args) {

        int[] array = createArray();

        StopWatch st = new StopWatch();
        st.start();
        selectionSort(array);
        st.stop();
        System.out.println("Selection Sort " + st.getElapsedTime() + " millisecond");

    }


    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static int[] createArray() {
        int[] array = new int[100_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 1_000);
        }
        return array;
    }

    public static void ArrayWithRandomNumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}
