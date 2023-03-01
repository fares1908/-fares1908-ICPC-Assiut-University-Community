#include<iostream>
#include<bits/stdc++.h>
using namespace std;
//int fob(int x){
//	if(x==1)return 0;
//	if(x==2)return 1;
//	else{
//	
//	return 	fob(x-1) +fob(x-2);
//}
//	}
int main() {
	int z;
	cin>>z;
	int arr[55];
	arr[1]=0;
	arr[2]=1;
	for(int i =3;i<=z;i++){
		arr[i]=arr[i-1]+arr[i-2];
	}
	cout<<arr[z];
	
}
  
