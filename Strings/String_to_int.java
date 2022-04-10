class String_to_int
{
	public static void main(String args[]){
		int i, sum= 0;
		for(i=0 ; i<args.length ; i++){
			sum += Integer.parseInt(args[i]);	//converts string value to integer
		}
		System.out.println(sum);
	}
	/* To convert string value to integer we have to use the method 
	Integer.parseInt()
	*/
}
