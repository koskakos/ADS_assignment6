public class Main {




    public static void main(String[] args) {
        WeightedGraph<String> graphW = new WeightedGraph<>(true);

        graphW.addEdge("Almaty", "Astana", 2.1);
        graphW.addEdge("Almaty", "Shymkent", 7.2);
        graphW.addEdge("Shymkent", "Astana", 3.9);
        graphW.addEdge("Astana", "Kostanay", 3.5);
        graphW.addEdge("Shymkent", "Kyzylorda", 5.4);

        System.out.println("Dijkstra:");
        Search<String> djk = new DijkstraSearch<>(graphW, "Almaty");
        outputPath(djk, "Kyzylorda");

        MyGraph<String> graph = new MyGraph<>();

        System.out.println("\n--------------------------------");

        graph.addEdge("Almaty", "Astana");
        graph.addEdge("Almaty", "Shymkent");
        graph.addEdge("Shymkent", "Astana");
        graph.addEdge("Astana", "Kostanay");
        graph.addEdge("Shymkent", "Kyzylorda");


        System.out.println("DFS:");
        Search<String> dfs = new DepthFirstSearch<>(graph, "Almaty");
        outputPath(dfs, "Kyzylorda");
//
        System.out.println("\n--------------------------------");

        System.out.println("BFS:");
        Search<String> bfs = new BreadthFirstSearch<>(graph, "Almaty");
        outputPath(bfs, "Kyzylorda");
    }

    public static void outputPath(Search<String> search, String key) {
        for (String v : search.pathTo(key)) {
            System.out.print(v + " -> ");
        }
    }
}

