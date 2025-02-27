#include <iostream>
#include <cstring>
using namespace std;

class Nr_Tel {
public:
    char nr_tel[20];
    char nazwisko[20];
    char imie[12];
};

class Ksiazka_Tel {
public:
    static int licznik;
    Nr_Tel numery[50];

    Ksiazka_Tel() {
        licznik = 0;
    }

    void dodajNumer(const char* nr_tel, const char* nazwisko, const char* imie) {
        if (licznik < 50) {
            strncpy(numery[licznik].nr_tel, nr_tel, 20);
            strncpy(numery[licznik].nazwisko, nazwisko, 20);
            strncpy(numery[licznik].imie, imie, 12);
            licznik++;
        } else {
            cout << "Brak miejsca w ksiazce telefonicznej!" << endl;
        }
    }

    void usunNumer(const char* nazwisko) {
        for (int i = 0; i < licznik; ++i) {
            if (strcmp(numery[i].nazwisko, nazwisko) == 0) {
                for (int j = i; j < licznik - 1; ++j) {
                    numery[j] = numery[j + 1];
                }
                licznik--;
                cout << "Numer usuniety." << endl;
                return;
            }
        }
        cout << "Nie znaleziono numeru o podanym nazwisku." << endl;
    }

    void wyszukajNumer(const char* nazwisko) {
        for (int i = 0; i < licznik; ++i) {
            if (strcmp(numery[i].nazwisko, nazwisko) == 0) {
                cout << "Znaleziono numer: " << numery[i].nr_tel << endl;
                return;
            }
        }
        cout << "Nie znaleziono numeru o podanym nazwisku." << endl;
    }

    void wyswietlWszystkie() {
        for (int i = 0; i < licznik; ++i) {
            cout << "Numer: " << numery[i].nr_tel << ", Nazwisko: " << numery[i].nazwisko << ", Imie: " << numery[i].imie << endl;
        }
    }
};

int Ksiazka_Tel::licznik = 0;

int main() {
    Ksiazka_Tel ksiazka;

    ksiazka.dodajNumer("123456789", "Kowalski", "Jan");
    ksiazka.dodajNumer("987654321", "Nowak", "Adam");

    cout << "Wszystkie numery:" << endl;
    ksiazka.wyswietlWszystkie();

    cout << "\nWyszukiwanie numeru o nazwisku Kowalski:" << endl;
    ksiazka.wyszukajNumer("Kowalski");

    cout << "\nUsuwanie numeru o nazwisku Kowalski:" << endl;
    ksiazka.usunNumer("Kowalski");

    cout << "\nWszystkie numery po usunieciu:" << endl;
    ksiazka.wyswietlWszystkie();

    return 0;
}
