public class regex {
    public static void main(String[] args){
        String s="abSCG345@#$fkd4f%";
        int n=s.length();
        String g=s.replaceAll("[^a-zA]","");
        System.out.println(g);
    }
}
