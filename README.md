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

Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

Auxiliary Space: O(1)

## Quick Sort
Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.

1. Always pick first element as pivot.  
2. Always pick last element as pivot (implemented below)  
3. Pick a random element as pivot.  
4. Pick median as pivot.  

The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.

![Quick Sort](www.geeksforgeeks.org/wp-content/uploads/gq/2014/01/QuickSort2.png)


### Analysis of QuickSort

The first two terms are for two recursive calls, the last term is for the partition process. k is the number of elements which are smaller than pivot.
The time taken by QuickSort depends upon the input array and partition strategy. Following are three cases.

Worst Case: The worst case occurs when the partition process always picks greatest or smallest element as pivot. If we consider above partition strategy where last element is always picked as pivot, the worst case would occur when the array is already sorted in increasing or decreasing order. Following is recurrence for worst case.
The solution of above recurrence is \theta(n²).

Best Case: The best case occurs when the partition process always picks the middle element as pivot. Following is recurrence for best case.
The solution of above recurrence is \theta(nLogn). It can be solved using case 2 of Master Theorem.

Average Case:
To do average case analysis, we need to consider all possible permutation of array and calculate time taken by every permutation which doesn’t look easy.
We can get an idea of average case by considering the case when partition puts O(n/9) elements in one set and O(9n/10) elements in other set. Following is recurrence for this case.

 T(n) = T(n/9) + T(9n/10) + \theta(n)
Solution of above recurrence is also O(nLogn)
## Merge Sort

## Heap Sort

## Select Sort

## Insert Sort