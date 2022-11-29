package giathuat;


import java.util.Arrays;

public class soution {
//    public static void merge(int[] a, int left, int right, int middle) {
//// gan cac gia tri
//        int l = left;
//        int m = middle + 1;
//        int index = 0;
//        // tao mot mang moi
//        int[] b = new int[right - left + 1];
//        // nhap cac gia tri tu 2 mang da chia
//        // tu trai qua phai xem phan tu nao thap hon thi se gan phan tu do vaof mang va tang don vi len mot
//        while ((l < middle + 1) && (m < right + 1)) {
//            if (a[l] < a[m]) {// mang trai
//                b[index++] = a[l++]; // sau khi xong phai tang 1 don vi
//            } else { // mangr phai
//                b[index++] = a[m++];// sau khi xong phai tang 1 don vi
//            }
//        }
//        // neu mang phai da het thi gan toan mang trai vao
//        while (l < middle + 1) {
//            b[index++] = a[l++];
//        }
//        // neu mang trai da het thi gan toan phai trai vao
//        while (m < right + 1) {
//            b[index++] = a[m++];
//        }
//        int i = left;
//        for (int k = 0; k < right - left; k++) {
//            a[i++] = b[k];
//        }
//    }
//
//
//    public static void mergeSort(int[] a, int left, int right) {
//        if (left < right) {
//            int middle = (right + left) / 2;
//            mergeSort(a, left, middle);
//            mergeSort(a, middle + 1, right);
//            merge(a, left, right, middle);
//        }
//    }

// Insertion sort
//        for (int i = 1; i < 6; i++) {
//            int key = a[i];
//            int j = i - 1;
//            while (j >= 0 && a[j]>key) {
//                a[j + 1] = a[j];
//                j--;
//            }
//            a[j+1] = key;
//        }
//        for (int k : a
//        ) {
//            System.out.println(k);
//        }
//
//    }
//
    //   bubble sort
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 6 - i - 1; j++) {
//                if (a[j] > a[j + 1]) {
//                    int tmp;
//                    tmp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = tmp;
//                }
//            }
//        }
//Selection sort\
//        for (int i = 0; i < 6 - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < 6; j++) {
//                if (a[j] < a[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int tmp = a[minIndex];
//            a[minIndex] = a[i];
//            a[i] = tmp;
//        }
    // merge sort

    // quick sort
//    static void quickSort(int arr[], int left, int right) {
//        // dieu kien dung
//        if (left >= right)
//            return;
//        // chon key o giua
//        int key = arr[(left + right) / 2];
//        // phan bo lai mang
//        int k = partition(arr, left, right, key);
//        // chia doi mang bang de quy
//        quickSort(arr, left, k - 1);
//        quickSort(arr, k, right);
//    }

//    static int partition(int arr[], int left, int right, int key) {
//        int il = left;
//        int ir = right;
//        while (il <= ir) {
//            while (arr[il] < key) il++;
//            while (arr[ir] > key) ir--;
//            if (il <= ir) {
//                int tmp = arr[il];
//                arr[il] = arr[ir];
//                arr[ir] = tmp;
//                il++;
//                ir--;
//            }
//        }
//        return il;
//    }

    static void mergaSort(int[] a, int left, int right) {
        if (left < right) {
            int middle = (right + left) / 2;
            mergaSort(a, left, middle);
            mergaSort(a, middle + 1, right);
            merga(a, left, right, middle);
        }
    }

    static void merga(int[] a, int left, int right, int middle) {
        int l = left;
        int m = middle + 1;
        int index = 0;
// tao mot mang moi
        int[] b = new int[right - left + 1];
// nhap cac gia tri tu 2 mang da chia
// tu trai qua phai xem phan tu nao thap hon thi se gan phan tu do
        while ((l < middle + 1) && (m < right + 1)) {
            if (a[l] < a[m]) {// mang trai
                b[index++] = a[l++]; // sau khi xong phai tang 1 don vi
            } else { // mangr phai
                b[index++] = a[m++];// sau khi xong phai tang 1 don vi
            }
        }
// neu mang phai da het thi gan toan mang trai vao
        while (l < middle + 1) {
            b[index++] = a[l++];
        }
// neu mang trai da het thi gan toan phai trai vao
        while (m < right + 1) {
            b[index++] = a[m++];
        }
        int i = left;
        for (int k = 0; k < right - left; k++) {
            a[i++] = b[k];
        }
        }


    public static void main(String[] args) {
        int[] a = {9, -3, 5, 2, 6, 8, -6, 1, 3};
        mergaSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
