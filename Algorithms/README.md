## Results from sorting and searching

#### Bubble Sort: O(n^2)

Took 405 seconds to run

#### Insertion Sort: O(n^2)

Took 390 seconds to run

#### Python's Sorted: O(nlogn)

Took 0.016 seconds to run

#### Linear Search: O(n)

Took 0.003 seconds to run

#### Binary Search + Sorted: O(nlogn + logn)

Took 0.001 seconds to run

## Questions

#### Q: Complete a computational complexity analysis of each of your own sorting algorithms and also compare it to the built-in .sort() function 
(figure out which one runs faster, why, when, etc.).

#### A: Python's bulit-in sort is a combination of merge sort and insertion sort. Merge sort has a worst case time complexity of O(nlogn), in comparasion to the other two sorts with a time complexity of n^2. If we took 100,000 objects, it would be almost 6000 times faster. For large arrays merge sort is signicantlly faster than insertion sort, but for small arrays, insertion sort can keep up. Tim sort solves this problem by using merge sort for larger arrays only. Now for the other two sorts, insertion sort has a best-case of O(n) when everything is sortedsince it is just a linear scan, where as bubble sort is always O(n^2). Nevertheless, insertion sort will always do fewer sorts than bubble because it checks if the elements are sorted at the moment instead of mindlessly comparing elements.

#### Q: What do you notice about the searches that have the thin bars vs. those with the thicker bars?

#### A: More efficent algorithms such as merge and quick sort use thinner bars than bubble and insertion sort because they can sort more elements in the same time as the other algorithms can.

#### Q: Why would someone make this video?

#### A: The video shows the differences between an efficent algorithm and an inefficent algorithm both visually and aurually rather than see a computer return the time taken to #### run

#### Q: How could this video be skewed to show something that is incorrect?
 
#### A: Some algorithms such as quicksort has a worst case scenerio of O(n^2) when the elements are sorted in reverse, whereas insertion sort has a best case scenerio of O(n) if the items are already sorted. This does not accurately portary the efficency of either sorts since it is a rare case that this happens.

#### Q:Complete a computational complexity analysis of each of the searching algorithms. One part of this analysis should include a comparison between using linear search and using binary search + .sort().

#### A: Binary search is slower than linear search because sorting slows down the search. This is especially true in small arrays where our O(logn) is roughly similar to n. However, if we need to run multiple searches, we only need to sort once, then each search is much faster than just linear search is.

#### Q: What are some common pitfalls of recursion?

#### A: One pitfall is not defining a base case that breaks so we may get stuck in an infinite loop, that leads to stack overflow.

#### Q: What issues did you run into during your development of the below algorithms?

#### A: One issue I ran into was returning a recursive function with the correct parameter for calculating the digit sum
