package chap14;

public class CheckLogic {
  private static final String[] FOR_CATCH_SHA = {"9f75ce8bab5a90d53d6aa6098e4720726d533ed9ea92922a05066f1ce1d597a5", "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad"};
  private static final String[] FOR_THROUGH_SHA = {"3608bca1e44ea6c4d268eb6db02260269892c0b42b86bbf1e77a6fa16c3c9282","f766f73f69ef6177859832b7720965069b1073a3a8f6d946680ebe815871e240"};
  public static String execute(String str) {
    String sha = Sha256Logic.calcurate(str);
    for (String ngSha : FOR_CATCH_SHA) {
      if(sha.equals(ngSha)){
        throw new IllegalArgumentException();
      }
    }
    for (String ngSha : FOR_THROUGH_SHA) {
     if(sha.equals(ngSha)){
       throw new RuntimeException();
     }
    }
    return sha;
  }
}