void addOne(vector<int>& num)
{
    int carry = 1;
    for (int i = num.size() - 1; i >= 0; i--) {
        int sum = num[i] + carry;
        if (sum == 10)
            carry = 1;
        else
            carry = 0;
        num[i] = sum % 10;
    }
 
    // case when all elements are 9
    if (carry == 1)
        num.insert(num.begin(), 1);
 
    // print the resulting vector
    for (auto x : num)
        cout << x << " ";
    cout << endl;
}