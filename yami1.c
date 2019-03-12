#include <stdio.h>
#include <windows.h>
int i,linenum;
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
	return;
}
void printmulti(const int x, const int y){
	printf("l%2dx%3d = %4d  ",x,y,x*y);
	return;
}
int main(){
	int u,now=1;
	printf("number : ");
	scanf("%d",&linenum);
	line((linenum/4)+1);
	for(u=((linenum/4)+1);u>0;u--){
		if(u==1&&!(linenum%4))return 0;
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
	return 0;
}
