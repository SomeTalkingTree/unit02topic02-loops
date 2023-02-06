import java.lang.Math;
public class Loops {

  // stati10 methods go here
  
  public static void nHellos(int n){
    int b = n;
    String text = "";
    int a =1;
    
    while(a<=b){
      if((a%10)==1){
        
        if(a ==11){
          text = "th";
        }else{
          text = "st";
        }
        
      }else if((a%10)==2){
        if(a ==12){
          text = "th";
        }else{
          text = "nd";
        }
        
      }else if((a%10)==3){
        if(a ==13){
          text = "th";
        }else{
          text = "rd";
        }
        
      }else{
        text = "th";
      }

      System.out.println(a+text+" hello");
      a++;
    }
    
  }

  public static void nRandom(int n){
    //amount do
    int a = n;
    //total
    double b = 0;
    //placeholder
    double d = 0;
    for(int c =0;c<=a;c++){
      d= Math.random();
      
      b= b+d;

    }
    double e = b/a;
    
    System.out.println("This is the average: "+e);

  }



  public static void main(String[] args) {

    // testing of stati10 methods goes here
    //nHellos(50);
    //nRandom(15);
    

  }
}



//java10 Loops.java; java Loops