import java.util.*;

class swapnibble {
	
static int swapNibbles(int x)
{
	return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
}

public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    

	int x = sc.nextInt();
	System.out.print(swapNibbles(x));
}
}


