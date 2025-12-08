import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.util.Scanner;

//public class ServerProgram {
//    public static void main(String[] args) throws Exception {
//
//        ServerSocket server = new ServerSocket(6001);
//
//            Socket s = server.accept();
//            System.out.println("Client Connected....");
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//
//        String msg =br.readLine();
//        if(msg.equals("Hello Server"))
//        {
//            pw.println("Hello Client");
//        }
//        s.close();
//
//    }
//}



//public class ServerProgram {
//    public static void main(String[] args) throws Exception {
//
//        ServerSocket server = new ServerSocket(6001);
//
//        Socket s = server.accept();
//        System.out.println("Client Connected....");
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//
//        String msg = br.readLine();
//        pw.println(msg);
//
//
//        s.close();
//
//    }
//}




//import java.io.*;
//import java.net.*;
//
//class ClientHolder extends Thread {
//    Socket clientSocket;
//    int clientNumber;
//
//    ClientHolder(Socket socket, int number) {
//        clientSocket = socket;
//        clientNumber = number;
//    }
//
//    @Override
//    public void run() {
//        try {
//            System.out.println("Client " + clientNumber + " connected");
//
//            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//            out.println("Hello Client " + clientNumber + ", welcome!");
//
//            clientSocket.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//public class ServerProgram {
//    public static void main(String[] args) {
//        try {
//            ServerSocket server = new ServerSocket(5555);
//            System.out.println("Server is running... Waiting for clients...");
//
//            int clientNumber = 1;
//
//            while (true) {
//                Socket client = server.accept();
//                new ClientHolder(client, clientNumber).start();
//                clientNumber++;
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}




//public class ServerProgram {
//    public static void main(String[] args) {
//        try {
//            ServerSocket server = new ServerSocket(6001);
//            System.out.println("Server waiting for client...");
//
//            Socket s = server.accept();
//            System.out.println("Client Connected....");
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            PrintWriter fileWriter = new PrintWriter(new FileWriter("received.txt"));
//
//            String read;
//            while ((read = br.readLine()) != null) {
//                fileWriter.println(read);
//            }
//
//            fileWriter.close();
//            s.close();
//
//            System.out.println("Server saves the file successfully.");
//            System.out.println("File received successfully");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}





//public class ServerProgram {
//    public static void main(String[] args) throws Exception {
//
//        ServerSocket server = new ServerSocket(5000);
//        System.out.println("Server waiting...");
//
//        Socket socket = server.accept();
//        System.out.println("Client connected!");
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
//
//        // Thread to receive messages
//        Thread receive = new Thread(() -> {
//            try {
//                String msg;
//                while ((msg = in.readLine()) != null) {
//                    if (msg.equalsIgnoreCase("exit")) {
//                        System.out.println("Client left chat.");
//                        System.exit(0);
//                    }
//                    System.out.println("Client: " + msg);
//                }
//            } catch (Exception e) { }
//        });
//
//        receive.start();
//
//        // Send messages to client
//        String msg;
//        while ((msg = keyboard.readLine()) != null) {
//            out.println(msg);
//            if (msg.equalsIgnoreCase("exit")) {
//                System.out.println("Server left chat.");
//                System.exit(0);
//            }
//        }
//    }
//}



//public class ServerProgram {
//    public static void main(String[] args) throws Exception {
//
//        ServerSocket server = new ServerSocket(6001);
//        LocalDateTime localDateTime = LocalDateTime.now();
//
//        Socket s = server.accept();
//        System.out.println("Client Connected....");
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//
//        pw.println(localDateTime);
//
//
//        s.close();
//
//    }
//}



//public class ServerProgram {
//    public static void main(String[] args) throws Exception {
//
//        ServerSocket server = new ServerSocket(6001);
//
//        Socket s = server.accept();
//        System.out.println("Client Connected....");
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//        int fac =Integer.parseInt(br.readLine());
//        int tem = fac;
//        for(int i=1;i<tem;i++)
//        {
//            fac*=i;
//        }
//        pw.println(fac);
//        s.close();
//
//    }
//}




//public class ServerProgram {
//    public static void main(String[] args) throws Exception {
//        ServerSocket server = new ServerSocket(6000);
//        System.out.println("Server started. Waiting for clients...");
//
//        while (true) {
//            Socket client = server.accept();
//            System.out.println("Client connected!");
//
//            // Thread per client
//            new Thread(() -> {
//                try {
//                    PrintWriter out = new PrintWriter(client.getOutputStream(), true);
//                    BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
//
//                    // Broadcast only to this client
//                    String msg;
//                    while ((msg = kb.readLine()) != null) {
//                        out.println("Server Broadcast: " + msg);
//                    }
//                } catch (Exception e) {}
//            }).start();
//        }
//    }
//}




//public class ServerProgram {
//    public static void main(String[] args) throws Exception {
//        ServerSocket server = new ServerSocket(6000);
//        System.out.println("Server started. Waiting for clients...");
//
//        // Thread to handle shutdown
//        new Thread(() -> {
//            try {
//                BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
//                if ("shutdown".equalsIgnoreCase(kb.readLine())) {
//                    System.out.println("Server shutting down");
//                    server.close(); // stop accepting clients
//                    System.exit(0);
//                }
//            } catch (IOException e) {}
//        }).start();
//
//        // Accept clients
//        try {
//            while (true) {
//                Socket client = server.accept();
//                System.out.println("Client connected!");
//                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
//                out.println("Welcome!");
//                client.close();
//            }
//        } catch (IOException e) {
//            // Happens when server is closed
//        }
//    }
//}