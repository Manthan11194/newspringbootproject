package mj;

public class Main{
    
    public static void main(String args[])
{
    int[] array={10, 20, 4, 45, 99, 50};
    int highest = array[0];
    int secondhighest = Integer.MIN_VALUE;
    
    for(int i=1; i<array.length; i++){
        
        if(array[i]>highest){
            
            secondhighest=highest;
            highest=array[i];
            }
            else if(array[i]>secondhighest && array[i]!=highest){
                
                secondhighest= array[i];
            }
    }
    
    System.out.println("Hightes element:"+highest);
    System.out.println("Seond highest element:"+secondhighest);
    
}
}
   
