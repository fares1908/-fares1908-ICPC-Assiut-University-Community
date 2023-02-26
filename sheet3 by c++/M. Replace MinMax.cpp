#include<bits/stdc++.h>
using namespace std;
int main() {
	int x;
	int token =0;
	cin>>x;
	int minn=1e5;
	int maxx=-1e5;
	int arr[x];
	for(int i=0; i<x; i++) {

		cin>>arr[i];
		minn=min(minn,arr[i]);
		maxx=max(maxx,arr[i]);
	}
	int f ,s;
	for(int i =0; i<x; i++) {
		if(arr[i]==maxx)
			f=i;
		else if(arr[i]==minn)
			s=i;
		}
		token=arr[f];
		arr[f]=arr[s];
		arr[s]=token;
		for(int i=0;i<x;i++){
			cout<<arr[i]<<" ";
		}
}
