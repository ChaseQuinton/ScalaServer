import java.net._
import java.io._

object Server extends App {
    val server = new ServerSocket(8080)

    while (true){
        var socket = server.accept()
        var input = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        var line = ""
        while ((line = input.readLine()) != null) {
            System.out.println(line)
        }
    }
}