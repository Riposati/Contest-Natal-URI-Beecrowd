#include <iostream>
#include <map>
#include <algorithm>
#include <cctype>
#include <string>

using namespace std;

int main()
{
    map<char, int> mapSolution;

    int testCases, howManyStrings;
    int contQtsChristmas = 0;
    string str;

    scanf("%d",&testCases);

    while (testCases > 0) {

        mapSolution.insert(make_pair('m', 0));
        mapSolution.insert(make_pair('e', 0));
        mapSolution.insert(make_pair('r', 0));
        mapSolution.insert(make_pair('y', 0));
        mapSolution.insert(make_pair('c', 0));
        mapSolution.insert(make_pair('h', 0));
        mapSolution.insert(make_pair('i', 0));
        mapSolution.insert(make_pair('s', 0));
        mapSolution.insert(make_pair('t', 0));
        mapSolution.insert(make_pair('a', 0));

        scanf("%d",&howManyStrings);

        getchar();

        for (int j = 0; j < howManyStrings; j++) {

            getline(cin, str);

            transform(str.begin(), str.end(), str.begin(), ::tolower);

            for (int i = 0; i < str.size(); i++) {

                if (mapSolution.find(str[i]) != mapSolution.end()) {

                    mapSolution.find(str[i])->second = mapSolution.find(str[i])->second + 1;

                    if (mapSolution.find('a')->second >= 1 &&
                        mapSolution.find('r')->second >= 3 &&
                        mapSolution.find('c')->second >= 1 &&
                        mapSolution.find('s')->second >= 2 &&
                        mapSolution.find('t')->second >= 1 &&
                        mapSolution.find('e')->second >= 1 &&
                        mapSolution.find('h')->second >= 1 &&
                        mapSolution.find('y')->second >= 1 &&
                        mapSolution.find('i')->second >= 1 &&
                        mapSolution.find('m')->second >= 2) {

                            contQtsChristmas++;

                            mapSolution.find('a')->second =  mapSolution.find('a')->second - 1;
                            mapSolution.find('r')->second =  mapSolution.find('r')->second - 3;
                            mapSolution.find('c')->second =  mapSolution.find('c')->second - 1;
                            mapSolution.find('s')->second =  mapSolution.find('s')->second - 2;
                            mapSolution.find('t')->second =  mapSolution.find('t')->second - 1;
                            mapSolution.find('e')->second =  mapSolution.find('e')->second - 1;
                            mapSolution.find('h')->second =  mapSolution.find('h')->second - 1;
                            mapSolution.find('y')->second =  mapSolution.find('y')->second - 1;
                            mapSolution.find('i')->second =  mapSolution.find('i')->second - 1;
                            mapSolution.find('m')->second =  mapSolution.find('m')->second - 2;
                    }
                }
            }
        }
        testCases--;
    }

    printf("%d\n",contQtsChristmas);

    return 0;
}
