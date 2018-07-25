package com.deloitte.cui;
 

	class Point{
			public int x; 
			public int y;
		}
	public class ReferenceArrays {
		public static void main(String[] args) {
			Point [] points;
	
			points = new Point[5];
			
			points[0] = new Point();
			points[0].x = 1;
			points[0].y = 2;
			points[2] = new Point();
			points[2].x = 5;
			points[2].y = 6;
			points[4] = new Point();
			points[4].x = 9;
			points[4].y = 10;
	
	for(Point point: points) {
		if(point != null)
			System.out.println(point.x +"and"+point.y);
	}
	}
	
}

