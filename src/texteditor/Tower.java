package texteditor;

public class Tower {
 public static void main(String[] args) {
	 String name = "Zachary Beecher";
	 int rowsInTower = rowsInTower(name);
	 String upperCaseName = convertToUppercase(name);
	 String[] rows = splitName(upperCaseName, rowsInTower);
	 
	 for(int row = 0; row < rows.length; row++) {
		 int spaces = getSpaces(row, rowsInTower);
		 string indent = "";
		 while(spaces-- > 0) {
			 indent += " ";
		 }
		 System.out.println(indent + rows[row]);
	 }
 }

private static int getSpaces(int row, int rowsInTower) {
	return rowsInTower - row -1;
}

private static String[] splitName(String upperCaseName, int rowsInTower) {
	// TODO Auto-generated method stub
	return null;
}

private static String convertToUppercase(String name) {
	// TODO Auto-generated method stub
	return null;
}

private static int rowsInTower(String name) {
	// TODO Auto-generated method stub
	return 0;
}
 
}
