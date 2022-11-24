package it.unibo.generics.graph.impl;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import it.unibo.generics.graph.api.Graph;
import it.unibo.generics.graph.api.Helper;

public class GraphImpl <N> implements Graph <N>{

    final private Map<N, List<N>> vertices;

    public GraphImpl(HashMap<N, List<N>> n){
        vertices = n;
    }
    public GraphImpl(){
        vertices = new HashMap<>();
    }

    public void addNode(N node){
        if(node != null){
            for(final N element: vertices.keySet()){
                if (element == node){
                    return;
                }
            }
            vertices.put(node, new ArrayList<>());
        }
        return;
    }

    public void addEdge(N source, N target){
        if(source != null && target != null){
            for(final N element: vertices.get(source)){
                if(element == target){
                    return;
                }
            }
            vertices.get(source).add(target);
        }
        return;
    }

    public Set<N> nodeSet(){
        Set<N> set = new TreeSet<>();
        for(final N element: vertices.keySet()){
            set.add(element);
        }
        return set;
    }

    public Set<N> linkedNodes(N node){
        Set<N> set = new TreeSet<>();
        for(final N element: vertices.get(node)){
            set.add(element);
        }
        return set;
    }
    public List<N> getPath(N source, N target){
        TreeSet<List<N>> frontier = new TreeSet<>(new Helper());
        for(final var element: vertices.get(source)){
            List<N> tmp = new ArrayList<>();
            tmp.add(source);
            tmp.add(element);
            frontier.add(tmp);
        }
        while(!frontier.isEmpty()){
            List<N> tmp = frontier.pollFirst();
            if(target == tmp.get(tmp.size()-1)){
                return tmp;
            }
            int lastpos = tmp.size()-1;
            List<N> tmp2 = new ArrayList<>();
            for(final N element: vertices.get(tmp.get(lastpos))){
                tmp2.clear();
                tmp2.addAll(tmp);
                tmp2.add(element);
                frontier.add(tmp2);
            }
        }
        return null;
    }
}