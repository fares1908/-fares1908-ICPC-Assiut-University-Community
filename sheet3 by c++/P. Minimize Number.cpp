#include<bits/stdc++.h>
using namespace std;
int main() {
	int x;
	bool token =false;
	int num;
	int minn=1e5;
	cin>>x;
	int arr[x];
	for (int i=0; i<x; i++) {
		cin>>arr[i];
	}
		for (int i=0; i<x; i++){
			num=0;
			while(arr[i]%2==0){
				num++;
				arr[i]/=2;
			}
			minn=min(num,minn);
		
		}
		cout<<minn;
	
	
	cout<<minn;

}
