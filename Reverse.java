//Reverse of a string program
public class Reverse {
    public static void main (String args[])
    {
        String s="hello how are you ?";
        String v[]=s.split(" ");
        String ans="";
        for(String w:v)
        {
            String r="";
            for(int i=w.length()-1;i>=0;i--)
            {
                r=r+w.charAt(i);
            }
            ans=ans+r+" ";
        }
        System.out.println(ans);


    }

}