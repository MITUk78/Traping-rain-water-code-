import java.util.*;

public class trapingWater {

public static int trappedRainWater(int height[]){
    int n = height.length;
   
     // calculute left max boundaries/ - array(auxiliary array/helper array)
     
    int leftmax[]= new int[n];
    leftmax[0]=height[0];

    for(int i=1; i<n;  i++){
        leftmax[i]=Math.max(height[i],leftmax[i-1]);
    }
    // calculute right max boundaries/ - array(auxiliary array/helper array)

    int rightmax[]= new int[n];
    rightmax[n-1]= height[n-1];
    for(int i=n-2; i>=0; i--){
        rightmax[i]=Math.max(height[i],rightmax[i+1]);
    }
    
    int trappedWater=0;

    // loop/
    for(int i=0; i<n; i++){
     // WaterLevel = min(leftmax bound ,rightmax bound)
        int waterLevel =Math.min(leftmax[i], rightmax[i]);

         // trapedWater = waterLeavel - height[i]
        trappedWater += waterLevel-height[i];
    }

    return trappedWater;
 
   


}
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));       
    }
}
