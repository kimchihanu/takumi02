package chap14;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256Logic {
 public static String calcurate(String str) {
  MessageDigest md;
  try {
   md = MessageDigest.getInstance("SHA-256");
  } catch (NoSuchAlgorithmException e) {
   throw new RuntimeException(e);
  }
  md.update(str.getBytes());
  byte[] bytes = md.digest();
  StringBuilder sb = new StringBuilder(2 * bytes.length);
  for (byte b : bytes) {
   sb.append(String.format("%02x", b & 0xff));
  }
  String sha = sb.toString();
  return sha;
 }
}