package leetcode735;

import java.util.Stack;

public class ham {
	public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int topAsteroid = stack.pop();
                if (Math.abs(topAsteroid) > Math.abs(asteroid)) {
                    asteroid = topAsteroid;
                } else if (Math.abs(topAsteroid) == Math.abs(asteroid)) {
                    asteroid = 0;
                    break;
                }
            }

            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

}




