package everyday.two;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class RotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length<=0){
            return 0;
        }
        int first = 0;
        int last = array.length-1;
//        int mid = first + ((last - first)>>1);
        int mid = 0;

        while (first<last){
//            mid = ( first + last ) / 2 ;
            mid = first + ((last - first)>>1);
//            System.out.println(last-first);
//            System.out.println(last-first>>1);
//            System.out.println("mid0: "+mid);
            if(array[mid] > array[last]){
                first = mid + 1;
            }else if(array[mid] < array[last]){
                last = mid;
            }else {
                --last;
            }
        }
        return array[first];
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] array = {3,4,5,1,2};
        int min = rotateArray.minNumberInRotateArray(array);
        System.out.println("min: "+min);
    }
}
