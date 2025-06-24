package StringPackage;

public class Lab06_StringBuffer_Ex06 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mrunal");
        System.out.println(sb);
        sb.append("  Nandurkar");
        System.out.println(sb);
        System.out.println(sb);

        StringBuilder sbuild = new StringBuilder("Mrunal");
        sbuild.deleteCharAt(4);
        System.out.println(sbuild);
    }
}
