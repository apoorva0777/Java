package String;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tonyy");
        System.out.println(sb.charAt(1));
        sb.setCharAt(1,'p');
        System.out.println(sb);
        sb.insert(0,'K');
        System.out.println(sb);

    }
}
