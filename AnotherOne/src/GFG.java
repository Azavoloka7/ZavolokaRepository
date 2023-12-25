class GFG {
    @SuppressWarnings("removal")
	public static void main(String[] args)
    {
 
        // first example
        Double f1 = new Double(-1.0 / 0.0);
 
        boolean res = f1.isInfinite();
 
        // printing the output
        if (res)
            System.out.println(f1 + " is infinity");
       
        else
            System.out.println(f1 + " is not infinity");
    }
}