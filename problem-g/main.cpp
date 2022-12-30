#include <bits/stdc++.h>

using namespace std;

class gift{

    public:
        string name;
        int value;
        int approving;
};

void sort_gifts(vector<gift> arr, int b)
{
    int totalSum = 0;

    //comparator lambda function
    auto comp = [](gift a, gift b) {
        //comparison logic
        if (a.value < b.value)
            return false;
        else if (a.value > b.value)
            return true;
        else { // when value are same
            if (a.approving > b.approving) {
                return false;
            }
            else
                return true;
        }
    };

    priority_queue<gift, vector<gift>, decltype(comp)> pq(comp);

    for (auto& ij : arr) {
        pq.push(ij);
    }

    //printing the sorted list
    //printf("-------------------------\n");

    while (!pq.empty()) {
        if(pq.top().value <= b && (pq.top().value + totalSum) <= b){
            cout << pq.top().name << "\n"; // << " " << pq.top().value << "\n";
            totalSum += pq.top().value;
        }
        pq.pop();
    }
}


int main()
{
    int a,b;
    string x;
    int y, z;

    scanf("%d %d",&a, &b);

    vector<gift> arr(a);

    for (int i = 0; i < a; i++) {

        cin >> x >> y >> z;
        arr[i].name = x;
        arr[i].value = y;
        arr[i].approving = z;
    }

    sort_gifts(arr,b);
    return 0;
}
