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
	cin>>key;

	for(int j=0; j<x; j++) {
		if(key==arr[j]) {
				y=true;
			cout<<j;
			break;
		}
	}
	if(y==false) {
		cout<<-1;
	}

}



