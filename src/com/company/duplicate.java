package com.company;

public class duplicate {
public static void main(String[] args) {
    Integer[] dup= {33,4,5,6,7,8,93,4,1,2,2,33};

for(int i=0; i<dup.length; i++){
    for(int j=i+1; j<dup.length; j++){
        if (dup[i]==dup[j]) {
            System.out.println("duplicate element is: " + dup[i]);
        }

    }

}



}

}
