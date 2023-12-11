package element25;
class element25
{
    public static void main(String[] args) {
        int [] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) 
    {
        int result = arr[0];
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if ( result == arr[i]) count++;
            else count = 1;
            if (count > arr.length/4) return arr[i];
            result = arr[i];
        }
        return result;
    }
}
