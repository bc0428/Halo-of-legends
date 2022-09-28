package levelPackage;

public class LevelShop {
	// 1 -> wall
	// 2 -> normal enemy
	// 3 -> trace enemy
	// 4 -> multi-shooting enemy
	// 6 -> floor
	// 7 -> shops
	// 8 -> shop
	// 9 -> door
	public static int[][] level = {
	//   1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4
			
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,9,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},  // 1
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},  // 2
		{1,1,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,1,1},  // 3
		{1,1,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,0,0,1,1},  // 4
		{1,1,0,0,0,0,0,6,6,0,0,6,6,6,6,6,6,6,6,6,6,6,6,6,6,0,0,0,0,0,0,0,1,1},  // 5
		{1,1,0,0,0,0,0,6,0,0,0,0,0,6,6,6,6,6,6,6,6,0,0,0,6,6,0,0,0,0,0,0,1,1},  // 6
		{1,1,0,0,0,0,0,0,0,7,0,0,0,6,6,6,6,6,6,0,0,8,0,0,0,6,6,0,0,0,0,0,1,1},  // 7
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,6,0,6,6,6,0,0,0,0,0,0,0,6,0,0,0,0,0,1,1},  // 8
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 9
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 0
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 1
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 2
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 3
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 4
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 5
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 6
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 7
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 8
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 9
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 0
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 1
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 2
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 3
		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  // 4
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},  // 5
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},  // 6
		
	};
}
