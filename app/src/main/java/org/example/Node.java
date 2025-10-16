package org.example;

import java.util.Locale;

public class Node {
    final static String[]  protocols={"http:","ftp:","https:"};
    public String protocolName;
    public Integer port;
    public String hostName;
    public String domainZone;
    public String url;
    public String params;
    public String uncors;

    public Node(String adrResource) {
        this.port = 443;
        String lowerCase = adrResource.toLowerCase(Locale.ROOT);
        String[] nodes = lowerCase.split(".");

        if (adrResource.length() > 14) {
            //DEBUG INFO
            System.out.println("[DEBUG]-all is OK! ");
            int fl = defineProtocol(lowerCase);
            //DEBUG INFO
            if(fl>7) {
                System.out.println("Error of url in defining proto!");
                System.out.println(fl);
            }
        }
    }

    public static int defineProtocol(String tmp){
        int flag=0;
        for (String argProto:protocols){
            flag=tmp.indexOf(argProto);
        }
        //DEBUG INFO
        System.out.println(flag);
        return flag;
    }

    public int getPort(String tmp){
        return 22;
    }

}
