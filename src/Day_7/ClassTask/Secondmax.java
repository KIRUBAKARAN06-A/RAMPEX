package Day_7.ClassTask;
public class Secondmax {
    public static void main(String [] args){
        /*int [] nums = {1,2,3,4,5};
        int Smax=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                Smax = max;
                max = nums[i];
            }
        }
        System.out.println(Smax+ " " + max);*/
            int [] nums = {1,2,3,5,4,5,5};
            int Smax=0;
            int max=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] > max){
                    Smax = max;
                    max = nums[i];
                }
            }
            System.out.println(Smax+ " " + max);
        }
    }


