#include<bits/stdc++.h>
using namespace std;
int main() {
	int r;
	int c ;
	bool flag=false;
	cin>>r>>c;
	int arr[r][c];
	for(int j=0; j<r; j++) {

		for(int i =0; i<c; i++)

			cin>>arr[j][i];
	}
	int key;
     cin>>key;
	for(int j=0; j<r; j++) {

		for(int i =0; i<c; i++)

			if(arr[j][i]==key)
			flag=true;
			 
			}
		
			if(flag==false){
				cout<<"will take number";
			}else{
				cout<<"will not take number";
			}

}
