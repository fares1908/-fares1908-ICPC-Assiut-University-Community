#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
	int x;
	bool y=false;
	int key;
	cin>>x;
	int arr[x];
	for(int i=0; i<x; i++) {
		cin>>arr[i];
	}
	for(int j=0; j<x; j++) {
		if(arr[j]>0) {
		arr[j]=1;
		}else if(arr[j]==0){
			arr[j]=0;
		}else{
			arr[j]=2;
		}
	}
		for(int j=0; j<x; j++) {
		cout<<arr[j]<<" ";
	}
	

}



