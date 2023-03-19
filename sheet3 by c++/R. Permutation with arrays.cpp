#include<bits/stdc++.h>
using namespace std;
int main() {
	int x;
	int token=0;
	cin>>x;
	int arr[x];
	int arr1[x];
	for(int i=0; i<x; i++) {

		cin>>arr[i];
	
 }
 	for(int i=0; i<x; i++) {

		cin>>arr1[i];
	
 }
      sort(arr,arr+x);
      
      sort(arr1,arr1+x);
      for(int i=0;i<x;i++){
      	if(arr[i]!=arr1[i]){
      		cout<<"no";
      		return 0;
		  }
	  }
	  cout<<"yes";

}
   
