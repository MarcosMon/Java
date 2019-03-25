package org.lasencinas.Server.Servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.*;

public class Server 
{
   private ServerSocket serverSocket;
   private Socket socket;
   private BufferedReader bufferEntrada;
   private OutputStream bufferSortida;
   
   public void connectar (int port) {
       try {
       serverSocket = new ServerSocket(port);
       System.out.println("Esperando conexión....");
       socket=serverSocket.accept();
       System.out.println("Conexión establecida con: " + socket.getInetAddress());
       } catch (Exception e) {
	   System.out.println("Error a conectar: " + e.getMessage());
       }
       
   }
   public void canals() {
       try {
       bufferEntrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
       bufferSortida = socket.getOutputStream();
       bufferSortida.flush();
   }catch (Exception e) {
       System.out.println("Error a canals: " + e.getMessage());
   }
   }
   
   public void rebre() {
       String input;
       try {
	   do {
	       input = bufferEntrada.readLine();
	       System.out.println(input);
	   }while(input.isEmpty());
       }catch (Exception e) {
	   System.out.println("Error a rebre: " + e.getMessage());
	   
       }
   }
   public void enviar() {
       String web = "HTTP/1.1 200 OK\\nContent-Type: text/html; charset=UTF-8\\n\\n<html>hola"  + socket.getInetAddress().getHostName() + "</html>";
	try {
	    bufferSortida.write(web.getBytes());
	    System.out.println("Enviando: \n\n" + web );
	    bufferSortida.flush();
	}catch(Exception e) {
	    System.out.println("Error al enviar " + e.getMessage());
	}
   }
   public void tancar() {
       try {
	   serverSocket.close();
	   socket.close();
	   bufferEntrada.close();
	   bufferSortida.close();
       } catch(Exception e) {
	   System.out.println("Error a tancar: " + e.getMessage());
       }
   }
   public void runServidor(int port ) {
       while (true) {
	   try {
	       connectar(port);
	       canals();
	       rebre();
	       enviar();
	   }catch(Exception e) {
	       System.out.println("Error a runServior: " + e.getMessage());
	   }finally {
	       tancar();
	   }
       }
   }
   
       public static void main( String[] args ){
	        Scanner teclat = new Scanner (System.in);
	        Server s = new Server();
	        System.out.println("Introdueix el port:  ");
	        int port = teclat.nextInt();
	        teclat.close();
	        while(true){
	            s.runServidor(port);
	        } 

   }
}
