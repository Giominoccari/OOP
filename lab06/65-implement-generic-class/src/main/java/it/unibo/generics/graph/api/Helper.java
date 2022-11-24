package it.unibo.generics.graph.api;

import java.util.Comparator;

import java.util.List;

public class Helper implements Comparator<List> {
    
    public int compare(List list1, List list2){
  
        List<Object> first_list;
        List<Object> second_list;
  
        first_list = list1;
        second_list = list2;

        return first_list.size() - second_list.size();
    }
}