package leetcode;

public class MedianTwoSortedArray {
    public static double findMedianSortedArrays(int [] nums1, int [] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int size = m+n;
        int [] merged = new int[size];
        // (m+n)이 홀수인경우, mergedArray에서 (m+n)/2번쨰 인덱스를 리턴.
        // (m+n)이 짝수인경우, mergedArray에서 (m+n)/2번째와 (m+n)/2-1의 리턴.
        int idx = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                merged[idx++] = nums1[i++];
            else
                merged[idx++] = nums2[j++];
        }
        while (i < m) {
            merged[idx++] = nums1[i++];
        }
        while (j < n) {
            merged[idx++] = nums2[j++];
        }
        if (size % 2 != 0)
            return merged[size/2];
        return (double) (merged[size/2] + merged[(size/2)-1])/2;
    }

    public static void main(String[] args) {
//        int [] nums1 = {1,2,3,4,5,6,7};
//        int [] nums2 = {5,6,7,8,9,10,11,17,19,33};
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));;
    }
}
