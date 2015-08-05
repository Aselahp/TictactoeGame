/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DJ
 */
public class Network {
    
    PrintStream output;
    BufferedReader input;
    Socket sock1;
    Socket sock2;
    ServerSocket server;
    BufferedReader serverInput;
    BufferedReader clientInput;
        
    public void startServer()throws Exception{
        
        server = new ServerSocket(10010);
        sock1 = server.accept();
        input = new BufferedReader(new InputStreamReader(sock1.getInputStream()));
        output = new PrintStream(sock1.getOutputStream());
        serverInput = new BufferedReader(new InputStreamReader(System.in));
        String line;
    }
    
    public void startClient(String serverIp)throws Exception{
        String ip = serverIp;
        sock2 = new Socket(ip,10010);
        input = new BufferedReader(new InputStreamReader(sock2.getInputStream()));
        output = new PrintStream(sock2.getOutputStream());
        clientInput = new BufferedReader(new InputStreamReader(System.in));
        String line;
    
    }
    
    public void sendMessege(String msg){
        String sendingMsg = msg;
        output.println(msg);
        output.flush();
    }
     
    public String recieveMessege() throws IOException{
        String recievingMsg;
        recievingMsg = input.readLine();
        return recievingMsg;               
    }
    
    
    
}
