#include <stdio.h>


void changeP(int *&p) {
	p++;
	printf("%x\n", p);
}

int main(int argc, char **argv) {
	int *pNum;
	int num = 1;

	pNum = &num;
	printf("��һ��pNum��λ��\n");
	printf("%x\n", pNum);
	printf("����changeP����\n");
	changeP(pNum);
	printf("�ı��pNum��λ��\n");
	printf("%x", pNum);
}