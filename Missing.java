public class Missing{

public static int Missingg(int [] nums)
{
   int xor1=0;
   int xor2=0;
   for(int i=0;i<nums.length;i++)
   {
xor1=xor1^nums[i];
xor2=xor2^(i+1);
   } 
   return xor1^xor2;
}

    public static void main(String[] args) {
        int[] nums={1,3,4,5,6};
        int res=Missingg(nums);
        System.out.println(res);
    }
}