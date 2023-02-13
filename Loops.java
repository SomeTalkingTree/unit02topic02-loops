import java.lang.Math;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.plaf.synth.SynthScrollPaneUI;
public class Loops {

  // stati10 methods go here
  // \/ works
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
  // \/ works
  public static void nRandom(int n){
    //amount do
    int a = n;
    //total
    double b = 0;
    
    double d = 0;
    for(int c =0;c<=a;c++){
      d= Math.random();
      
      b= b+d;

    }
    double e = b/a;
    
    System.out.println("This is the average: "+e);

  }
  // \/ works
  public static boolean isPrime(int n){
    int a = n;
    boolean tf = false;
    for(int b =2; b<20;b++){
      if((a % b)==0){
        if(a!=b){
        tf =true;
        }
      }
      
    }
    return tf;
  }
  // Can not find what is wrong when it is printing out the answer in the list
  //this \/
  public static void getFactors(int n){
    int a = n;
    
    int d = 1;
    int num = 1;
    for (int c =1; c<a;c++){
      if((a%num)==0){
        d=d+1;
      }
      num++;
    }
    System.out.println("This is d: "+d);
      
    int[] b = new int[d];
    b[0]=1;
    b[d-1]=a;
    
    System.out.println("This is b[0]: "+b[0]);
    System.out.println("This is b["+(d-1)+"]: "+b[d-1]);
    int e = 1;
    int f=2;
    for (int c =2; c<a;c++){
      boolean tf = false;
      if((a%f)==0){
        tf= true;
        if(e<d-1){
          b[e]=f;
        }
        
        
      } System.out.println("This is "+a+" / "+f+" = "+(a/f));
      e++;
      f++;
      System.out.println(f+" is "+tf);
    }
    e= 0;
    for(int c=0; c<d;c++){
      System.out.println("This is "+(e+1)+" factor: "+b[e]);
      
      e++;
    }
     System.out.println("Total is: "+ Arrays.toString(b));
  }

  //Works but code might need to be changed \/
  public static int rollDie(){
    int a = 1/6;
    int b = (1/6)*(1/6);
    return a+b;
    

  }
 
  
  /*To do:
  //all done for the below
  
  */
  public static void montyHallSimulation(int n) {
    int door = 0;
    int door1 = 0;
    int prize = 0;
    
    int total = 0;
    double wins = 0;
    double win = 0;
    double total1 = 0;
    Random random = new Random();int rand = 0;

    

    
    // This is the door chosen\/
    for(int num = 1;num<n;num++){
      //This is for prize \/
      rand = random.nextInt();
      int test = rand%3; 
      if(test==0){
        prize = 1;
      }else if(test==1||test==-1){
        prize = 2;
      }else if (test ==2||test==-2){
        prize =3;
      }// This is for prize /\
      rand = random.nextInt();
      int text = rand%3;
      if(text==0){
        door = 1;
      }else if(text==1||text==-1){
        door = 2;
      }else if (text ==2||text==-2){
        door =3;
      }
      
      //This is for the host chosen door\/ 

      rand = random.nextInt();
      text = rand%3;
      if(text==0){
        door1 = 1;
      }else if(text==1||text==-1){
        door1 = 2;
      }else if (text ==2||text==-2){
        door1 =3;
      }
      
      //This is for if you win or not
      if(door ==prize){
        wins ++;
        total = total +1;
      }else{
        total = total+1;
      }
      if(door1 ==prize){
        win++;
        total1 = total1 +1;
      }else{
        total1 = total1+1;
      }
      
    }
    double winrate1 = (wins/total);
    double winrate2 = (win/total1);
    
    if(wins>win){
      System.out.println("Without choosing the second door, the first door you choose wins. With a win rate of "+winrate1+"% (in which you won "+wins+"), when the other one had "+winrate2+"%.(in which the host won "+win+")");
    }else if (win>wins){
      System.out.println("With choosing the second door, the second door the host choose wins. With a win rate of "+winrate2+"%, when the other one had "+winrate1+"%.");
    }else{
      System.out.println("It was a tie. Both had a winrate of "+winrate2+"%.");
    }
    
    

  }


  public static void main(String[] args) {

    // testing of stati10 methods goes here
    nHellos(50);
    nRandom(15);
    System.out.println(isPrime(1000004807));
    getFactors(12);
    System.out.println(rollDie());
    montyHallSimulation(10);
    

  }
}



//java10 Loops.java; java Loops