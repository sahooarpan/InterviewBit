include<stdio.h>

void Maximumelement(int arr[], int n, int k)
{
	int j, max,i;
printf("\nmaximum for each and every contiguous subarray of size %d is=\n",k);
	for (i = 0; i <= n-k; i++)
	{
		max = arr[i];

		for (j = 1; j < k; j++)
		{
			if (arr[i+j] > max)
			max = arr[i+j];
		}
		printf("%d ", max);
	}
}
void display(int input[], int size)
{
	int i;
	for (i = 0; i < size; i++)
		printf("%d\t",input[i]);

}


int main()
{

	int size, index, *array;
printf("Enter number of Elements in an array \n");
scanf("%d", &size);

array = (int *) malloc(sizeof(int) * size);
printf("Enter elements to array\n");
for(index = 0; index < size; index++)
scanf("%d", &array[index]);
printf("Before arranging the array elements are :\n");
display(array,size);


	int k = 3;
	Maximumelement(array, size, k);
	return 0;
}
