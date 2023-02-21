#include<bits/stdc++.h>
using namespace std;
int main() {
	int k;
	cin>>k;
	while(k--) {
		long long sum =0;
		long long min=10e9;

		int x;
		cin>>x;
		int arr[x];
		for(int i=0; i<x; i++) {

			cin>>arr[i];
		}
		for(int i=0; i<x; i++) {
			for(int j=i+1; j<x; j++) {
				sum=arr[i]+arr[j]+(j+1)-(i+1);
				if(sum<min)
					min=sum;
				sum=0;



			}


		}
		cout<<min<<endl;
	}
	return 0;

}


