import java.net.*;
import java.io.*;

public class ChatServer {

    ServerSocket sersock;
    Socket sock;
    PrintWriter pw;
    BufferedReader br, brn;
    Thread t1, t2;

    ChatServer() {
        try {
            sersock = new ServerSocket(7872);
            System.out.println("Server started at port 7872");
            sock = sersock.accept();
            System.out.println("Connection Accepted");
            pw = new PrintWriter(sock.getOutputStream());
            brn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            brn = new BufferedReader(new InputStreamReader(System.in));
            pw.println("Start Chatting");
            pw.flush();
            t1 = new Thread(new Sender());
            t2 = new Thread(new Reciever());
            t1.start();
            t2.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        /////INNER CLASS
        
        class Reciever implements Runnable
        {

            @Override
            public void run() {
            String s;
            while(true)
                try
                {
                    s=brn.readLine();
                    System.out.println("Client: "+ s);
                }
            catch(Exception ex)
            { 
                ex.printStackTrace();
            }
            }
                    }
        
        class Sender implements Runnable
        {

            @Override
            public void run() {
            String s;
            while(true)
                try
                {
                    s=brn.readLine();
                    pw.println("Server: "+ s);
                    pw.flush();
                }
            catch(Exception ex)
            { 
                ex.printStackTrace();
            }
            }
                    }
    

    public static void main(String[] args) 
{
        ChatServer obj = new ChatServer();
    

}
    }
