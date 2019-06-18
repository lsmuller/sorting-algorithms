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

![Quick Sort](https://www.geeksforgeeks.org/wp-content/uploads/gq/2014/01/QuickSort2.png)

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
Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. The merge() function is used for merging two halves. The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. See following C implementation for details.

The following diagram from wikipedia shows the complete merge sort process for an example array {38, 27, 43, 3, 9, 82, 10}. If we take a closer look at the diagram, we can see that the array is recursively divided in two halves till the size becomes 1. Once the size becomes 1, the merge processes comes into action and starts merging arrays back till the complete array is merged.

![Merge Sort](https://www.geeksforgeeks.org/wp-content/uploads/Merge-Sort-Tutorial.png)

**Time Complexity:** Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.
T(n) = 2T(n/2) + \Theta(n)
The above recurrence can be solved either using Recurrence Tree method or Master method. It falls in case II of Master Method and solution of the recurrence is \Theta(nLogn).
Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array in two halves and take linear time to merge two halves.  
**Auxiliary Space:** O(n)  
**Algorithmic Paradigm:** Divide and Conquer  
**Sorting In Place:** No in a typical implementation  
**Stable:** Yes  
**Applications of Merge Sort**
1. Merge Sort is useful for sorting linked lists in O(nLogn) time.In case of linked lists the case is different mainly due to difference in memory allocation of arrays and linked lists. Unlike arrays, linked list nodes may not be adjacent in memory. Unlike array, in linked list, we can insert items in the middle in O(1) extra space and O(1) time. Therefore merge operation of merge sort can be implemented without extra space for linked lists.
In arrays, we can do random access as elements are continuous in memory. Let us say we have an integer (4-byte) array A and let the address of A[0] be x then to access A[i], we can directly access the memory at (x + i*4). Unlike arrays, we can not do random access in linked list. Quick Sort requires a lot of this kind of access. In linked list to access i’th index, we have to travel each and every node from the head to i’th node as we don’t have continuous block of memory. Therefore, the overhead increases for quick sort. Merge sort accesses data sequentially and the need of random access is low.
2. Inversion Count Problem
3. Used in External Sorting

## Selection Sort
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1. The subarray which is already sorted.
2. Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. Following example explains the above steps:

arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]  
// and place it at beginning  
11 25 12 22 64  

// Find the minimum element in arr[1...4]  
// and place it at beginning of arr[1...4]  
11 12 25 22 64  

// Find the minimum element in arr[2...4]  
// and place it at beginning of arr[2...4]  
11 12 22 25 64  

// Find the minimum element in arr[3...4]  
// and place it at beginning of arr[3...4]  
11 12 22 25 64   

**Time Complexity:** O(n2) as there are two nested loops.  
**Auxiliary Space:** O(1)
The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.  
**Stability:** The default implementation is not stable. However it can be made stable. Please see stable selection sort for details.  
**In Place:** Yes, it does not require extra space.

## Insert Sort

## Heap Sort

