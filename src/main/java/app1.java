public class app1 {

    public static void main(String args[])
    {
        int[] arr = {10, 2, 3, 9};
        PrintArray(arr);
        for(int i = 0 ; i < arr.length ;i++)
            for(int j = i ; j < arr.length ;j++)
            {
             if (arr[i] > arr[j]) {
                 int c = arr[i];
                 arr[i] = arr[j];
                 arr[j] = c;
             }

            }
        PrintArray(arr);
    }

    public static void PrintArray(int[] arr)
    {
        for(int c : arr)
            System.out.print(c + ", ");
        System.out.println();
    }



}
