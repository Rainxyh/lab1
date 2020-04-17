package webadv.xyh17201123.lab1;

import org.apache.commons.codec.digest.DigestUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
/*
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        System.out.println(sha256hex(args[0]));*/
	String enterusername,enterpassword;
    	enterusername=enterpassword="";
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Plz enter the username:");
    	enterusername= in.nextLine();
    	System.out.println("Plz enter the password:");
    	enterpassword= in.nextLine();
    	
    	String realpassword="";
    	realpassword=sha256hex(enterusername);
//System.out.println(realpassword);
    	if(enterpassword.equals(realpassword)){
			System.out.println("You are right");
		}
		else {
			System.out.println("Wrong password!");
		}


    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}