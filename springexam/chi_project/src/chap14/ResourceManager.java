package chap14;

public class ResourceManager {
 private boolean isClose = false;

 public void close(){
  isClose = true;
  System.out.println("manager closed");
 }

 public boolean isClose() {
  return isClose;
 }

}