import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)<='Z'&&s1.charAt(i)>='A'){
                    if(s1.charAt(i)!='Z'){
                        char c=(char)((int)s1.charAt(i)+33);
                        sb.append(c);
                    }else{
                        sb.append('a');
                    }
                }else if(s1.charAt(i)<='z'&&s1.charAt(i)>='a'){
                    if(s1.charAt(i)!='z'){
                        char c=(char)(s1.charAt(i)-32+1);
                        sb.append(c);
                    }else{
                        sb.append('A');
                    }
                }else if(s1.charAt(i)<='9'&&s1.charAt(i)>='0'){
                    if(s1.charAt(i)!='9'){
                        char c=(char)(s1.charAt(i)+1);
                        sb.append(c);
                    }else{
                        sb.append('0');
                    }
                }else{
                    sb.append(s1.charAt(i));
                }
            }
            //解密
            StringBuilder sd=new StringBuilder();
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i)<='Z'&&s2.charAt(i)>='A'){
                    if(s2.charAt(i)!='A'){
                        char c=(char)(s2.charAt(i)+32-1);
                        sd.append(c);
                    }else{
                        sd.append('z');
                    }
                }else if(s2.charAt(i)<='z'&&s2.charAt(i)>='a'){
                    if(s2.charAt(i)!='a'){
                        char c=(char)(s2.charAt(i)-32-1);
                        sd.append(c);
                    }else{
                        sd.append('Z');
                    }
                }else if(s2.charAt(i)<='9'&&s2.charAt(i)>='0'){
                    if(s2.charAt(i)!='0'){
                        char c=(char)(s2.charAt(i)-1);
                        sd.append(c);
                    }else{
                        sd.append('9');
                    }
                }else{
                    sd.append(s2.charAt(i));
                }
            }
            System.out.println(sb.toString());
            System.out.println(sd.toString());
        }
    }
}
