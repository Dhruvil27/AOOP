public class Displayarguments
{
	public static void main(String[] args)
	{
	if(args.length==0)
	System.out.println("Enter Arguments");
	for(int i=0; i<args.length; i++)
	System.out.println("args[" + i+"]: " + args[i]);
	}
}