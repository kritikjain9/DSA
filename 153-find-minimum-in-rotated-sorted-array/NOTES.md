Only look at the notes if you are stuck for more than 15 minutes.
​
Also, isme sirf do cases issilye banage coz, we only have two cases.
Equality waala case nah hai apne paaas
​
thats why, here it is
​
```
while(lo < hi){
//cases
int mid = (lo + hi) / 2;
if(nums[mid] > nums[hi]){
lo = mid + 1;
}else if(nums[mid] < nums[hi]){
hi = mid;
}
}
return nums[lo];
```