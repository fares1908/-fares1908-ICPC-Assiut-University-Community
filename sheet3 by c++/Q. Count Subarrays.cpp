#include <iostream>

using namespace std;
int main() {
	int t;
	cin>>t;

	while(t--) {
		int size;
		int counter =0;
		cin>>size;
		int arr[size];
		for(int i=0 ; i<size; i++) {
			cin>>arr[i];
		}
		for(int i=0; i<size; i++) {
			for(int j=i; j<size; j++) {
				if(arr[j]>=arr[j-1])
					counter ++;
				else
					break;

			}
		}
		cout<<counter+size<<endl;
	}

}
