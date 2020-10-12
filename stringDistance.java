public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        String s = "eeloveleeetcod";
        String l;
        int m=0;
        while (s.length()>0) {
            System.out.println("m="+m);
            if (s.charAt(0)=="e".charAt(0)) {
                l = "e";
                if(s.length()>1) {
                    s = s.substring(s.indexOf("e")+1);
                } else {
                    s="";
                }
            } else {
                if (s.contains("e")) {
                    l = s.substring(0, s.indexOf("e"));
                    s = s.substring(s.indexOf("e"));
                } else {
                    l=s;
                    s="";
                }
            }
            m+=l.length();
            System.out.println("l="+l+"; s="+s);
        }
     }
}
