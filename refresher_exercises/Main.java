package refresher_exercises;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] nums = { 1, 3, 5, 6 };
        int res = searchInsert(nums, 2);
        System.out.println(res);

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static int removeElement(int[] nums, int val) {

        // remove all occurrences of val ints default value is 0;
        // order does not matter
        // return no of elements in nums

        // using enhanced for look
        int elementPosition = 0;
        for (int num : nums) {
            if (num == val) {
                nums[elementPosition] = 0;
                elementPosition++;
                continue;
            }
            elementPosition++;
        }

        return nums.length;

    }

    public static String workingWithString() {
        return "Hello Java";
    }

    public static String longestCommonPrefix(String[] words) {
        if (words == null || words.length == 0)
            return "";

        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {

            while (!words[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> myUniqueNumbers = new HashSet<>();

        for (int num : nums) {
            myUniqueNumbers.add(num);
        }
        int i = 0;
        for (int num : myUniqueNumbers) {
            System.out.println("Nums[i++] : " + nums[i++]);
            nums[i++] = num;
        }

        return myUniqueNumbers.size();
    }

    public static int[] addItemsToMap(int[] numbers, int target) {
        // need the elementPosition Not value
        Map<Integer, Integer> myMap = new HashMap<>();
        int elementPosition = 0;

        for (int num : numbers) {
            int needed = target - num;

            if (myMap.containsKey(needed)) {
                return new int[] { myMap.get(needed), elementPosition };
            }
            myMap.put(num, elementPosition);
            elementPosition++;
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // value -> index
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[] { seen.get(need), i };
            }
            seen.put(nums[i], i);
        }
        // If the problem guarantees a solution, we won't reach here.
        throw new IllegalArgumentException("No two sum solution");
    }

    // public static int[] twoSum(int[] nums, int target) {
    //
    // // indeces
    // // always on solution
    // // for loop to track elementPostion
    // int[] response = new int[2];
    // System.out.println(Arrays.toString(response));
    // boolean possitionField = false;
    //
    // for(int i =0; i < nums.length; i++) {
    // int currentElement = nums[i];
    // int lookingFor = target - currentElement;
    //
    //
    //
    // if(currentElement == lookingFor || currentElement == (target - lookingFor)) {
    // if( response[0] == 0 && !possitionField) {
    // response[0] = i;
    // possitionField =true;
    // }
    // else if( response[1] == 0 || possitionField) {
    // response[1] = i;
    // return response;
    // }
    // }
    // }
    //
    //
    // return response;
    // }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        // 5 6 7
        // 3 6 10
        // assumption: same no of elements and comparing elementPosition to same
        // elementPosition
        List<Integer> ab = new ArrayList<>(Arrays.asList(0, 0));

        // thinking i just need to loop through one of the lists and keep track of the
        // current position
        int elementPosition = 0;

        for (int n : a) {
            if (n > b.get(elementPosition)) {
                ab.set(0, ab.get(0) + 1);
                elementPosition++;
            }

            else if (n < b.get(elementPosition)) {
                ab.set(1, ab.get(1) + 1);
                elementPosition++;
            } else if (n == b.get(elementPosition)) {
                elementPosition++;
            }

        }

        return ab;

    }

}