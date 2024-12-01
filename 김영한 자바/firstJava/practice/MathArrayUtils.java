public class MathArrayUtils {
    private MathArrayUtils(){
    }

    public static int sum(int[] array){
        int total=0;
        for (int i : array) {
            total+=i;
        }
        return total;
    }

    public static double average(int[] array){
        return (double)sum(array)/array.length;
    }

    public static int max(int[] array){
        int maxValue = array[0];
        for (int i : array) {
            if(i>maxValue){
                maxValue=i;
            }
        }
        return maxValue;
    }

    public static int min(int[] array){
        int minValue=array[0];
        for (int i : array) {
            if(i<minValue){
                minValue=i;
            }
        }
        return minValue;
    }
}
