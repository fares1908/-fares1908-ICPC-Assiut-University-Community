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
	key=arr[0];
	for(int j =0;j<x;j++){
		if(key>arr[j]){
		key=arr[j]; 
	    counter=j;
	
	}

}
	cout<<key<<" "<<(counter+1);

}



