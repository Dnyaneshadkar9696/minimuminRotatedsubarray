class A{
    public static int hen() {
        int[] nums = {4, 5, 6, 7, 1, 2};
        // we have to check the value is prestent or not
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            // till this part we assign left rigth and mid
//            if (nums[mid] > nums[right]) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//
//        }
//        int e = nums[left];
//        System.out.println(e);
//
//        int l1 = 0;
//        int r1 = e - 1;
//        while(l1<r1){
//            int m1 = l1 + (r1-l1)/2;
//        }
        int target = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                c = i;

            }
            else{
                c = -1;
            }
        }
        return c;

    }
}



public class rotatedsortedarray {
    public static void main(String[] args){
        A rt = new A();
        int g = rt.hen();
        System.out.println(g);




    }
}
