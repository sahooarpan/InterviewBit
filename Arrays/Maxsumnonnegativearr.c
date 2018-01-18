int* maxset(int* A, int n1, int *length_of_array) {
    *length_of_array = n1;
    int * ret = (int *) malloc(sizeof(int) * *length_of_array);
     
    long long sum = 0, maxSum = 0, count = 0, maxCount = 0, i = -1, startIdx = 0;
      
    while(i < n1)
    {
        i++;
        startIdx = i;
        sum = 0;
        count = 0;
        while(i < n1 && A[i] >= 0)
        {
            sum += (long long)A[i++];
            count++;
        }
        if (sum > maxSum || (sum == maxSum && count > maxCount))
        {
            maxSum = sum;
            maxCount = count;
            memcpy(ret, A + startIdx, sizeof(int) * maxCount);
        }
        
    }
     
     *length_of_array = maxCount;
      return ret;
     
}
