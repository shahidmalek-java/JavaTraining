import java.io.*;
import java.net.*;
import java.time.LocalTime;

class Main {
    public static void main(String[] args) throws MalformedURLException {


//        try {
//            URL url = new URL("http://example.com:8080/index.html");
//            System.out.println("Protocol : "+url.getProtocol());
//            System.out.println("Host : "+url.getHost());
//            System.out.println("Port : "+url.getPort());
//            System.out.println("File : "+url.getFile());
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }




//        String str = "http://www.dhah.com";
//        try {
//            URL url = new URL(str);
//            System.out.println("valid Url...");
//            System.out.println("Protocol : "+url.getProtocol());
//            System.out.println("Host : "+url.getHost());
//            System.out.println("Port : "+url.getPort());
//            System.out.println("File : "+url.getFile());
//        } catch (MalformedURLException e) {
//            System.out.println("Invalid Url...");
//            System.out.println(e.getMessage());
//        }


//        String str = "http://www.google.com";
//        try {
//            URL url = new URL(str);
//            InputStream in = url.openStream();
//            BufferedReader br = new BufferedReader(new InputStreamReader(in));
//            String line;
//            while ((line=br.readLine())!=null)
//            {
//                System.out.println(line);
//            }
//            br.close();
//            in.close();
//
//        } catch (MalformedURLException e) {
//            System.out.println("Invalid Url...");
//            System.out.println(e.getMessage());
//            } catch (IOException e) {
//            throw new RuntimeException(e);
//        }




//        String imageUrl = "https://www.vecteezy.com/free-photos/image";
//        String saveAs = "image.jpg"; // file name to save
//
//        try (InputStream in = new URL(imageUrl).openStream();
//             FileOutputStream out = new FileOutputStream(saveAs)) {
//
//            in.transferTo(out); // Java 9+ simple copy
//            System.out.println("Image saved to local system.");
//            System.out.println("Download complete");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



//        String url = "https://www.google.com";
//
//        try {
//            long start = System.currentTimeMillis();
//            new URL(url).openStream().close(); // open URL
//            long end = System.currentTimeMillis();
//            System.out.println("Response Time: " + (end - start) + " ms");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



//        String urlString = "https://www.pubg.com";
//
//        try {
//            HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
//            conn.setRequestMethod("HEAD");
//            conn.connect();
//
//            int code = conn.getResponseCode();
//            String message = conn.getResponseMessage();
//
//            System.out.println("Response: " + code + " " + message);
//
//            conn.disconnect();
//        } catch (Exception e) {
//            System.out.println("Invalid URL or connection error");
//        }



//        try {
//            URL url = new URL("http://www.google.com");
//            URLConnection conn = url.openConnection();
//
//            InputStream in = conn.getInputStream();
//            int count = 0;
//            while (in.read() != -1) { // read byte by byte
//                count++;
//            }
//            in.close();
//
//            System.out.println("Content Length: " + count);
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }



//        try {
//            URL url = new URL("http://www.google.com"); // URL to check
//            URLConnection conn = url.openConnection();
//
//            // Get content type
//            String contentType = conn.getContentType(); // e.g., text/html; charset=UTF-8
//            String encoding = conn.getContentEncoding(); // usually null if not set
//
//            // If charset is in contentType, extract it
//            String charset = "UTF-8"; // default
//            if (contentType != null && contentType.contains("charset=")) {
//                charset = contentType.substring(contentType.indexOf("charset=") + 8);
//            }
//
//            System.out.println("Content-Type: " + contentType.split(";")[0]);
//            System.out.println("Encoding: " + charset);
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }





//        try {
//            URL url = new URL("http://www.google.com");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//
//            // Print response code
//            System.out.println("Response code: " + conn.getResponseCode());
//
//            // Print HTML content
//            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            br.close();
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }




//        try {
//            URL url = new URL("http://www.google.com");
//            URLConnection conn = url.openConnection();
//            conn.connect();
//
//            for (int i = 0; ; i++) {
//                String key = conn.getHeaderFieldKey(i);
//                String value = conn.getHeaderField(i);
//                if (key == null && value == null) break;
//                if ("Set-Cookie".equalsIgnoreCase(key)) {
//                    System.out.println("Cookie: " + value);
//                }
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }




//        try {
//            // Simulated server URL
//            URL url = new URL("http://example.com/upload");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("POST");
//            conn.setDoOutput(true);
//
//            // Simulate sending a file (here just writing text)
//            OutputStream out = conn.getOutputStream();
//            out.write("This is a test file content".getBytes());
//            out.flush();
//            out.close();
//
//            // Simulate server response
//            int responseCode = 200; // normally you get this from conn.getResponseCode()
//            if (responseCode == 200) {
//                System.out.println("Server confirms upload.");
//                System.out.println("Client prints \"File uploaded successfully\".");
//            } else {
//                System.out.println("Upload failed. Server response code: " + responseCode);
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }




//        try {
//            URL url = new URL("http://www.google.com");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//
//            // Set low timeout (1 ms) to force a timeout error
//            conn.setConnectTimeout(1000); // 1 second for connection
//            conn.setReadTimeout(1);       // 1 millisecond for reading to force timeout
//
//            // Try to read response
//            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            br.close();
//
//        } catch (SocketTimeoutException e) {
//            System.out.println("Timeout occurred: " + e.getMessage());
//        } catch (IOException e) {
//            System.out.println("IO Error: " + e.getMessage());
//        }






    }
}