import static org.junit.Assert.assertArrayEquals;

import org.example.BubbleSort;
import org.junit.Test;

public class BubbleSortTest {

    //    测试1：空集的情况
    @Test
    public void testEmptyArray() {
        int[] arr = {};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    //    测试2：只有一个数字的情况
    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{5}, arr);
    }

    //    测试3：原本顺序就为正序的情况
    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    //    测试4：原本顺序为倒序的情况
    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    //    测试5：有相同数字的情况
    @Test
    public void testDuplicateElements() {
        int[] arr = {3, 2, 5, 3, 1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 3, 5}, arr);
    }

    //    测试6：有负数的情况
    @Test
    public void testMixedPositiveNegativeElements() {
        int[] arr = {5, -2, 0, 3, -1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{-2, -1, 0, 3, 5}, arr);
    }

    //    测试7：数字很多的情况
    @Test
    public void testLargeRandomArray() {
        int[] arr = {9, 12, 7, 5, 1, 20, 18, 6, 10, 15};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 5, 6, 7, 9, 10, 12, 15, 18, 20}, arr);
    }

    //    测试8：所有数字都相等的情况
    @Test
    public void testAllEqualElements() {
        int[] arr = {5, 5, 5, 5, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{5, 5, 5, 5, 5}, arr);
    }

    //    测试9：全部数字为负数的情况
    @Test
    public void testNegativeElementsOnly() {
        int[] arr = {-5, -3, -2, -4, -1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, arr);
    }

    //    测试10：所有数字都相同且为0的情况
    @Test
    public void testAllZeroes() {
        int[] arr = {0, 0, 0, 0, 0};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, arr);
    }

    //    测试11：包含int类型的最大数和最小数的情况
    @Test
    public void testMixedLargeArray() {
        int[] arr = {100, 0, -50, 25, 75, -25, Integer.MIN_VALUE, Integer.MAX_VALUE};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{Integer.MIN_VALUE, -50, -25, 0, 25, 75, 100, Integer.MAX_VALUE}, arr);
    }

    //    测试12：一般情况
    @Test
    public void testAlreadyPartiallySortedArray() {
        int[] arr = {1, 3, 2, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
    //    测试13：一般情况
    @Test
    public void testLargeNegativeArray() {
        int[] arr = {-10, -20, -5, -15, -30};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{-30, -20, -15, -10, -5}, arr);
    }

    //    测试14：一般情况
    @Test
    public void testAlreadySortedDescending() {
        int[] arr = {5, 4, 3, 2, 1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    //    测试15：一般情况
    @Test
    public void testLargePositiveArray() {
        int[] arr = {100, 50, 75, 200, 150};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{50, 75, 100, 150, 200}, arr);
    }
}
