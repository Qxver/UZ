package Lab11.Zad3;
import java.net.*;
import java.io.*;

public class Serwer{
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8410)){
            System.out.println("Serwer nasluchuje na porcie 8410.");
            Socket socket = server.accept();
            System.out.println("Klient polaczyl sie z serwerem.");

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader buff = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            writer.println("Wyslano komunikat do klienta");
            System.out.println("Do klienta: 'Wyslano komunikat do klienta'");
            String odpowiedz = buff.readLine();
            System.out.println("Od klienta: " + odpowiedz);

            if(odpowiedz.equals("Nawiazano komunikacje i wyslano odpowiedz")){
                Thread.sleep(5000);
                writer.println("Polaczenie zatwierdzone");
                System.out.println("Do klienta: 'Polaczenie zatwierdzone'");
            }
            else{
                System.out.println("Otrzymana zla odpowiedz, serwer zostanie wylaczony.");
                server.close();
                socket.close();
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
