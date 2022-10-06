class Command_line_arguments
{
	public static void main(String args[]){
		int i;
		for(i=0 ; i<args.length ; i++){
			System.out.println(args[i]);
		}
		System.out.println(args.length);
	}
}