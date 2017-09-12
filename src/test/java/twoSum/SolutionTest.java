package twoSum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    private void check(int index1, int index2, int[] result){
        for(int index: result){
            if(index==index1){
                index1=-1;
            }else if(index == index2){
                index2=-1;
            }
        }
        Assert.assertEquals(-1, index1);
        Assert.assertEquals(-1, index2);
    }

    @Test
    public void test1(){
        int target = 9;
        int[] nums={2,7,11,15};
        int[] result = solution.twoSum(nums, target);
        Assert.assertNotNull(result);
        check(0, 1, result);
    }

    @Test
    public void test2(){
        int target = 6;
        int[] nums={3,2,4};
        int[] result = solution.twoSum(nums, target);
        Assert.assertNotNull(result);
        check(1,2, result);

    }
}
