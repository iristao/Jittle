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



  
