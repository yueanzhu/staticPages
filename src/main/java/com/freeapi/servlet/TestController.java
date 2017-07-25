package com.freeapi.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/8/29.
 */

@Controller
@RequestMapping(value = "/Test/*") //���ʵ�url��ַǰ׺�����Բ�д��д�˾ͱ����ڷ���urlǰ���ȼ���class url �������ֿ�����
public class TestController
{
    //���ʵ�ַ��http://localhost:8080/Test/returnSuccess
    @RequestMapping(value = "returnSuccess")    //ʵ�ʷ��ʵ�url��ַ
    public String returnSuccess() {
        return "/Views/success";    //����Views�ļ����µ�success.jspҳ��
    }

    //���ʵ�ַ��http://localhost:8080/Test/returnString
    @RequestMapping(value = "returnString", produces = {"text/plain;charset=UTF-8"})
    //produces���ڽ�����������������⣬application/json;Ϊjson�����������
    @ResponseBody       //���ڷ����ַ���,��д��������ͼ
    public String returnString() {
        return "hello return string �������ģ���û������";
    }
}