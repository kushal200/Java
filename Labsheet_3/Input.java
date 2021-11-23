
/**
 * Write a description of class Input here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Input
{
    
    public static void main(String[] args){
    
        int num=2,val=3;
        do{  switch(num) { 
            case 2: System.out.print ((num%val==2)?num++:(num+=val)); 
            break;   
            case 4: System.out.print (num++ + "" + ++ num); 
            default: System.out.print (num++);
        }
        System.out.print ("stars"); 
    }
    while(num >1 && num <5);     
    }
    
}
