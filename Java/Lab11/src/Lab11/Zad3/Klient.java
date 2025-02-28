package Lab11.Zad3;
import java.io.*;
import java.net.*;

public class Klient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 8410)){
            System.out.println("Polaczono z serwerem.");

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader buff = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String wiadomosc = buff.readLine();
            System.out.println("Od serwera: " + wiadomosc);

            if("Wyslano komunikat do klienta".equals(wiadomosc)){
                writer.println("Nawiazano komunikacje i wyslano odpowiedz");
                System.out.println("Do serwera : 'Nawiazano komunikacje i wyslano odpowiedz'");
            }

            Thread.sleep(120000);
            writer.println("Koncze prace");
            System.out.println("Koncze prace");
        }

        catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
