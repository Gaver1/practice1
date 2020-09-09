public class wholenumber1 {

    public static void main(String[]args)
    {
        int[]arr1=new int[10];

        for(int i=0; i<10; i++)
        {
            arr1[i] = i;
        }
        int[]arr2=new int[10];
        int i = 0;
        while(i<10)
        {
            arr2[10 - 1 - i] = i;
            i++;
        }

        System.out.println();

        int[]arrVar = new int[10];
        int z = 0;
        i = 0;
        do
        {
            arrVar[i] = arr1[i] + arr2[i];
            z += arrVar[i];
            i++;
        }
        while(i<10);
        {
            System.out.println(z);
        }
    }
}
