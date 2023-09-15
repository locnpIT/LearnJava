package leetcode735;

public class xuli {

	public static void main(String[] args) {
		ham xuly = new ham();
		int[] asteroids = {5,10,-5};
        int[] result = xuly.asteroidCollision(asteroids);

        // In kết quả
        System.out.print("Kết quả: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
	}

}
