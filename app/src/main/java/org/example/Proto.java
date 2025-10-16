package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.net.URL;

public class Proto {
    public String urlName;
    public String fileName;


    public String[] readURLfromFileName(String fileName) {
        ArrayList<String> tmpStore=new ArrayList<>();
        try {
            Scanner scanner =new Scanner(new File(fileName));
            while (scanner.hasNextLine()){
                tmpStore.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return tmpStore.toArray(new String[0]);
    }

    static String setURLcontext(String urlName) throws IOException {
        URL url;
        url = new URL(urlName);
        byte[] buff;
        try (InputStream input = url.openStream()) {
            buff = input.readAllBytes();
        }
        String str=new String(buff);
        System.out.println(str);
        return str;
    }

}
