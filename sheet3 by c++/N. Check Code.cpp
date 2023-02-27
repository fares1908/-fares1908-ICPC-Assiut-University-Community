#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
	int a , b;
	int flage =0;
    string s;
    cin>>a>>b;
    cin>>s;
    for(int i =0;i<s.length();i++){
    	if(s[i]=='-')
    	{
    		flage=i;
		}
	}
	if(flage==a&&s.length()-(flage+1)==b){
		cout<<"Yes";
	}
	else{
		cout<<"No";
	}
}
