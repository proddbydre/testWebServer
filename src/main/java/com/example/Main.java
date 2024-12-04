package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ServerSocket ss = new ServerSocket(3000);

        do {
            Socket s0 = ss.accept();

            MioThread t1 = new MioThread(s0);
            t1.start();
            
            Thread.currentThread().sleep(2000);
        } while (true);

    }
}