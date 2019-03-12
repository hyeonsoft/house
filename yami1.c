#include <windows.h>
linenum;i;
void line(const int which){
	int a,u;
	if(which==1){
		for(a=linenum%4;a>0;a--){
			printf("+---------------");
		}
		printf("+");
	}else{
		printf("+---------------");
		printf("+---------------");
		printf("+---------------");
		printf("+---------------+");
	}
	printf("\n");
}
void printmulti(const int x, const int y){
	printf("l%2dx%3d = %4d  ",x,y,x*y);
}
main(u){
	int now=1;
	printf("number : ");
	scanf("%d",&linenum);
	line((linenum/4)+1);
	for(u=((linenum/4)+1);u>0;u--){
		int x=now;
		int end=(now+3>linenum?linenum:now+3);
		int row=1;
		for(;row<=end;row++){
			for(x=now;x<=end;x++){
				if(row<=x){
					printmulti(x,row);
				}else{
					printf("l               ");
				}
			}
			printf("l\n");
		}
		now+=4;
		line(u);
	}
	system("pause");
}
