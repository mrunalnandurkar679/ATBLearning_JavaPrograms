package Condiational_Programs;

import java.util.Scanner;

public class Lab08_SwitchRealTime_Ex08 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the browser name : ");
        String browser = scan.next().toLowerCase();
        browserUse(browser);
    }
    static void browserUse(String browser)
    {
        switch (browser)
        {
            case "chrome":
                System.out.println("Execute test cases for Chrome browser");
                break;
            case "edge":
                System.out.println("Execute test cases for edge browser");
                break;
            case "firefox":
                System.out.println("Execute test cases for Firefox browser");
                break;
            default:
                System.out.println("Browser is not allowed");
        }

    }
}
