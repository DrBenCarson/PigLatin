import java.util.Scanner;


public class PigLatin {
	
public void translateMethod(String ww)
{
	String vv=ww.toLowerCase();
	String xyz[]=vv.split(" ");
	for (int aa=0;aa<xyz.length;aa++)
	{
		if ((xyz[aa].substring(0,1).equals("a"))||(xyz[aa].substring(0, 1).equals("e"))||(xyz[aa].substring(0, 1).equals("o"))||(xyz[aa].substring(0, 1).equals("u"))||(xyz[aa].substring(0, 1).equals("i")))
				{
					System.out.print((xyz[aa]+"yay")+" ");
				}
		else
		{
			for (int bb=1;bb<xyz[aa].length();bb++)
			{
				if ((xyz[aa].substring(bb,(bb+1)).equals("a"))||(xyz[aa].substring(bb,(bb+1)).equals("e"))||(xyz[aa].substring(bb,(bb+1)).equals("o"))||(xyz[aa].substring(bb,(bb+1)).equals("u"))||(xyz[aa].substring(bb,(bb+1)).equals("y"))||(xyz[aa].substring(bb, (bb+1)).equals("i")))
						{
							System.out.print(((xyz[aa].substring(bb,xyz[aa].length())+(xyz[aa].substring(0,bb)+"ay")))+ " ");
							break;
						}
				else
				{
					continue;
				}
			}
		}
	
	
	}
	
}
}
