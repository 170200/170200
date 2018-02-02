import java.net.Socket;
   import java.io.IOException;
   import java.io.InputStream;
   import java.io.OutputStream;
   
   public class MyClient05 {
     public static void main (String[] args) {
       // データ準備
       Socket sock = null;
       InputStream is = null;
       OutputStream os = null;
       
       try {
         // サーバに接続する
         sock = new Socket("172.16.21.56", 4999);
         is = sock.getInputStream();
         os = sock.getOutputStream();
         
         
         String msg = "170200";
         String msg2 = "hiromu";
         String msg3 = "ALOHA";
         
      
         is.close();
       } catch (IOException e) {
         System.err.println("ネットワークエラー");
         System.exit(1);
       }
     }
   }