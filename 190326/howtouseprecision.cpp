#include <iostream>
#include <iomanip>

using namespace std;

int main() {
	int a;
	cin >> a;
	cout << setprecision(2) << fixed << a * a*3.14;
	//setprecision : 정밀도
	//fixed : 정밀도를 소수점 첫자리부터 세겠다
}
