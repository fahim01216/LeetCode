package com.company.Arrays;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[nums1.length + nums2.length];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j])
                ans[k++] = nums1[i++];
            else
                ans[k++] = nums2[j++];
        }
        while(i < nums1.length)
            ans[k++] = nums1[i++];

        while(j < nums2.length)
            ans[k++] = nums2[j++];

        double median = 0.0000;
        double sum = 0;

        int cnt = nums1.length + nums2.length;
        if(cnt % 2 == 0){
            cnt = cnt / 2;
            sum += ans[cnt - 1] + ans[cnt];
            median = sum / 2;
        }
        else
            median = ans[cnt / 2];
        return median;
    }
}

