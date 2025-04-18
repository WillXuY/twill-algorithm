package leetcode.p1100_1199.p1103_distribute_candies_to_people;

public class DistributeCandiesToPeopleLoop
        implements DistributeCandiesToPeople {
    @Override
    public int[] distributeCandies(int candies, int num_people) {
        int[] output = new int[num_people];
        int num = 1;
        int index = 0;
        while (candies > 0) {
            output[index] += Math.min(candies, num);
            index++;
            if (index >= num_people) {
                index = 0;
            }
            candies -= num;
            num++;
        }
        return output;
    }
}
