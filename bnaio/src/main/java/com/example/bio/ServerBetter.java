package com.example.bio;

import java.io.IOException;

/**
 * 服务器启动的外壳
 */
public class ServerBetter implements Runnable {



    @Override
    public void run() {
        try {
            ServerNormal.start();
        } catch (IOException e) {
            System.out.println("服务器启动失败");
        }
    }
}

