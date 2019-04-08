
package encryption_1.pkg0;

import java.util.Random;

/**
 *
 * @author V!vek Kumar
 */
public class String_Change {
    
    private static int random;
    public static String encrypt1(String s)
    {
        char c[]=s.toCharArray();
        c=rotateRight(c);
        c=addNumber(c);
        s=new String(c);
        return s;
    }
    public static String decrypt1(String s)
    {
        char c[]=rotateLeft(s.toCharArray());
        c=reverse_AddNumber(c);
        return (new String(c));
    }
    
    private static char[] rotateRight(char c[])
	{
	
		char t=c[c.length-1];
		
		for(int i=c.length-1;i>0;i--)
		{
			c[i]=c[i-1];
		}
		c[0]=t;
		return c;
	}
    
    
    private static char[] addNumber(char c[])
	{
		Random r=new Random();
		int n[]=new int[c.length];
		
		random=r.nextInt(1000);
		int key=25;								//key to short random
		int t=random/key;
		
		for(int i=0;i<c.length;i++)
		{	
			n[i]=c[i];
			n[i]=n[i]-t;
			c[i]=(char)n[i];
		}
		return c;
	}
    
    private static char[] reverse_AddNumber(char c[])
	{
		int n[]=new int[c.length];
		
		int key=25;								//key to short random
		int t=random/key;
		
		for(int i=0;i<c.length;i++)
		{	
			n[i]=c[i];
			n[i]=n[i]+t;
			c[i]=(char)n[i];
		}
		return c;
	}
    
    	public static char[] rotateLeft(char c[])
	{
	
		char t=c[0];
		
		for(int i=0;i<c.length-1;i++)
		{
			c[i]=c[i+1];
		}
		c[c.length-1]=t;
		return c;
	}
	
    
}
