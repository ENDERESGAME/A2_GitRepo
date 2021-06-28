public class MapTeest1{
	
	// Phase 1 Tests
	public static void main(String[] args){
		// 3 Rows, 4 cols
		Map m1 = new Map(3,4);
		m1.addWalls();
		System.out.println(m1.toString());

		m1.setTile(2,3,'Y');
		System.out.println(m1.toString());

		// INvalid
		m1.setTile(-1,3,'R');
		m1.setTile(2,4,'R');
		m1.setTile(3,3,'R');
		m1.setTile(2,4,'R');

		// Should have no 'R's and not crash
		System.out.println(m1.toString());
	}
}