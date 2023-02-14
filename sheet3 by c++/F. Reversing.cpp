#include<bits/stdc++.h>
using namespace std;
int main() {
	int x;
	bool flag=false;
	int counter =0;
	cin>>x;
	int key=0;
	int arr[x];
	for(int i=0; i<x; i++) {
		cin>>arr[i];
	}
	for(int i=x-1;i>=0;i--){
		cout<<arr[i]<<" ";
	}
}
