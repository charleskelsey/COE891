package q3;

public class Triclass {
	public static String classify(int x, int y, int z) {
		// Check if the input values are within the valid range (1 to 10)
        if (x < 1 || x > 10 || y < 1 || y > 10 || z < 1 || z > 10) {
            return "Invalid";
        }

        // Check triangle inequality theorem
        if (x + y <= z || y + z <= x || z + x <= y) {
            return "Invalid";
        }

        // Classify the triangle
        if (x == y && y == z) {
            return "Equilateral";
        } else if (x == y || y == z || z == x) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
