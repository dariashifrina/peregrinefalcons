# PeregrineFalcons
Fabiola Radosav, Daria Shifrina, Henry Zheng

*"The peregrine falcon is the fastest bird, and the fastest member of the animal kingdom with a diving speed of 389 km/h (242 mph)"*

##What Did We do?

We created integer arrays with length 1, 10, 100, etc. up to 1 million. We then found the runtime in nanoseconds it takes to sort through each array with QuickSort. We found out that it takes a long time to sort with 1 million elements in the array, and that the runtime is in the order of n*n. You can view our findings [here](https://docs.google.com/document/d/1Ajeu7IrOKdwcKJIhkmRhsdMT2e3upcmCfhdHlRCp1Fw/pub).

Big-Oh runtime classifications
best case: nlogn
average/most likely case: n*n
worst case: n*n

We figured out that if the data is arranged in a way such that the smaller values are towards the middle it worsens execution time because the pivot will tend towards one of the far ends of the array (either beginning or end). This essentially partitions the array into two arrays, one being a lot smaller in length than the other, which is far from the best case scenario, where the split is perfectly even, allowing for logn time.

Starting off pivot in the middle decreases execution time in comparison to starting off pivot at the extremes. If pivot starts off at an extreme, one of the two partitioned arrays is empty while the second array includes all other elements besides the element at the pivot position, which is the worst case.