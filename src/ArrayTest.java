import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
         Mytools mytools=new Mytools();
         int[] arr={9, 5, 6, 8, 2, 7, 3, 4, 1};
         mytools.bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
class Mytools {
    public void bubble(int arr[]) {
        //冒泡排序
        int temp = 0;
        //外层循环次数 arr.length-1
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
//        int[] arr1 = { 9, 5, 6, 8, 2, 7, 3, 4, 1 };
//        int temp = 0; // 用于交换
//
//        for (int i = 0; i < arr1.length - 1; i++) {
//            for (int j = 0; j < arr1.length - i - 1; j++) {
//                // 如果前面的数比后面的数大，就直接交换
//                if (arr1[j] > arr1[j + 1]) {
//                    temp = arr1[j];
//                    arr1[j] = arr1[j + 1];
//                    arr1[j + 1] = temp;
//                }
//            }
//            System.out.println("第" + (i + 1) + "趟后的数组元素");
//            System.out.println(Arrays.toString(arr1));
//        }
//
//        // 输出最后的结果
//        System.out.println("最终结果:");
//        for (int i : arr1) {
//            System.out.print(i + "  ");
//        }
//    }
//}




