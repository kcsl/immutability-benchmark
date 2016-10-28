import java.util.LinkedList;

public class Graph {

	public LinkedList<Node> nodes = new LinkedList<Node>();
	
	public void addNode(Node node){
		if(!nodes.contains(node)){
			nodes.add(node);
		}
	}
	
}
