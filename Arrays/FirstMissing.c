void swap(int *a, int *b)
{
    int temp;
    temp = *a;
    *a   = *b;
    *b   = temp;
}
 
/* Utility function that puts all non-positive (0 and negative) numbers on left 
  side of arr[] and return count of such numbers */
int segregate (int arr[], int size)
{
    int j = 0, i;
    for(i = 0; i < size; i++)
    {
       if (arr[i] <= 0)  
       {
           swap(&arr[i], &arr[j]);
           j++;  // increment count of non-positive integers
       }
    }
 
    return j;
}
 
/* Find the smallest positive missing number in an array that contains
  all positive integers */
int findMissingPositive(int arr[], int size)
{
  int i;
  // Mark arr[i] as visited by making arr[arr[i] - 1] negative. Note that 
  // 1 is subtracted because index start from 0 and positive numbers start from 1
  for(i = 0; i < size; i++)
  {
    if(abs(arr[i]) - 1 < size && arr[abs(arr[i]) - 1] > 0)
      arr[abs(arr[i]) - 1] = -arr[abs(arr[i]) - 1];
  }
 
  // Return the first index value at which is positive
  for(i = 0; i < size; i++)
    if (arr[i] > 0)
      return i+1;  // 1 is added becuase indexes start from 0
 
  return size+1;
}
 
/* Find the smallest positive missing number in an array that contains
  both positive and negative integers */

int firstMissingPositive(int* A, int n1) {
   int shift = segregate (A,n1);
 
   // Shift the array and call findMissingPositive for
   // positive part
   return findMissingPositive(A+shift, n1-shift);
}
