#include <stdio.h>
int fibonaccirec(int n){
if(n<2) return n;
else return fibonaccirec(n-2)+fibonaccirec(n-1);
}
main(){
printf("Informe o n�mero");
int num;
scanf("%d", &num);
int fib = fibonaccirec(num);
printf("%d", fib);
}
