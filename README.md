//====================================
Run-Time Assessment

[worst case: pivot point is at the end of the array]
pvt pos = (length-1)
(each time measurement is the averaged measurement of 10 runs)
  11.6129
  18.983200000000004
  11.547
  13.0912
  13.104199999999997
 
 *Avg of 50 tests: 13.667
 **Runtime = O(n^2)
 
 
 
[best case: pivot point is in the middle of the array]
pvt ps = (d.length -1) / 2 
  6.989399999999999
  8.047
  6.9619
  6.677899999999999
  7.696900000000001

 *Avg of 50 tests: 7.2746
  **Runtime = O(nlog(n))

====================================
Summary of QuickSort algorithm:
 * QSort(arr): quicksort partitions the array into two arrays, one with unsorted values larger than the partition and one with unsorted values smaller than the partition. It then recursively splits those arrays until each array has only one element, which would make it sorted. All these arrays are then recombined into one single sorted array. 
 *
 * 2a. Worst pivot choice / array state and associated runtime: the worst pivot post is 0 or arr.length - 1 because it doesn't split the array evenly and therefore one array must perform more sorts than the other array
 *
 * 2b. Best pivot choice / array state and associated runtime: the best pivot choice is arr.length / 2  because it splits the array into halves that can be then partitioned equally, thereby splitting the work equally 
 *
 * 3. Approach to handling duplicate values in array: it works out naturally. the duplicate is simply put in the next index over.
 


  
