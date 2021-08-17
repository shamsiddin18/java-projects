package com.javaonline.sort;

import java.io.*;
public class MergeSort {
   private static Comparable[] aux;
     public static void sort(Comparable[] a){

         aux=new Comparable[a.length];
         sort(a,0,a.length-1);


     }



     private static void sort(Comparable[] a,int lo, int hi){
         if(hi<=lo) return;
         int mid=lo+(hi-lo)/2;
         sort(a,lo,mid);
         sort(a,mid+1,hi);
         merge(a,lo,mid,hi);




     }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
         int j=mid+1; int i=lo;
         for(int k=lo;k<=hi;k++)
             aux[k]=a[k];
         for( int k=lo; k<=hi;k++)
             if( j>mid)  a[k]=aux[j++];
             else if (j>hi) a[k]=aux[i++];
             else if(less(aux[j], aux[i]))  a[k]=aux[j++];
             else a[k]=aux[i++];
    }

    private static boolean less(Comparable aux, Comparable aux1) {
         return aux.compareTo(aux1)<0;

    }


 //   public void main (String[] args){
       //  String a[]={"M","E","R","G","T"};

   // }
}

