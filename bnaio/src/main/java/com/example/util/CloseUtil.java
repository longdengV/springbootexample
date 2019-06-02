package com.example.util;

import java.io.Closeable;

/**
 * 关闭流的工具类
 */
public class CloseUtil {

    /**
     * 关闭流
     * @param cs
     */
    public static void closeStream(Closeable...cs){
        for( Closeable c : cs ){
            if( null != c ){
                try{
                    c.close();
                }catch(Exception e){
                    System.out.println("流关闭异常");
                }
            }
        }
    }
}
