import java.util.LinkedList;

class Question{
    public enum State{

        Unvisited,Visiting,Visited;
    }
    public static boolean find(Graph g,Node start,Node end){
        for(Node n:g.getNodes()){
            n.state = State.Unvisited;
        }

        LinkedList<Node> queue = new LinkedList<Node>();
        
        queue.add(start);
        start.state = State.Visiting;
        while(!queue.isEmpty()){
            Node n = queue.remove();
            if(n!=null){
                for(Node a:n.getAdjacent()){
                    if(a.state==State.Unvisited){
                        if(a==end)
                            return true;
                        else{
                            a.state = State.Visiting;
                            queue.add(a);
                        }
                    }
                n.state = State.Visited;
                }
            }
        }
        return false;
    }
}
