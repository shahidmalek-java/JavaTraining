import java.io.*;
import java.net.*;
import java.util.Scanner;

//public class ClientProgram {
//    public static void main(String[] args) throws Exception{
//        Socket s = new Socket("localhost",6001);
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//
//        pw.println("Hello Server");
//
//        String reply = br.readLine();
//        System.out.println("Server Reply : "+reply);
//
//        s.close();
//
//    }
//}


//public class ClientProgram {
//    public static void main(String[] args) throws Exception{
//        Socket s = new Socket("localhost",6001);
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//
//        String str = "Java";
//        System.out.println("Client Input : "+str);
//        pw.println(str);
//        System.out.println("Client Receive : "+br.readLine());
//
//        s.close();
//
//    }
//}


//public class ClientProgram {
//    public static void main(String[] args) {
//        try (Socket socket = new Socket("localhost", 5555);
//             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
//
//            System.out.println(br.readLine());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}



//public class ClientProgram {
//    public static void main(String[] args) {
//        try {
//            Socket s = new Socket("localhost", 6001);
//
//            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                pw.println(line);
//            }
//
//            System.out.println("Successfully File Uploaded From Client ***");
//
//            s.close();
//            br.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}




//public class ClientProgram {
//    public static void main(String[] args) throws Exception {
//
//        Socket socket = new Socket("localhost", 5000);
//        System.out.println("Connected to server!");
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
//                        System.out.println("Server left chat.");
//                        System.exit(0);
//                    }
//                    System.out.println("Server: " + msg);
//                }
//            } catch (Exception e) { }
//        });
//
//        receive.start();
//
//        // Send messages to server
//        String msg;
//        while ((msg = keyboard.readLine()) != null) {
//            out.println(msg);
//            if (msg.equalsIgnoreCase("exit")) {
//                System.out.println("Client left chat.");
//                System.exit(0);
//            }
//        }
//    }
//}





//public class ClientProgram {
//    public static void main(String[] args) throws Exception{
//        Socket s = new Socket("localhost",6001);
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//
//        System.out.println("Client Receive : "+br.readLine());
//
//        s.close();
//
//    }
//}




//public class ClientProgram {
//    public static void main(String[] args) throws Exception{
//        Socket s = new Socket("localhost",6001);
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//
//        int no = 5;
//        System.out.println("Client Input : "+no);
//        pw.println(no);
//        System.out.println("Client Receive : "+br.readLine());
//
//        s.close();
//
//    }
//}



//public class ClientProgram {
//    public static void main(String[] args) throws Exception{
//       try {
//           Socket s = new Socket("localhost",6001);
//           System.out.println("Connected Successfully");
//       }catch (ConnectException e)
//       {
//           System.out.println("Server not Reachable...");
//           System.out.println("Exception "+e.getMessage());
//       }
//
//    }
//}





//public class ClientProgram {
//    public static void main(String[] args) throws Exception {
//        Socket s = new Socket("localhost", 6000);
//        System.out.println("Connected to server!");
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        String msg;
//        while ((msg = in.readLine()) != null) {
//            System.out.println(msg);
//        }
//    }
//}



//public class ClientProgram {
//    public static void main(String[] args) throws Exception {
//        Socket s = new Socket("localhost", 6000);
//        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        System.out.println(in.readLine());
//        s.close();
//    }
//}
