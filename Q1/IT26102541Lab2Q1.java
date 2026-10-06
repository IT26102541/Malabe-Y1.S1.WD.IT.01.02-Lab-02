public class IT26102541Lab2Q1 {
	
	public static void main (String[] args){
		
		int perimeter = 100; // Given perimeter of the fence 
		double length;
		double width;
		
		// width to length ratio: 
		double width_ratio = 0.75;
		
		// calculate the length and width
		
		//using the formula : perimeter = 2 * (length + width)
		//substitute width = width ratio * length
		//100 = 2 * (length + (width_ratio * length) )
		//100 = 2 * length * (1 * width_ratio)
		//length = 100 / 2 * (1 + width_ratio)
		
		length = perimeter / (2 * (1 + width_ratio));
		width = width_ratio * length;
	
	System.out.println("Width of the fence is :" + width);
	System.out.println("length of the fence is : " + length);
	
	}
}