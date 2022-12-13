//package rus.april.com.solvd.extra.extra5;
//
//import java.util.LinkedList;
//
//public class ExtraTask5 {
//    /**
//     * A function called pairs() takes an array, for example [3,1,8].
//     * It should return all pairs, e.g. for mentioned example: [[3,1],[3,8],[1,8]].
//     * Implement it please
//     */
//    int list[] = new int[]{3, 1, 8, 2};
//
//    LinkedList<LinkedList<Integer>> map = new LinkedList<>();
//
//    LinkedList<Integer> skipList = new LinkedList<>();
//for(
//    int i :list)
//
//    {
//        skipList.add(i);
//        for (int j : list) {
//            LinkedList<Integer> subList = new LinkedList<>();
//            if (i == j) continue;
//            if (skipList.contains(j)) continue;
//            subList.add(i);
//            subList.add(j);
//            if (map.contains(subList)) continue;
//            map.add(subList);
//        }
//    }
//
//System.out.println(map);
//}