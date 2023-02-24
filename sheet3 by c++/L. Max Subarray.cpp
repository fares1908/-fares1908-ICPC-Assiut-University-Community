#include<bits/stdc++.h>
using namespace std;
int main() {
	int t;
	cin>>t;
	while(t--) {
		int x;
		cin>>x;
		int arr[x];
		for(int j=0; j<x; j++) {

			cin>>arr[j];
		}
		for(int i=0;i<x;i++){
			for(int r=i;r<x;r++){
					int max=-1e5;
				for(int l =i;l<=r;l++){ 
					if(arr[l]>max)
					max=arr[l];
				}
				cout<<max<<" ";
			}
		}
		cout<<endl; 
	}
}
//
