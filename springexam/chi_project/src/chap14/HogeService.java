package chap14;

public class HogeService {
 private ResourceManager manager;
 public HogeService(ResourceManager manager){
  this.manager = manager;
 }

 public void exec1(String data){
  if(manager.isClose()){
   System.err.println("already closed");
  }
  if(data.equals("ex1")){
   throw new IllegalArgumentException("exec1で例外");
  }
  System.out.println("ex1" + data);
 }

 public void exec2(String data){
  if(manager.isClose()){
   System.err.println("already closed");
  }
  if(data.equals("ex2")){
   throw new RuntimeException("exec2で例外");
  }
  System.out.println("ex2" + data);
 }

}