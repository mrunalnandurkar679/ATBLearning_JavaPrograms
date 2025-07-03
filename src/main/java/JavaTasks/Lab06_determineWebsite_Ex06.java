package JavaTasks;

import java.util.Scanner;

public class Lab06_determineWebsite_Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String url = scan.next().toLowerCase();

        webSite(url);

    }

    static String webSite(String url) {


            switch (url) {
                case ("example.com"):
                    System.out.println("The website type is: Commercial website");
                    break;
                case ("example.org"):
                    System.out.println(" The website type is: Non-profit organization");
                    break;
                case ("example.edu"):
                    System.out.println("The website type is: Educational institution");
                    break;
                case("example.gov"):
                    System.out.println("The website type is: Government website");
                    break;
                case("example.net"):
                    System.out.println("The website type is: Network-related website");
                    break;
                case("example.info"):
                    System.out.println("The website type is: Informational website");
                    break;
                case("example.xyz"):
                    System.out.println("The website type is: Unknown or other types of websites");
                    break;
                default:
                    System.out.println("not a valid website");

            }


        return url;
        }

    }

