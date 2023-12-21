#include <iostream>
#include <cmath>

using namespace std;


int main() {
    int n;
    cin >> n;

    n = n > 1000 ? 1000 : n;

    
    double prob = 0.0;
    double fact = 1.0;
    for(int i = 0; i < n + 1; i++)
    {
        if (i > 0)
        {
            fact *= i;
        }

        prob += pow(-1, i) / fact;
    }
    cout << 1 - prob << endl;
    return 0;
}