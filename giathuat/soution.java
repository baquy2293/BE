package giathuat;


import java.util.Arrays;

public class soution {
    static void showArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
// chia nhỏ rồi sắp sếp 
    public static void merge(int[] a, int left, int right, int middle) {
// gan cac gia tri
        int l = left;
        // mang trai
        int m = middle + 1;// mang phai
        int index = 0;  // chi so cua mang moi
        // tao mot mang moi
        int[] b = new int[right - left + 1];
        // nhap cac gia tri tu 2 mang da chia
        // tu trai qua phai xem phan tu nao thap hon thi se gan phan tu do vao mang va tang don vi len mot
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
        // gan b lai vao mang a
        int i = left;
        for (int k = 0; k < right - left; k++) {
            a[i++] = b[k];
        }
    }

    public static void mergeSort(int[] a, int left, int right) {
        // dieu kien dung cua de quy
        if (left < right) {
            int middle = (right + left) / 2;  // chon phan tu giua
            // chia mang
            mergeSort(a, left, middle);
            mergeSort(a, middle + 1, right);
            //  sap sep lai mang
            merge(a, left, right, middle);
        }
    }

    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i]; // chon mot phan tu tuwf vi tri thu 2 tro di
            int j = i - 1; // vi tri duong sau phan tu key
            while (j >= 0 && a[j] > key) { // tim phan tu tu vi tri thu 0 tro di
                //   va check co phan tu nao lon hon key khong
                a[j + 1] = a[j]; // co thi dich mang len
                j--;
            }
            // cho den khi khong con phan tu nao lon hon key vaf lon hon 0 thi gan lai gia tri
            a[j + 1] = key;
        }
    }

    static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) { // duyet tung phan tu
            for (int j = 0; j < a.length - i - 1; j++) { // duyet tung phan tu tư = den lenght - i - 1
                if (a[j] > a[j + 1]) { // lay 2 phan tu lien tiep so sanh neu phan tu truoc lơn hơn phan tu sau thì swap
                    int tmp;
                    tmp = a[j];
                    a[j] = a[j + 1];// swap
                    a[j + 1] = tmp;
                }
            }
        }
    }
// sắp sếp rồi chia  
    //Selection sort
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // duyet cac phan tu cua mang
            int minIndex = i; //  gan vi tri của phần tử nhỏ nhất là vị trí xuất phát
            for (int j = i + 1; j < a.length; j++) { // duyet tu truoc phan tu xuaats phat den  het mang
                if (a[j] < a[minIndex]) {  // neu phan tu tai vi tri min  >  phan tu cua mang
                    minIndex = j;  // gan vi tri min bằng vị trí của phần tử trên
                }
            }
            // tim xong vi tri co phan tu nho nhất thì đổi chỗ phần tử xuất phát với phần tử có giá trị nhỏ nhất
            int tmp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = tmp;
        }
    }

    // quick sort
    static void quickSort(int arr[], int left, int right) {
        // dieu kien dung
        if (left >= right)
            return;
        // chon key o giua
        int key = arr[(left + right) / 2];
        // phan bo lai mang
        int k = partition(arr, left, right, key);
        // chia doi mang bang de quy
        quickSort(arr, left, k - 1);  // mảng trái
        quickSort(arr, k, right);  // mảng phải
    }

    static int partition(int arr[], int left, int right, int key) {
        int il = left;// gán vị trí bên trái ngoài cùng
        int ir = right;  // bên phải ngôaif cùng
        while (il <= ir) {   // điều kiện dùng khi chia mảng  nếu trái lớn hơn phải thì dừng
            while (arr[il] < key) il++;  // tìm phan tu  nhỏ hơn key
            while (arr[ir] > key) ir--;  // tim phan tu lon hon key
            if (il <= ir) {  // kiểm tra sau khi tìm được các phần tử rồi có thoản mãn khong
                int tmp = arr[il];   // đảo 2 phần từ lớn và nhỏ hơn key về cùng một bên
                arr[il] = arr[ir];
                arr[ir] = tmp;
                il++; // tăng trái lên 1
                ir--;  // giảm phải  đi một
            }
        }
        return il;  // chia xong trả về vị chí trái
    }



    public static void main(String[] args) {

    }
}
