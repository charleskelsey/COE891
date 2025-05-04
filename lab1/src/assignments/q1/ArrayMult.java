package assignments.q1;

public class ArrayMult {
	public int[] mult (int[] array1, int[] array2) {
		int minLen = Math.min(array1.length, array2.length);
        int maxLen = Math.max(array1.length, array2.length);
        int[] longArray = array1.length > array2.length ? array1 : array2;
        int[] outArray = new int[maxLen];

        // Point-wise multiplication for the overlapping part
        for (int i = 0; i < minLen; i++) {
            outArray[i] = array1[i] * array2[i];
        }

        // Copy remaining elements from the longer array
        for (int j = minLen; j < maxLen; j++) {
            outArray[j] = longArray[j];
        }

        return outArray;
	}
}
