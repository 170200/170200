import java.io.*;
import java.net.*;
public class MyClient01{
  public static void main(String[] args){
      byte[] buff = new byte[6000];
      Socket readsock = null;
      InputStream instr = null;
      boolean cont = true;
      try {
        readsock = new Socket(args[0], 
        Integer.parseInt(args[1]));
        instr = readsock.getInputStream();
        while(cont){
          try {
            int n = instr.read(buff);
            System.out.write(buff, 0, n);
          }catch (Exception e) {
            cont = false;
          }
        }
        instr.close();
      }catch (Exception e) {
        System.err.println("ネットワークエラーです。");
        System.exit(1);
      }
    }
  }