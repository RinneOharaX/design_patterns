package com.itheima.pattern.BridgeType.TestSingleton;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/24 15:29
 */
public class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String[] patternChar = pattern.split("");
        String[] sChar = s.split(" ");
        Map hashmap = new HashMap();
        int i = 0;
        while (i < patternChar.length) {
            if (!hashmap.containsKey(patternChar[i])) {
                hashmap.put(patternChar[i], sChar[i]);
            } else if (!(hashmap.get(patternChar[i])).equals(sChar[i])) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        String[] magazineArr = magazine.split("");
        String[] ransomNoteArr = ransomNote.split("");

        Map hashmap = new HashMap();
        Map ransomNoteMap = new HashMap();
        int count = 1;
        int count1 = 1;
        for (int i = 0; i < magazineArr.length; i++) {
            if (hashmap.containsKey(magazineArr[i])) {
                int newcount = (int) hashmap.get(magazineArr[i]);
                hashmap.put(magazineArr[i], newcount + 1);
            } else {

                hashmap.put(magazineArr[i], 1);
            }
        }

        for (int j = 0; j < ransomNoteArr.length; j++) {
            if (ransomNoteMap.containsKey(ransomNoteArr[j])) {
                int newcount1 = (int) ransomNoteMap.get(ransomNoteArr[j]);
                ransomNoteMap.put(ransomNoteArr[j], newcount1 + 1);
            } else {
                int newcount1 = 1;
                ransomNoteMap.put(ransomNoteArr[j], newcount1);
            }
        }

        for (int d = 0; d < ransomNoteArr.length; d++) {
            if (!hashmap.containsKey(ransomNoteArr[d])) {
                hashmap.put(ransomNoteArr[d], 0);
            }
            if ((int) hashmap.get(ransomNoteArr[d]) < (int) ransomNoteMap.get(ransomNoteArr[d])) {
                return false;
            }
        }
        return true;
    }

    public static char findTheDifference(String s, String t) {
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        Map sMap = new HashMap();
        Map tMap = new HashMap();
        char answer = '0';
        for (int i = 0; i < sArr.length; i++) {
            if (!sMap.containsKey(sArr[i])) {
                sMap.put(sArr[i], 1);
            } else {
                int count = (int) sMap.get(sArr[i]);
                sMap.put(sArr[i], count + 1);
            }
        }
        for (int i = 0; i < tArr.length; i++) {
            if (!tMap.containsKey(tArr[i])) {
                tMap.put(tArr[i], 1);
            } else {
                int count = (int) tMap.get(tArr[i]);
                tMap.put(tArr[i], count + 1);
            }
        }

        for (int a = 0; a < sArr.length; a++) {
//            if ((int) tMap.get(sArr[a]) - (int) sMap.get(sArr[a]) == 1) {
//                answer = sArr[a].charAt(0);
//            }else if((int) tMap.get(sArr[a]) - (int) sMap.get(sArr[a]) == 0){
//                tMap.remove(sArr[a]);
//            }
            if (tMap.containsKey(sArr[a])) {
                int newcount = (int) tMap.get(sArr[a]);
                tMap.put(sArr[a], newcount - 1);
            }

        }
        for (int a = 0; a < tArr.length; a++) {
            if ((int) tMap.get(tArr[a]) == 1) {
                String s1 = tArr[a];
                answer = s1.charAt(0);
            }
        }
        return answer;
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < heights.length; i++) {
            treeMap.put(heights[i], names[i]);
        }
        String[] answer = new String[treeMap.size()];
        treeMap.values().toArray(answer);
        return answer;
    }

    public static boolean isIsomorphic(String s, String t) {
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        Map hashmap1 = new HashMap();
        Map hashmap2 = new HashMap();
        boolean answer = true;
        if (s.length() != t.length()) {
            return answer;
        }
        for (int i = 0; i < sArr.length; i++) {
            if (hashmap1.containsKey(sArr[i])) {
                if (!hashmap1.get(sArr[i]).equals(tArr[i])) {
                    answer = false;
                    break;
                }
            } else if (hashmap2.containsKey(tArr[i])) {
                if (!hashmap2.get(tArr[i]).equals(sArr[i])) {
                    answer = false;
                    break;
                }
            }
            hashmap1.put(sArr[i], tArr[i]);
            hashmap2.put(tArr[i], sArr[i]);
        }
        return answer;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();
        List<Integer> list = new ArrayList();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            hashSet1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            hashSet2.add(nums2[i]);
        }
        if (hashSet1.size() < hashSet2.size()) {
            for (int nums : hashSet1) {
                if (hashSet2.contains(nums)) {
                    set.add(nums);
                }
            }
        } else {
            for (int nums : hashSet2) {
                if (hashSet1.contains(nums)) {
                    set.add(nums);
                }
            }
        }
        int[] answer = new int[set.size()];
        int index = 0;
        for (int nums : set) {
            answer[index++] = nums;
        }
        return answer;
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        List<Integer> list = new ArrayList<>();
        Boolean flag = false;
        Map<Integer, Integer> hashmap = new LinkedHashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    hashmap.put(nums1[i], j);
                }
            }
        }
        for (Integer entry : hashmap.keySet()) {
            for (int i = hashmap.get(entry); i < nums2.length - 1; i++) {
                if (entry < nums2[i + 1]) {
                    list.add(nums2[i + 1]);
                    break;
                } else if (i + 1 == nums2.length - 1 && entry >= nums2[i + 1]) {
                    list.add(-1);
                }
            }
            if (hashmap.get(entry) == nums2.length - 1) {
                list.add(-1);
            }
        }
        int index = 0;
        for (Integer a : list) {
            answer[index++] = a;
        }
        return answer;
    }

    public static int firstUniqChar(String s) {
        int answer = -1;
        Map<Character, Integer> hashmap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (!hashmap.containsKey(s.charAt(i))) {
                hashmap.put(s.charAt(i), 1);
            } else {
                int temp = hashmap.get(s.charAt(i));
                temp++;
                hashmap.put(s.charAt(i), temp);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashmap.get(s.charAt(i)) == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hashmap1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!hashmap1.containsKey(nums1[i])) {
                hashmap1.put(nums1[i], 1);
            } else {
                int temp = hashmap1.get(nums1[i]);
                temp++;
                hashmap1.put(nums1[i], temp);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashmap1.containsKey(nums2[i])) {
                list.add(nums2[i]);
                int t = hashmap1.get(nums2[i]);
                t--;
                hashmap1.put(nums2[i], t);
                if (t == 0) {
                    hashmap1.remove(nums2[i]);
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }


    public static String mostCommonWord(String paragraph, String[] banned) {
        String s = paragraph.replaceAll("[\\pP\\p{Punct}]", "");
        String[] paragraphArray = s.split(" ");
        String key = "";
        int maxCount = 0;
        Map<String, Integer> hashmap = new HashMap();
        for (int i = 0; i < paragraphArray.length; i++) {
            paragraphArray[i] = paragraphArray[i].toLowerCase();
            if (!hashmap.containsKey(paragraphArray[i])) {
                hashmap.put(paragraphArray[i], 1);
            } else {
                Integer count = hashmap.get(paragraphArray[i]);
                count++;
                hashmap.put(paragraphArray[i], count);
            }
        }
        for (int i = 0; i < banned.length; i++) {
            if (hashmap.containsKey(banned[i])) {
                hashmap.remove(banned[i]);
            }
        }
        for (Map.Entry<String, Integer> set : hashmap.entrySet()) {
            Integer value = set.getValue();
            if (maxCount < value) {
                maxCount = value;
            }
        }
        for (Map.Entry<String, Integer> set : hashmap.entrySet()) {
            if (set.getValue() == maxCount) {
                key = set.getKey();
            }
        }
        return key;
    }

    public int findRepeatNumber(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashmap.containsKey(nums[i])) {
                hashmap.put(nums[i], 1);
            } else {
                int temp = hashmap.get(nums[i]);
                temp++;
                hashmap.put(nums[i], temp);
            }
        }
        for (Map.Entry<Integer, Integer> set : hashmap.entrySet()) {
            if (set.getValue() != 1) {
                answer = set.getKey();
            }
        }
        return answer;
    }


    public static int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }

    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }

    public int[] printNumbers(int n) {
        double pow = Math.pow(10, n);
        int[] answer = new int[(int) pow - 1];
        for (int i = 0; i < pow; i++) {
            answer[i] = i + 1;
        }
        return answer;
    }

    public int[] exchange(int[] nums) {
        List<Integer> arr = new ArrayList();
        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                arr.add(nums[i]);
            } else {
                brr.add(nums[i]);
            }
        }
        for (int i = 0; i < brr.size(); i++) {
            arr.add(brr.get(i));
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static int getmax(int i, int[] nums) {
        int max = nums[i];
        int temp = nums[i];
        Map<Integer, Integer> hashmap = new HashMap();
        if (i + 1 == nums.length) {
            max = nums[i];
        } else {
            for (int j = i + 1; j < nums.length; j++) {
                temp = temp + nums[j];
                hashmap.put(j, temp - nums[i]);
                if (max < temp) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public static int maxSubArray(int[] nums) {
        int max = Solution.getmax(0, nums);
        if (nums.length == 1) {
            max = nums[0];
        }
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = Solution.getmax(i, nums);
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }

    public static int maxSubArrayDP(int[] nums) {
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if (max < 0) {
                max = nums[j];
                dp[j] = max;
            } else {
                max = max + nums[j];
                dp[j] = max;
                System.out.println();
            }
        }
        int dpmax = dp[0];
        for (int i = 0; i < dp.length - 1; i++) {
            if (dpmax < dp[i + 1]) {
                dpmax = dp[i + 1];
            }
        }
        return dpmax;
    }

    public int lengthOfLastWord(String s) {
        String[] stringArr = s.split("");
        return stringArr[stringArr.length - 1].length();
    }


    public static ListNode reverseList(ListNode head) {
        ListNode slow = new ListNode();
        ListNode fast = new ListNode();
        ListNode temp = new ListNode();
        slow = head;
        fast = head.next;
        slow.next = null;
        while (fast != null) {
            temp = fast.next;
            fast.next = slow;
            slow = fast;
            fast = temp;
        }
        return slow;
    }

    public static int strToInt(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int answer = 0;
        String strTrim = str.trim();
        for (int i = 0; i < strTrim.length(); i++) {
            char c = strTrim.charAt(i);
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || (c == '-' && i == 0) || (c == '+' && i == 0)) {
                stringBuilder.append(c);
            } else {
                break;
            }
        }
        if (stringBuilder.length() == 0 || (stringBuilder.length() == 1 && stringBuilder.charAt(0) == '-') || (stringBuilder.length() == 1 && stringBuilder.charAt(0) == '+') || (stringBuilder.charAt(0) == '+' && stringBuilder.charAt(1) == '-') || (stringBuilder.charAt(0) == '-' && stringBuilder.charAt(1) == '+')) {
            return 0;
        }
        if (stringBuilder.charAt(0) == '+') {
            stringBuilder.substring(1, stringBuilder.length());
        }
        BigDecimal stringDecimal = new BigDecimal(String.valueOf(stringBuilder));
        BigDecimal max = BigDecimal.valueOf(Math.pow(2, 31) - 1);
        BigDecimal min = BigDecimal.valueOf(-Math.pow(2, 31));
        if (stringDecimal.compareTo(max) > 0) {
            answer = Integer.MAX_VALUE;
        } else if (min.compareTo(stringDecimal) > 0) {
            answer = Integer.MIN_VALUE;
        } else {
            answer = Integer.parseInt(String.valueOf(stringBuilder));
        }
        return answer;
    }

    public static boolean isStraight(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean answer = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }
        list.sort((o1, o2) -> o1 - o2);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) {
                answer = false;
                break;
            } else if (list.get(list.size() - 1) - list.get(0) <= 5) {
                answer = true;
            }
        }
        return answer;
    }

    static int count = 0;
    static int temp = 0;

    public static int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return getlastOneList(list, m);
    }

    public static Integer getlastOneList(List<Integer> list, int m) {
        for (int i = temp; i < list.size(); ++i) {
            count++;
            if (count == m) {
                count = 0;
                list.remove(i);
                i--;
            }
            if (i == list.size() - 1) {
                i = -1;

            }
            if (list.size() == 1) {
                break;
            }
        }
        return list.get(0);
    }

    public static int maxProfit(int[] prices) {
        int sale = 1;
        int buy = 0;
        int profit = 0;
        int maxprofit = 0;
        for (sale = 1; sale < prices.length; sale++) {
            profit = prices[sale] - prices[buy];
            if (sale + 1 == prices.length) {
                buy++;
                sale = buy;
            }
            if (maxprofit < profit) {
                maxprofit = profit;
            }

        }
        return maxprofit;
    }

    public static int fib(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //计算得到左半部分最长、右半部分最长，取得积
                dp[i] = Math.max(dp[i - j] * j, dp[i - j] * dp[j]);
                int temp = (i - j) * j;
                if (temp > dp[i]) {
                    dp[i] = temp;
                }
            }
        }
        return dp[n];
    }

    public static int[] singleNumbers(int[] nums) {
        List<Map.Entry> collect = new ArrayList<>();
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int temp = map.get(nums[i]);
                temp++;
                map.put(nums[i], temp);
            }
            collect = map.entrySet().stream().filter(integerIntegerEntry -> integerIntegerEntry.getValue() == 1).collect(Collectors.toList());
        }
        for (int i = 0; i < collect.size(); i++) {
            answer[i] = (int) collect.get(i).getKey();
        }
        return answer;
    }

    public static int[] singleNumbersPlus(int[] nums) {
        int ret = 0;
        for (int n : nums) {
            ret ^= n;
        }
        int div = 1;
        while ((div & ret) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int n : nums) {
            if ((div & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }

    public static String reverseWords(String s) {
        String[] sArr = s.split(" ");
        StringBuilder answer = new StringBuilder();
        String ans = "";
        for (int i = sArr.length - 1; i >= 0; i--) {
            if (sArr[i].equals("")) {
                continue;
            }
            answer.append(sArr[i]);
            if (i != 0) {
                answer.append(" ");
            }
        }
        ans = answer.toString();
        if (answer.lastIndexOf(" ") == answer.length() - 1 && answer.length() != 0) {
            ans = answer.substring(0, answer.length() - 1);
        }
        return ans;
    }

    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return 0;
    }


    public static int pivotIndex(int[] nums) {
        int answer = -1;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = 0;
            if (i >= 1) {
                leftSum = leftSum + nums[i - 1];
            }
            for (int j = i + 1; j < nums.length; j++) {
                rightSum = rightSum + nums[j];
            }
            if (leftSum == rightSum) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> answerList = new ArrayList<>();
        Arrays.sort(nums);
        int first = 0;
        int last = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int target=-nums[i];
             if (first==i){
                 first++;
             }
             
        }
        return null;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ans=null;
        Map<ListNode,Integer> hashmap=new HashMap<>();
        while(headA!=null){
            if(!hashmap.containsKey(headA)){
                hashmap.put(headA,1);
            }else{
                ans=headA;
            }
            headA=headA.next;
        }
        while(headB!=null){
            if(!hashmap.containsKey(headB)){
                hashmap.put(headB,1);
            }else{
                ans=headB;
                break;
            }
            headB=headB.next;
        }
        return ans;
    }

    public static char first(String s) {
        Map<Character, Integer> map=new LinkedHashMap<>();
        char answer=' ';
        char[] sArr=s.toCharArray ();
        for(int i=0;i<sArr.length;i++){
            if(!map.containsKey(sArr[i])){
                map.put(sArr[i],1);
            }else{
                int count=map.get(sArr[i]);
                count++;
                map.put(sArr[i],count);
            }
        }
        for (Map.Entry entity:map.entrySet()){
            if ((Integer) entity.getValue()==1){
               answer= (char) entity.getKey();
               break;
            }
        }
        return answer;
    }
    public static boolean isPalindrome(String s) {
        boolean answer=true;
        StringBuilder sb=new StringBuilder();
        String lowCase = s.toLowerCase();
        for (int i=0;i<lowCase.length();i++){
            if ((lowCase.charAt(i)>='a'&&lowCase.charAt(i)<='z')||(lowCase.charAt(i)>='0'&&lowCase.charAt(i)<='9')){
                sb.append(lowCase.charAt(i));
            }
        }
        String resultString = sb.toString();
        int left=0;
        int right=resultString.length()-1;
        while(left<right){
            if (resultString.charAt(left)!=resultString.charAt(right)){
                answer=false;
            }
            left++;
            right--;

        }
        return answer;
    }

    public static boolean validPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        boolean pailnd = isPailnd(s);
        if (!pailnd){
            String[] split = s.split("");
            for (int i = 0; i < split.length; i++) {
                temp.append(split[i]);
            }
            for (int i = 0; i < temp.length(); i++) {
                sb=new StringBuilder();
                sb.append(temp);
                StringBuilder newString = sb.deleteCharAt(i);
                boolean pailndB = isPailnd(String.valueOf(newString));
                if (pailndB){
                    pailnd= true;
                    break;
                }
            }
        }
    return pailnd;
    }
    public static boolean isPailnd(String s){
        boolean answer=true;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                answer=false;
                break;
            }else {
                left++;
                right--;
            }
        }
        return answer;
    }
}