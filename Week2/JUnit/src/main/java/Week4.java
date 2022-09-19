public class Week4 {

    /** Tim gia tri lon nhat cua hai so nguyen. */
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        }  else {
            return b;
        }
    }

    /** Tim gia tri nho nhat cua 1 mang so nguyen. */
    public static int minArray(int[] array) {
        int res = array[0];
        int n = array.length;
        for (int i = 1; i < n; i++) {
            if (array[i] < res) {
                res = array[i];
            }
        }
        return res;
    }

    /** Tinh BMI. */
    public static String calculateBMI(double weight, double height){
        double bmi = weight / (height * height);
        bmi = (double) (Math.round(bmi * 10)) / 10;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi <= 22.9) {
            return  "Bình thường";
        } else if (bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}