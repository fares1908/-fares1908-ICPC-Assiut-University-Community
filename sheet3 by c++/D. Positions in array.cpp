#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
	int x;
	cin>>x;
	int arr[x];
	for(int i=0; i<x; i++) {
		cin>>arr[i];
	}
	for(int j =0;j<x;j++){
		if(arr[j]<10){
		cout<<"A["<<j<<"] = "<< arr[j]<<endl;
	}
}
	

}



