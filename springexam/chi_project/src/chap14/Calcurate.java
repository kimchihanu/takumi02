package chap14;

public class Calcurate {
 public static int divideThousand(Integer num){
  if(num < 0){
   throw new MinusException();
  }
  return 1000/num;
 }
}