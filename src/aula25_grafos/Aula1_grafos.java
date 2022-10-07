package aula25_grafos;

public class Aula1_grafos {
    
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Inicio");
        grafo.adicionarVertice("Meio");
        grafo.adicionarVertice("Fim");
        grafo.adicionarVertice("!");
        grafo.adicionarVertice("F");
        
        grafo.adicionarAresta(2.0, "Inicio", "Meio");
        grafo.adicionarAresta(3.0, "Meio", "!");
        grafo.adicionarAresta(1.0, "!", "Fim");
        grafo.adicionarAresta(1.0, "Inicio", "Fim");
        grafo.adicionarAresta(3.0, "F", "Inicio");
        grafo.adicionarAresta(2.0, "F", "Meio");
        
        
        grafo.buscaEmLargura();
    }
    
}
