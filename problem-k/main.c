#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int d,t;

    long long sTAP; // sTAP = sum of terms in an arithmetic progression

    scanf("%d",&t);

    while(t > 0){

        scanf("%ld",&d);

        sTAP = ((pow(d,2)*(1 + pow(d,2))) / 2) * pow(d,2);

        printf("%llu\n",sTAP);

        t--;
    }

    return 0;
}
