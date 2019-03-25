#include <stdio.h>


void changeP(int *&p) {
	p++;
	printf("%x\n", p);
}

int main(int argc, char **argv) {
	int *pNum;
	int num = 1;

	pNum = &num;
	printf("第一次pNum的位置\n");
	printf("%x\n", pNum);
	printf("调用changeP函数\n");
	changeP(pNum);
	printf("改变后pNum的位置\n");
	printf("%x", pNum);
}