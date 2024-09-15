package com.company;

import java.util.*;

public class secondlargest {
public static void main(String[] args) {
    Integer[] ff= {1,3,65,34,2,234};
List<Integer>  ls = new java.util.ArrayList<>();

for (Integer i : ff) {
    ls.add(i);
}
System.out.println(ls);

Set<Integer> st = new HashSet<>(ls);
System.out.println(st);
TreeSet<Integer> tset = new TreeSet<>(st);
System.out.println(tset);
int k=1;
for (Integer jk : tset) {

    if (k==tset.size()-1) {
        System.out.println(jk);
    }
    k++;
}

}


}
