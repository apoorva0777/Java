public class typecasting {
    public static void main(String[] args) {
        int n=390;
        String s=String.valueOf(n);
        System.out.println(s);

        String a="123";
        int b=Integer.parseInt(a);
        System.out.println(b);

        String ap="APOORVA";

        char[] g=ap.toCharArray();
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");
        }
    }
}
