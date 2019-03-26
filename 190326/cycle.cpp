#include <iostream>

using namespace std;

int cycle(int i) {
	int a, b;
	a = i / 10; b = i % 10;
	return (a + b) % 10 + b * 10;
}

int main() {
	while (1) {
		int a;
		int i = 0;
		int u;
		cin >> a;
		u = a;
		while (++i) {
			u = cycle(u);
			if (u == a)break;
		}
		cout << i << endl;
	}
}
