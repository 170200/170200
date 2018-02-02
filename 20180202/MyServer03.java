import java.net.Socket;
  import java.io.IOException;
  import java.io.InputStream;
  import java.io.InputStreamReader;
  import java.io.BufferedReader;
  
  public class MyServer03 {
    public static  void main (String[] args) {
     
      Socket sock = null;
      InputStream is = null;
      InputStreamReader isr = null;
      BufferedReader br = null;
  
      
      try {
        
        sock = new Socket(5999,30);
        System.out.println("サーバに接続しました.");
  
        
        is = sock.getInputStream();
       
        isr = new InputStreamReader(is);
       
        br = new BufferedReader(isr);
  
       
        String serverData = br.readLine();
  
       
        System.out.println("受信データ: "+serverData);
  
      } catch (IOException e) {
        System.err.println("クライアントエラー");
        System.exit(1);
      }
    }
  }