#include <iostream>
#include <fstream>
using namespace std;

int main () {
    ofstream WriteFile("file.txt");
    string row;
    WriteFile << "Dopisanie do pliku";
    ifstream ReadFile("file.txt");
    while (getline(ReadFile, row)) {

        cout << row;
    }

    ReadFile.close();
    WriteFile.close();
}
