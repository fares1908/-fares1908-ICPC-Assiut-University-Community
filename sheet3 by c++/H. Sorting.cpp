#include<bits/stdc++.h>
using namespace std;
int main() {
	int x;
	int token=0;
	cin>>x;
	int arr[x];
	for(int i=0; i<x; i++) {

		cin>>arr[i];
	}
	for(int i=0 ; i<x; i++) {

		for(int j=i-1; j>=0; j--) {
			if(arr[j]>arr[j+1]) {

				token=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=token;

			}
		}
	}
	for(int i =0 ;i<x;i++){
		cout<<arr[i];
	}
}



