#include teste1
#include teste2
#include teste3
#include "string"

using namespace std;


int main() {
    float pos_zero = 0;
    float pos_one = 1;
    Robot r_one = robot ("r_one", 0);
    Robot r_two = robot ("r_two", 1);
    bool expr_one = true;
    bool expr_two = (1 == 2);
    float num = 0;
    float even = 0;
    if (expr_one == expr_two) {
         num = num + 1;

    }
    while (num != 500) {
        if ((num % 2) == 0) {
             even = even + 1;

        }
         num = num + 1;

    }

}