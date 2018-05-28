import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Queue<Integer> nodes = new LinkedList<>();

        boolean [] visited = new boolean[rooms.size()];

         nodes.add(0);

        while (!nodes.isEmpty()){
            
            int node = nodes.poll();

            if (!visited[node]) {
                visited[node] = true;
                for (int value : rooms.get(node)) {
                    if (!visited[value]){
                        nodes.add(value);
                    }
                }
            }
        }
        boolean state = true;
        for (boolean v: visited ) {
            state = state && v;
            if (!state)
                break;
        }
        return  state;
    }

}
