import static org.junit.Assert.assertEquals;

import org.example.BackPack;
import org.junit.Test;

public class BackPackTest {

    // 测试1：空集的情况
    @Test
    public void testBackpackEmptyArrays() {
        int[] weights = {};
        int[] values = {};
        int capacity = 10;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(0, maxValue);
    }

    // 测试2：只有一个物品且重量小于背包容量，即能装进去的情况
    @Test
    public void testBackpackSingleItemBelowCapacity() {
        int[] weights = {2};
        int[] values = {3};
        int capacity = 3;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(3, maxValue);
    }

    // 测试3：只有一个物品且重量大于背包容量，即装不进去的情况
    @Test
    public void testBackpackSingleItemAboveCapacity() {
        int[] weights = {5};
        int[] values = {10};
        int capacity = 3;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(0, maxValue);
    }

    // 测试4：重量为负数的情况，应该丢出异常
    @Test(expected = IllegalArgumentException.class)
    public void testBackpackNegativeWeights() {
        int[] weights = {-2, -3, -4, -5};
        int[] values = {3, 4, 5, 6};
        int capacity = 7;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
    }

    // 测试5：价值为负数的情况，应该丢出异常
    @Test(expected = IllegalArgumentException.class)
    public void testBackpackNegativeValues() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {-3, -4, -5, -6};
        int capacity = 7;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
    }

    // 测试6：全部物品都能装进去的情况
    @Test
    public void testBackpackAllItemsBelowCapacity() {
        int[] weights = {1, 2, 3};
        int[] values = {5, 10, 15};
        int capacity = 6;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(30, maxValue);
    }

    // 测试7：所有物品都装不进去的情况，价值应为0
    @Test
    public void testBackpackAllItemsAboveCapacity() {
        int[] weights = {4, 5, 6};
        int[] values = {8, 10, 12};
        int capacity = 3;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(0, maxValue);
    }

    // 测试8：背包容量为负数，应该丢出异常
    @Test(expected = IllegalArgumentException.class)
    public void testBackpackMixedItems() {
        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int capacity = -5;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
    }

    // 测试9：背包容量为0，所有物品都装不进去
    @Test
    public void testBackpackEmptyCapacity() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 0;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(0, maxValue);
    }

    // 测试10：两个物品重量一样，但价值不一样的情况
    @Test
    public void testBackpackSingleItemEqualsCapacity() {
        int[] weights = {5, 5};
        int[] values = {10, 15};
        int capacity = 5;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(15, maxValue);
    }

    // 测试11：一般情况
    @Test
    public void testBackpackMultipleItemsEqualsCapacity() {
        int[] weights = {2, 3, 4};
        int[] values = {3, 4, 5};
        int capacity = 7;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(9, maxValue);
    }

    // 测试12：一般情况
    @Test
    public void testBackpackOneItemHighValue() {
        int[] weights = {1, 2, 3, 4};
        int[] values = {10, 1, 2, 3};
        int capacity = 6;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(13, maxValue);
    }

    // 测试13：一般情况
    @Test
    public void testBackpackOneItemHighWeight() {
        int[] weights = {5, 3, 2, 1};
        int[] values = {3, 4, 5, 6};
        int capacity = 6;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(15, maxValue);
    }

    // 测试14：一般情况
    @Test
    public void testBackpackAllItemsHighWeight() {
        int[] weights = {10, 15, 20};
        int[] values = {1, 2, 3};
        int capacity = 30;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(4, maxValue);
    }

    // 测试15：一般情况
    @Test
    public void testBackpackAllItemsHighValue() {
        int[] weights = {1, 2, 3};
        int[] values = {10, 20, 30};
        int capacity = 3;
        BackPack bp = new BackPack();
        int maxValue = bp.backpack(weights, values, capacity);
        assertEquals(30, maxValue);
    }
}
