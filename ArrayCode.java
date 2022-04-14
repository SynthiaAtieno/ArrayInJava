public class ArrayCode{
    public static void main(String[]args)
    {
        int []arr = new int[5];
        arr[0]=6;
        arr[1]=7;
        arr[2]=3;
        arr[3]=9;
        arr[4]=2;

        int sum=0;

        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}