#include<bits/stdc++.h>
using namespace std;
int main() {
	int x;
	bool flag=false;
	cin>>x;
	int arr[x];
	for(int i=0; i<x; i++) {
		
		cin>>arr[i];
	}
	
	for(int y=0;y<=x/2;y++){
		if(arr[y] !=arr[x-1-y]){
		
		flag=true;
		break;
	}
}
	if(flag==false){
		cout<<"YES\n";
	}else{
		cout<<"No\n";
	}
	
	
}
