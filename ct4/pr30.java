import java.util.ArrayList;
import java.util.List;

public class pr30 {
    public static class CityTrip {
        public static int chooseBestSum(int targetDistance, int numCities, List<Integer> distances) {
            int[] maxDistance = {0};
            findMaxDistance(targetDistance, numCities, distances, 0, 0, maxDistance);
            return maxDistance[0];
        }

        public static void findMaxDistance(int targetDistance, int numCities, List<Integer> distances, int currentIndex, int currentDistance, int[] maxDistance) {
            if (numCities == 0) {
                if (currentDistance <= targetDistance) {
                    maxDistance[0] = Math.max(maxDistance[0], currentDistance);
                }
                return;
            }

            for (int i = currentIndex; i < distances.size(); i++) {
                findMaxDistance(targetDistance, numCities - 1, distances, i + 1, currentDistance + distances.get(i), maxDistance);
            }
        }

        public static void main(String[] args) {
            List<Integer> distances = new ArrayList<>();
            distances.add(50);
            distances.add(55);
            distances.add(57);
            distances.add(58);
            distances.add(60);

            int targetDistance = 175;
            int numCities = 3;

            int maxDistance = chooseBestSum(targetDistance, numCities, distances);
            System.out.println("Максимальное расстояние, которое можно пройти: " + maxDistance);
        }
    }
}