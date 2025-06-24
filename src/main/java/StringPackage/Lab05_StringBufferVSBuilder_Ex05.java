package StringPackage;

public class Lab05_StringBufferVSBuilder_Ex05 {

        public static void main(String[] args) {
            String s0 = "Pramod";
            String s1 = new String("Pramod");

            StringBuffer stringBuffer = new StringBuffer("Pramod");
            StringBuilder stringBuilder = new StringBuilder("Pramod");



            System.out.println(s0);
            System.out.println(s1);
            System.out.println(stringBuffer);
            System.out.println(stringBuilder);
        }
    }

