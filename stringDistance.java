public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        String s = "eeloveleeetcode";
        String l;
        int m=0;
        while (s.length()>0) {
            System.out.println("m="+m);
            if (s.charAt(0)=="e".charAt(0)) {
                l = "e";
                m++;
                if(s.length()>1) {
                    s = s.substring(s.indexOf("e")+1);
                } else {
                    s="";
                }
            } else {
                l = s.substring(0, s.indexOf("e"));
                m+=l.length();
                s = s.substring(s.indexOf("e"));
            }
            
            System.out.println("l="+l+"; s="+s);
        }
     }
}
