#include<stdio.h>
    #include<string.h>
 char a[1000],b[1000];
 int n;
 int size(char a[]){
   int k=0;
   for(k=0;a[k]!='\0';k++)
     k=k+1;
     return k-1;
 }
 void compressed(int i,int j){
   int k=0;
   if(i==0){
       for(k=0;a[k]!='\0';k++)
            b[k]=a[k];

     k=0;
   }
   else{
     if(j<=size(b)){
       while(a[k]!='\0'){
         b[j]=a[k];
        j++;
         k++;;
       }
       b[j]='\0';
     }
   }
 }
 int main(){
   int i=0,k=0;

   scanf("%d",&n);
   if(n>=1 && n<=1000){
     scanf("\n");

     fgets(a,1000,stdin);
     compressed(i,0);
     for(i=1;i<n;i++){
       scanf("%d\n",&k);

       fgets(a,1000,stdin);
       compressed(i,k);
     }
       for(k=0;b[k]!='\0';k++)

       printf("%c",b[k]);


   }
     return 0;
 }
