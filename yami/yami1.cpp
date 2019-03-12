#include <iostream>
#include <iomanip>
int i, linenum;
void line(const int which) {
	int a;
	if (which == 1) {
		for (a = linenum % 4; a>0; a--) {
			std::cout << "+---------------";
		}
		std::cout << "ㅓ";
	}
	else {
		std::cout << "+---------------+---------------+---------------+---------------ㅓ";
	}
	std::cout << std::endl;
	return;
}
void getlinenum() {
	std::cout << "How many?";
	std::cin >> linenum;
}
void printmulti(const int x, const int y) {
	std::cout<<"l" << std::setw(2)<<x<<"x"<<std::setw(3)<<y<<" = "<<std::setw(4)<<x*y<<"  ";
	return;
}
void gugudan() {
	int u, now = 1;
	line((linenum / 4) + 1);
	for (u = ((linenum / 4) + 1); u>0; u--) {
		if (u == 1 && !(linenum % 4))return;
		int x = now;
		int end = (now + 3>linenum ? linenum : now + 3);
		int row = 1;
		for (; row <= end; row++) {
			for (x = now; x <= end; x++) {
				if (row <= x) {
					printmulti(x, row);
				}
				else {
					std::cout << "l               ";
				}
			}
			std::cout << "l" << std::endl;
		}
		now += 4;
		line(u);
	}
}
int main() {
	std::cout << "Hello World!" << std::endl;
	getlinenum();
	gugudan();
	return 0;
}
