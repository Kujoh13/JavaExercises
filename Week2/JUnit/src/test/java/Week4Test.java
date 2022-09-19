import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(7, Week4.max2Int(6, 7));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(10, Week4.max2Int(10, 5));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(2, Week4.max2Int(2, 2));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(69, Week4.max2Int(69, 13));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(420, Week4.max2Int(420, 69));
    }

    @Test
    public void testMinArray1() {
        int[] a = {0, 1, 2, 3};
        assertEquals(0, Week4.minArray(a));
    }

    @Test
    public void testMinArray2() {
        int[] a = {4, 1, 2, 3};
        assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testMinArray3() {
        int[] a = {4, 5, 2, 3};
        assertEquals(2, Week4.minArray(a));
    }

    @Test
    public void testMinArray4() {
        int[] a = {4, 5, 6, 3};
        assertEquals(3, Week4.minArray(a));
    }

    @Test
    public void testMinArray5() {
        int[] a = {4, 5, 6, 7};
        assertEquals(4, Week4.minArray(a));
    }

    @Test
    public void testCalculateBMI1() {
        String res = "Thừa cân";
        assertEquals(res, Week4.calculateBMI(30, 1.1));
    }

    @Test
    public void testCalculateBMI2() {
        String res = "Béo phì";
        assertEquals(res, Week4.calculateBMI(45, 1.2));
    }

    @Test
    public void testCalculateBMI3() {
        String res = "Thừa cân";
        assertEquals(res, Week4.calculateBMI(80, 1.8));
    }

    @Test
    public void testCalculateBMI4() {
        String res = "Bình thường";
        assertEquals(res, Week4.calculateBMI(70, 1.8));
    }

    @Test
    public void testCalculateBMI5() {
        String res = "Thiếu cân";
        assertEquals(res, Week4.calculateBMI(40, 1.6));
    }
} 