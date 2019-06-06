# Sorting Algorithms

## Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.  
Example:  
First Pass:  
( __5__ __1__ 4 2 8 ) –> ( __1__ __5__ 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.  
( 1 __5__ 4____ 2 8 ) –>  ( 1 __4__ __5__ 2 8 ), Swap since 5 > 4  
( 1 4 __5__ __2__ 8 ) –>  ( 1 4 __2__ __5__ 8 ), Swap since 5 > 2  
( 1 4 2 __5__ __8__ ) –> ( 1 4 2 __5__ __8__ ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.  

Second Pass:  
( __1__ __4__ 2 5 8 ) –> ( __1__ __4__ 2 5 8 )  
( 1 __4__ __2__ 5 8 ) –> ( 1 __2__ __4__ 5 8 ), Swap since 4 > 2  
( 1 2 __4__ __5__ 8 ) –> ( 1 2 __4__ __5__ 8 )  
( 1 2 4 __5__ __8__ ) –>  ( 1 2 4 __5__ __8__ )  
Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.  

Third Pass:  
( __1__ __2__ 4 5 8 ) –> ( __1__ __2__ 4 5 8 )  
( 1 __2__ __4__ 5 8 ) –> ( 1 __2__ __4__ 5 8 )  
( 1 2 __4__ __5__ 8 ) –> ( 1 2 __4__ __5__ 8 )  
( 1 2 4 __5__ __8__ ) –> ( 1 2 4 __5__ __8__ )  

## Quick Sort

## Merge Sort

## Heap Sort

## Select Sort

## Insert Sort