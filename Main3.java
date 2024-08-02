import java.util.Arrays;

public class Main3 {
    public static void main(String args[]){
        int array[]={4,6,7,-2,4,-9,1,8,-3} ;

       int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Move the left pointer until a negative value is found
            while (left < right && array[left] >= 0) {
                left++;
            }

            // Move the right pointer until a positive value is found
            while (left < right && array[right] < 0) {
                right--;
            }

            // Swap the negative value at the left pointer with the positive value at the right pointer
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        System.out.println("Array with negative values shifted to the end: " + Arrays.toString(array));

       int start[]={2,1,4,7,9};
        int end[]={ 4,3,5,8,10};


int c=1;
int et=end[0];
for(int i=1;i<start.length;i++)
{
   if(start[i]>=et)
    {
       c++;
       et=end[i];
}
}
System.out.println(c);

    

    }
}
