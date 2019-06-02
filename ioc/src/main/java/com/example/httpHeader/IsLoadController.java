package com.example.httpHeader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 判断数据是否需要下载的请求类Controller
 */
@RestController
public class IsLoadController {

    @RequestMapping(value="/load",method = RequestMethod.GET)
    public void load(HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();

        response.setHeader("content-Type", "application/kdsjflk");
        // 下载文件的默认名称
        try {
            response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode("周小龙真帅.txt", "utf-8"));
            outputStream.write(new String("周小龙真帅").getBytes());
        } catch (Exception e) {
            outputStream.write(new String("周小龙真帅").getBytes());
        }
    }

    @RequestMapping(value="/load2",method = RequestMethod.GET)
    public String load2(HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();

        //response.setHeader("content-Type", "application/kdsjflk");
        // 下载文件的默认名称
        try {
            //response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode("周小龙真帅.txt", "utf-8"));
            outputStream.write(new String("周小龙真帅").getBytes());
        } catch (Exception e) {
            outputStream.write(new String("周小龙真帅").getBytes());
        }

        return "load";
    }

    @RequestMapping(value="/load3",method = RequestMethod.GET)
    public String load3(HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();

        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称
        try {
            //response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode("周小龙真帅.txt", "utf-8"));
            outputStream.write(new String("周小龙真帅").getBytes());
        } catch (Exception e) {
            outputStream.write(new String("周小龙真帅").getBytes());
        }

        return "load";
    }

    @RequestMapping(value="/load4",method = RequestMethod.GET)
    public String load4(HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();

        //response.setHeader("content-Type", "application/kdsjflk");
        // 下载文件的默认名称
        try {
            response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode("周小龙真帅.txt", "utf-8"));
            outputStream.write(new String("周小龙真帅").getBytes());
        } catch (Exception e) {
            outputStream.write(new String("周小龙真帅").getBytes());
        }

        return "load";
    }

    @RequestMapping(value="/load5",method = RequestMethod.GET)
    public String load5(HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();

        response.setHeader("content-Type", "application/kdsjflk");
        // 下载文件的默认名称
        try {
            response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode("周小龙真帅.txt", "utf-8"));
            outputStream.write(new String("周小龙真帅").getBytes());
        } catch (Exception e) {
            outputStream.write(new String("周小龙真帅").getBytes());
        }

        return "load";
    }

    @RequestMapping(value="/load6",method = RequestMethod.GET)
    public String load6(HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();

        response.setHeader("content-Type", "application/text");
        // 下载文件的默认名称
        try {
            response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode("周小龙真帅.txt", "utf-8"));
            outputStream.write(new String("周小龙真帅").getBytes());
        } catch (Exception e) {
            outputStream.write(new String("周小龙真帅").getBytes());
        }

        return "load";
    }
}
